package pl.kurylek.katas.java8.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IntroduceLambdaItShould {

	public void throwExceptionImmediately() throws Exception {
		throw new Exception();
	}

	public String smallTypesConflict(A a) {
		return a.a();
	}

	public String smallTypesConflict(B b) {
		return b.b();
	}

	public void acceptMultipleMethodsInterface(MultipleMethodsInterface multipleMethodsInterface) {
	}

	public void acceptMultipleMethodsInterfaceWithDefault(MultipleMethodsInterfaceWithDefault multipleMethodsInterfaceWithDefault) {
	}

	public Class<?> supply(Supplier<Class<?>> supplier) {
		return supplier.get();
	}

	public interface A {
		String a();
	}

	public interface B {
		String b();
	}
}
