package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.JobTitle;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;

public interface GroupByJobTitleItShould {
	Map<JobTitle, List<Person>> groupByJobTitle(Person... people);
}
