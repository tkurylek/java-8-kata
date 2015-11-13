package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.GroupByJobTitleItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.JobTitle;
import pl.kurylek.katas.java8.streams.stubs.Person;
import pl.kurylek.katas.java8.streams.tips.Hint;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.kurylek.katas.java8.streams.stubs.JobTitle.*;

@Hint("foldMe")
@Hint("groupBy")
public class _6_GroupByJobTitleItShouldTest {

	GroupByJobTitleItShould groupByJobTitleItShould = new GroupByJobTitleItShouldImpl();

	@Test
	public void shouldGroupByJobTitle() {
		// given
		Person wojciech = new Person("Wojciech", 26, MEDIUM);
		Person adam = new Person("Adam", 33, MEDIUM);
		Person maciej = new Person("Maciej", 34, SENIOR);
		Person grzegorz = new Person("Grzegorz", 30, SENIOR);
		Person karol = new Person("Karol", 35, SENIOR);
		Person franciszek = new Person("Franciszek", 26, MEDIUM);
		Person tomasz = new Person("Tomasz", 23, JUNIOR);

		// when
		Map<JobTitle, List<Person>> result = groupByJobTitleItShould.groupByJobTitle(wojciech, adam, maciej, grzegorz,
				karol, franciszek, tomasz);

		// then
		assertThat(result.get(JUNIOR)).containsOnly(tomasz);
		assertThat(result.get(MEDIUM)).containsOnly(wojciech, adam, franciszek);
		assertThat(result.get(SENIOR)).containsOnly(maciej, grzegorz, karol);
	}
}
