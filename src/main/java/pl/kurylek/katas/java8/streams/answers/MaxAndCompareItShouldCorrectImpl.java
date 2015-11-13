package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.MaxAndCompareItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;

public class MaxAndCompareItShouldCorrectImpl implements MaxAndCompareItShould {

	@Override
	public Person findYoungestPerson(Person... people) {
		return asList(people).stream().min(comparing(Person::getAge)).get();
	}

	@Override
	public int findOldestPersonAge(Person... people) {
		return asList(people).stream().mapToInt(Person::getAge).max().getAsInt();
	}
}
