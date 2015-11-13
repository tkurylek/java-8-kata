package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.JoinPeopleItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

public class JoinPeopleItShouldCorrectImpl implements JoinPeopleItShould {

	@Override
	public String joinPeopleByName(Person... people) {
		return asList(people).stream().map(Person::getName).collect(joining(SEPARATOR));
	}

	@Override
	public String joinPeopleByNameWithPrefixAndSuffix(Person... people) {
		return asList(people).stream().map(Person::getName).collect(joining(SEPARATOR, PREFIX, SUFFIX));
	}
}
