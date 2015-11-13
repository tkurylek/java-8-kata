package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.CollectItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.MapEntry.entry;
import static pl.kurylek.katas.java8.streams.stubs.JobTitle.*;

public class _1_CollectItShouldTest {

	CollectItShould collectItShould = new CollectItShouldImpl();

	@Test
	public void shouldCollectToList() {
		// given
		Person wojciech = new Person("Wojciech", 27, MEDIUM);
		Person adam = new Person("Adam", 33, MEDIUM);
		Person maciej = new Person("Maciej", 34, SENIOR);
		Person grzegorz = new Person("Grzegorz", 30, SENIOR);
		Person karol = new Person("Karol", 35, SENIOR);
		Person franciszek = new Person("Franciszek", 26, MEDIUM);
		Person tomasz = new Person("Tomasz", 23, JUNIOR);

		// when
		List<Person> people = collectItShould.convertToList(wojciech, adam, maciej, grzegorz, karol, franciszek, tomasz);

		// then
		assertThat(people).containsExactly(wojciech, adam, maciej, grzegorz, karol, franciszek, tomasz);
	}

	@Test
	public void shouldCollectToSetRemovingDuplicates() {
		// given
		Person wojciech = new Person("Wojciech", 27, MEDIUM);
		Person adam = new Person("Adam", 33, MEDIUM);
		Person tomasz = new Person("Tomasz", 23, JUNIOR);

		// when
		Set<Person> result = collectItShould.convertToSet(wojciech, wojciech, adam, adam, tomasz, tomasz);

		// then
		assertThat(result).containsOnly(wojciech, adam, tomasz);
	}

	@Test
	public void shouldCollectToMapOfAgeAndThePerson() {
		// given
		Person wojciech = new Person("Wojciech", 27, MEDIUM);
		Person adam = new Person("Adam", 33, MEDIUM);
		Person maciej = new Person("Maciej", 34, SENIOR);
		Person grzegorz = new Person("Grzegorz", 30, SENIOR);
		Person karol = new Person("Karol", 35, SENIOR);
		Person franciszek = new Person("Franciszek", 26, MEDIUM);
		Person tomasz = new Person("Tomasz", 23, JUNIOR);

		// when
		Map<Integer, Person> result = collectItShould.convertToMap(wojciech, adam, maciej, grzegorz, karol,
				franciszek, tomasz);

		// then
		assertThat(result).containsOnly(entry(23, tomasz), entry(27, wojciech), entry(33, adam), entry(34, maciej), entry(30, grzegorz), entry(35, karol), entry(26, franciszek));
	}

	@Test
	public void shouldCollectToListFromIterable() {
		// given
		Person wojciech = new Person("Wojciech", 27, MEDIUM);
		Person adam = new Person("Adam", 33, MEDIUM);
		Person maciej = new Person("Maciej", 34, SENIOR);
		Person grzegorz = new Person("Grzegorz", 30, SENIOR);
		Person karol = new Person("Karol", 35, SENIOR);
		Person franciszek = new Person("Franciszek", 26, MEDIUM);
		Person tomasz = new Person("Tomasz", 23, JUNIOR);
		Iterable<Person> collection = asList(wojciech, adam, maciej, grzegorz, karol, franciszek, tomasz);

		// when
		List<Person> result = collectItShould.convertToList(collection);

		// then
		assertThat(result).containsOnly(wojciech, adam, maciej, grzegorz, karol, franciszek, tomasz);
	}
}
