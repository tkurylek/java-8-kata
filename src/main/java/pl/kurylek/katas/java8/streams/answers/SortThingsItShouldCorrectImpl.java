package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.SortThingsItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class SortThingsItShouldCorrectImpl implements SortThingsItShould {

	@Override
	public List<String> sortAlphabetically(String... fruits) {
		return asList(fruits).stream().sorted().collect(toList());
	}

	@Override
	public List<Person> sortByAge(Person... people) {
		return asList(people).stream().sorted().collect(toList());
	}
}
