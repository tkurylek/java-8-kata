package pl.kurylek.katas.java8.streams.exercises;

import pl.kurylek.katas.java8.streams.FlatMapItShould;
import pl.kurylek.katas.java8.streams.exceptions.ImplementationThereExpectedWas;

import java.util.List;

public class FlatMapItShoutImpl implements FlatMapItShould {

	@Override
	public List<String> flatten(List<List<String>> collection) {
		throw new ImplementationThereExpectedWas();
	}

	@Override
	public List<Integer> extractNumbers(String numbers) {
		throw new ImplementationThereExpectedWas();
	}
}
