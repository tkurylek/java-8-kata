package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.FlatMapItShould;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class FlatMapItShoutCorrectImpl implements FlatMapItShould {

	private static final String BY_COMMA = ",";
	private static final String BY_NEW_LINE = "\n";

	@Override
	public List<String> flatten(List<List<String>> collection) {
		return collection.stream().flatMap(Collection::stream).collect(toList());
	}

	@Override
	public List<Integer> extractNumbers(String numbers) {
		return asList(numbers.split(BY_COMMA)).stream().flatMap(numbersWithNewLines -> asList(numbersWithNewLines
				.split(BY_NEW_LINE)).stream()).map(Integer::valueOf).collect(toList());
	}
}
