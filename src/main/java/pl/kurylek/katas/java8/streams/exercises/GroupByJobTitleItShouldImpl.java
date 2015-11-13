package pl.kurylek.katas.java8.streams.exercises;

import pl.kurylek.katas.java8.streams.GroupByJobTitleItShould;
import pl.kurylek.katas.java8.streams.exceptions.ImplementationThereExpectedWas;
import pl.kurylek.katas.java8.streams.stubs.JobTitle;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;

public class GroupByJobTitleItShouldImpl implements GroupByJobTitleItShould {
	@Override
	public Map<JobTitle, List<Person>> groupByJobTitle(Person... people) {
		throw new ImplementationThereExpectedWas();
	}
}
