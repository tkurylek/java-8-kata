package pl.kurylek.katas.java8.streams.exercises;

import pl.kurylek.katas.java8.streams.CollectItShould;
import pl.kurylek.katas.java8.streams.exceptions.ImplementationThereExpectedWas;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectItShouldImpl implements CollectItShould {
	@Override
	public Map<Integer, Person> convertToMap(Person... people) {
		throw new ImplementationThereExpectedWas();
	}

	@Override
	public Set<Person> convertToSet(Person... people) {
		throw new ImplementationThereExpectedWas();
	}

	@Override
	public List<Person> convertToList(Iterable<Person> collection) {
		throw new ImplementationThereExpectedWas();
	}

	@Override
	public List<Person> convertToList(Person... people) {
		throw new ImplementationThereExpectedWas();
	}
}
