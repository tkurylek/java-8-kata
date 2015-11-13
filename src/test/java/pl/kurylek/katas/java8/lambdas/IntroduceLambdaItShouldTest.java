package pl.kurylek.katas.java8.lambdas;

import org.junit.Test;
import pl.kurylek.katas.java8.stubs.Cat;
import pl.kurylek.katas.java8.stubs.Duck;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.invoke.LambdaMetafactory.metafactory;
import static java.lang.invoke.MethodHandles.lookup;
import static java.lang.invoke.MethodType.methodType;
import static org.assertj.core.api.Assertions.assertThat;
import static pl.kurylek.katas.java8.lambdas.BetterExceptionCatcher.when;
import static pl.kurylek.katas.java8.lambdas.ExceptionCatcher.tryToCatch;

public class IntroduceLambdaItShouldTest {

	IntroduceLambdaItShould introduceLambdaItShould = new IntroduceLambdaItShould();

	@Test
	public void shouldCatchExceptionUsingExceptionCatcher() {
		// when
		Exception caughtException = tryToCatch(Exception.class, new ExceptionalOperation() {

			@Override
			public void operate() throws Exception {
				introduceLambdaItShould.throwExceptionImmediately();
			}
		});

		// then
		assertThat(caughtException).isNotNull();
	}

	@Test
	public void shouldCatchExceptionUsingBetterExceptionCatcher() {
		// when
		Exception caughtException = when(new ExceptionalOperation() {

			@Override
			public void operate() throws Exception {
				introduceLambdaItShould.throwExceptionImmediately();
			}
		}).tryToCatch(Exception.class);

		// then
		assertThat(caughtException).isNotNull();
	}

	@Test
	public void shouldPushIfConditionIsMet() {
		// given
		Stack<String> stackOfStrings = new Stack<>();

		// when
		ConditionalStack.of(stackOfStrings).when(new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.isEmpty();
			}
		}).push("abc", "ab", "a", "abcd", "");

		// then
		assertThat(stackOfStrings).containsOnly("");
	}

	@Test
	public void shouldHandleAmbitiousCalls() {
		// when
		String aResult = introduceLambdaItShould.smallTypesConflict(new IntroduceLambdaItShould.A() {
			@Override
			public String a() {
				return "a";
			}
		});
		String bResult = introduceLambdaItShould.smallTypesConflict(new IntroduceLambdaItShould.B() {
			@Override
			public String b() {
				return "b";
			}
		});

		// then
		assertThat(aResult).isEqualTo("a");
		assertThat(bResult).isEqualTo("b");
	}

	@Test
	public void shouldPresentTheDifferenceBetweenLambdaAndAIC1() {
		// when
		introduceLambdaItShould.acceptMultipleMethodsInterface(new MultipleMethodsInterface() {
			@Override
			public void a() {
			}

			@Override
			public void b() {
			}
		});
		// then it compiles
	}

	@Test
	public void shouldPresentTheDifferenceBetweenLambdaAndAIC2() {
		// when
		introduceLambdaItShould.acceptMultipleMethodsInterfaceWithDefault(new MultipleMethodsInterfaceWithDefault() {
			@Override
			public void a() {
			}

			@Override
			public void b() {
			}
		});

		// then it compiles
	}

	@Test
	public void shouldPresentTheDifferenceBetweenLambdaAndAIC3() {
		// given
		Class<?> selfClassName = this.getClass();

		// when
		Class<?> result = introduceLambdaItShould.supply(new Supplier<Class<?>>() {
			@Override
			public Class<?> get() {
				return this.getClass();
			}
		});

		// then it compiles
		assertThat(result).isNotEqualTo(selfClassName);
	}

	@Test
	public void shouldCatQuackLikeADuckUsingMethodReference() {
		// given
		Duck duck = new Duck();

		// when
		Cat cat = duck::quack;

		// then cat quacks
		assertThat(cat.meow()).isEqualTo(duck.quack());
	}

	@Test
	public void shouldCatQuackLikeADuckUsingInvokeDynamic() throws Throwable {
		// given
		Duck duck = new Duck();
		MethodType sound = methodType(String.class);
		MethodHandle quack = lookup().findVirtual(Duck.class, "quack", sound);
		CallSite site = metafactory(lookup(), "meow", methodType(Cat.class, Duck.class), sound, quack, sound);
		MethodHandle factory = site.getTarget().bindTo(duck);

		// when
		Cat cat = (Cat) factory.invoke();

		// then cat quacks
		assertThat(cat.meow()).isEqualTo(duck.quack());
	}
}
