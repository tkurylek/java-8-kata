package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.CollectItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.StreamSupport.stream;

public class CollectItShouldCorrectImpl implements CollectItShould {

	@Override
	public Map<Integer, Person> convertToMap(Person... people) {
		return stream(people).collect(toMap(Person::getAge, identity()));
	}

	@Override
	public Set<Person> convertToSet(Person... people) {
		return stream(people).collect(toSet());
	}

	@Override
	public List<Person> convertToList(Iterable<Person> collection) {
		return stream(collection.spliterator(), false).collect(toList());
	}

	@Override
	public List<Person> convertToList(Person... people) {
		return stream(people).collect(toList());
	}
}
