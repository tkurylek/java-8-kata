package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.MapUnderagePeopleItShould;
import pl.kurylek.katas.java8.streams.stubs.Child;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class MapUnderagePeopleItShouldCorrectImpl implements MapUnderagePeopleItShould {

	@Override
	public List<Child> findUnderagePeople(Person... people) {
		return asList(people).stream().filter(person -> person.getAge() < 18).map(Person::getName).map(Child::new)
				.collect(toList());
	}
}
