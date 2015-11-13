package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.SortThingsItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static pl.kurylek.katas.java8.streams.stubs.JobTitle.*;

public class _9_SortThingsItShouldTest {

	SortThingsItShould sortThingsItShould = new SortThingsItShouldImpl();

	@Test
	public void shouldSortByFruitName() {
		// given
		List<String> expected = asList("Apple", "Banana", "Cucumber", "Orange", "Potato");

		// when
		List<String> result = sortThingsItShould.sortAlphabetically("Banana", "Apple", "Orange", "Cucumber", "Potato");

		// then
		assertThat(result).containsExactlyElementsOf(expected);
	}

	@Test
	public void shouldSortByPeopleAgeAndCollectToMapOfAgeAndThePerson() {
		// given
		Person tomasz = new Person("Tomasz", 23, JUNIOR);
		Person franciszek = new Person("Franciszek", 26, MEDIUM);
		Person wojciech = new Person("Wojciech", 27, MEDIUM);
		Person grzegorz = new Person("Grzegorz", 30, SENIOR);
		Person adam = new Person("Adam", 33, MEDIUM);
		Person maciej = new Person("Maciej", 34, SENIOR);
		Person karol = new Person("Karol", 35, SENIOR);

		// when
		List<Person> result = sortThingsItShould.sortByAge(wojciech, adam, maciej, grzegorz, karol, franciszek,
				tomasz);

		// then
		assertThat(result).containsExactly(tomasz, franciszek, wojciech, grzegorz, adam, maciej, karol);
	}

	private Set<String> newHashSet(String... things) {
		Set<String> collection = new HashSet<>();
		Collections.addAll(collection, things);
		return collection;
	}
}
