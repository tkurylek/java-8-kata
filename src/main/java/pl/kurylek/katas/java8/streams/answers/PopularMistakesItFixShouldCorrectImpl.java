package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.PopularMistakesItFixShould;

import static java.lang.System.out;
import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.of;

public class PopularMistakesItFixShouldCorrectImpl implements PopularMistakesItFixShould {
	@Override
	public void problem1() {
		of(1, 2).forEach(out::println);
		of(1, 2).forEach(out::println);
	}

	@Override
	public void problem2() {
		iterate(0, i -> i + 1).limit(10).forEach(out::println);
	}

	@Override
	public void problem3() {
		iterate(0, i -> (i + 1) % 2).parallel().limit(10).distinct().forEach(out::println);
	}

	@Override
	public int[] problem4() {
		return iterate(0, i -> i + 1).skip(5).limit(10).toArray();
	}
}
