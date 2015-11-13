package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.Person;

public interface JoinPeopleItShould {
	String PREFIX = "Space Invaders: ";
	String SEPARATOR = ", ";
	String SUFFIX = ".";

	String joinPeopleByNameWithPrefixAndSuffix(Person... people);

	String joinPeopleByName(Person... people);
}
