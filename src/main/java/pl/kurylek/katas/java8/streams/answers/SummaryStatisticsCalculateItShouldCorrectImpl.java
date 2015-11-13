package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.SummaryStatisticsCalculateItShould;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.IntSummaryStatistics;

import static java.util.Arrays.asList;

public class SummaryStatisticsCalculateItShouldCorrectImpl implements SummaryStatisticsCalculateItShould {
	@Override
	public IntSummaryStatistics statisticsOf(Person... people) {
		return asList(people).stream().mapToInt(Person::getAge).summaryStatistics();
	}
}
