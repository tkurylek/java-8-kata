package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.SumAndReduceItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import static java.util.Arrays.asList;

public class SumAndReduceItShouldCorrectImpl implements SumAndReduceItShould {
	@Override
	public int calculateTotalAge(Person... people) {
		return asList(people).stream().mapToInt(Person::getAge).reduce((a, b) -> a + b).getAsInt();
	}

	@Override
	public double calculateAverageAge(Person... people) {
		return asList(people).stream().mapToDouble(Person::getAge).average().getAsDouble();
	}
}
