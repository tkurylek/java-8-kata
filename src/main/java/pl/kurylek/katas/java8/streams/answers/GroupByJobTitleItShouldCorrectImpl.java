package pl.kurylek.katas.java8.streams.answers;

import pl.kurylek.katas.java8.streams.GroupByJobTitleItShould;
import pl.kurylek.katas.java8.streams.stubs.JobTitle;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;

public class GroupByJobTitleItShouldCorrectImpl implements GroupByJobTitleItShould {
	@Override
	public Map<JobTitle, List<Person>> groupByJobTitle(Person... people) {
		return asList(people).stream().collect(groupingBy(Person::getJobTitle));
	}
}
