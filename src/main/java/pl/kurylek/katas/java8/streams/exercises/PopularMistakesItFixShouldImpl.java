package pl.kurylek.katas.java8.streams.exercises;

import pl.kurylek.katas.java8.streams.PopularMistakesItFixShould;

import java.util.stream.IntStream;

import static java.lang.System.out;
import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.of;

public class PopularMistakesItFixShouldImpl implements PopularMistakesItFixShould {

	@Override
	public void problem1() {
		IntStream stream = of(1, 2);
		stream.forEach(out::println);
		stream.forEach(out::println);
	}

	@Override
	public void problem2() {
		iterate(0, i -> i + 1).forEach(out::println);
	}

	@Override
	public void problem3() {
		iterate(0, i -> (i + 1) % 2).distinct().limit(10).forEach(out::println);
	}

	@Override
	public int[] problem4() {
		return iterate(0, i -> i + 1).limit(10).skip(5).toArray();
	}
}
