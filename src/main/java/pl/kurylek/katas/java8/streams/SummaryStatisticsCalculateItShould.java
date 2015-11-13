package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.IntSummaryStatistics;

public interface SummaryStatisticsCalculateItShould {

	IntSummaryStatistics statisticsOf(Person... people);
}
