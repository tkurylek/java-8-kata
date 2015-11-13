package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.SeparateKidsFromAdultsItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.partitioningBy;

public class SeparateKidsFromAdultsItShouldCorrectImpl implements SeparateKidsFromAdultsItShould {
	@Override
	public Map<Boolean, List<Person>> separateKidsFromAdults(Person... people) {
		return asList(people).stream().collect(partitioningBy(person -> person.getAge() >= 18));
	}
}
