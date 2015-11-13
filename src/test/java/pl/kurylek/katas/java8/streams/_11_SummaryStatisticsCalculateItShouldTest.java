package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.SummaryStatisticsCalculateItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class _11_SummaryStatisticsCalculateItShouldTest {

	SummaryStatisticsCalculateItShould summaryStatisticsCalculateItShould = new
			SummaryStatisticsCalculateItShouldImpl();

	@Test
	public void shouldCalculateAverageAge() {
		// given
		Person[] teamMembers = createTeamMembers();

		// when
		double result = summaryStatisticsCalculateItShould.statisticsOf(teamMembers).getAverage();

		// then
		assertThat(result).isEqualTo(expectedAverageOf(teamMembers));
	}

	@Test
	public void shouldCalculateNumberOfTeamMembers() {
		// given
		Person[] teamMembers = createTeamMembers();

		// when
		double result = summaryStatisticsCalculateItShould.statisticsOf(teamMembers).getCount();

		// then
		assertThat(result).isEqualTo(teamMembers.length);
	}

	@Test
	public void shouldReturnOldestMemberAge() {
		// given
		Person[] teamMembers = createTeamMembers();

		// when
		double result = summaryStatisticsCalculateItShould.statisticsOf(teamMembers).getMax();

		// then
		assertThat(result).isEqualTo(35);
	}

	private double expectedAverageOf(Person... people) {
		return asList(people).stream().mapToDouble(Person::getAge).average().getAsDouble();
	}

	public Person[] createTeamMembers() {
		return new Person[]{new Person("Wojciech", 26), new Person("Adam", 33), new Person("Maciej", 34), new Person
				("Grzegorz", 30), new Person("Karol", 35), new Person("Franciszek", 26), new Person("Tomasz", 23)};
	}
}
