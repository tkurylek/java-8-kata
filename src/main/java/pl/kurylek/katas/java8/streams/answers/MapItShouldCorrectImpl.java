package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.MapItShould;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class MapItShouldCorrectImpl implements MapItShould {

	@Override
	public List<String> mapToUpperCaseString(List<String> collection) {
		return collection.stream().map(String::toUpperCase).collect(toList());
	}

	@Override
	public List<Integer> mapToIntegers(List<String> collection) {
		return collection.stream().map(Integer::valueOf).collect(toList());
	}
}
