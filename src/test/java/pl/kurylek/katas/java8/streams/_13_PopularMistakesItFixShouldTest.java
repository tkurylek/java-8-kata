package pl.kurylek.katas.java8.streams;

import org.junit.Ignore;
import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.PopularMistakesItFixShouldImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class _13_PopularMistakesItFixShouldTest {

	PopularMistakesItFixShould popularMistakesItFixShould = new PopularMistakesItFixShouldImpl();

	@Test
	public void shouldFixProblem1() {
		// when
		IllegalStateException caughtException = null;
		try {
			popularMistakesItFixShould.problem1();
		} catch (IllegalStateException e) {
			caughtException = e;
		}
		// then
		assertThat(caughtException).isNull();
	}

	@Test
	@Ignore
	public void shouldFixProblem2() {
		// when
		popularMistakesItFixShould.problem2();

		// then it finishes
	}

	@Test
	@Ignore
	public void shouldFixProblem3() {
		// when
		popularMistakesItFixShould.problem3();

		// then it finishes
	}

	@Test
	public void shouldFixProblem4() {
		// when
		int[] ints = popularMistakesItFixShould.problem4();

		// then
		assertThat(ints).contains(5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	}
}
