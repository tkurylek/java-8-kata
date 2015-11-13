package pl.kurylek.katas.java8.streams.exercises;

import pl.kurylek.katas.java8.streams.SortThingsItShould;
import pl.kurylek.katas.java8.streams.exceptions.ImplementationThereExpectedWas;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;

public class SortThingsItShouldImpl implements SortThingsItShould {

	@Override
	public List<String> sortAlphabetically(String... fruits) {
		throw new ImplementationThereExpectedWas();
	}

	@Override
	public List<Person> sortByAge(Person... people) {
		throw new ImplementationThereExpectedWas();
	}
}
