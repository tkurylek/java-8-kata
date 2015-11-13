package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.FilterItShould;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterItShouldCorrectImpl implements FilterItShould {

	private static final String N_LETTER = "n";

	@Override
	public List<String> filterWordsWithoutN(List<String> collection) {
		return collection.stream().filter(s -> !s.contains(N_LETTER)).collect(toList());
	}
}
