package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.SumAndReduceItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;

import static org.assertj.core.api.Assertions.assertThat;

public class _12_SumAndReduceItShouldTest {

	SumAndReduceItShould sumAndReduceItShould = new SumAndReduceItShouldImpl();

	@Test
	public void shouldSumTeamAge() {
		// given
		Person wojciech = new Person("Wojciech", 26);
		Person adam = new Person("Adam", 33);
		Person maciej = new Person("Maciej", 34);
		Person grzegorz = new Person("Grzegorz", 30);
		Person karol = new Person("Karol", 35);
		Person franciszek = new Person("Franciszek", 26);
		Person tomasz = new Person("Tomasz", 23);

		// when
		int total = sumAndReduceItShould.calculateTotalAge(wojciech, adam, maciej, grzegorz, karol, franciszek,
				tomasz);

		// then
		assertThat(total).isEqualTo(wojciech.getAge() + adam.getAge() + maciej.getAge() + grzegorz.getAge() + karol
				.getAge() + franciszek.getAge() + tomasz.getAge());
	}

	@Test
	public void shouldGetAverageTeamAge() {
		// given
		Person wojciech = new Person("Wojciech", 26);
		Person adam = new Person("Adam", 33);
		Person maciej = new Person("Maciej", 34);
		Person grzegorz = new Person("Grzegorz", 30);
		Person karol = new Person("Karol", 35);
		Person franciszek = new Person("Franciszek", 26);
		Person tomasz = new Person("Tomasz", 23);

		// when
		double averageAge = sumAndReduceItShould.calculateAverageAge(wojciech, adam, maciej, grzegorz, karol,
				franciszek, tomasz);

		// then
		assertThat(averageAge).isEqualTo((wojciech.getAge() + adam.getAge() + maciej.getAge() + grzegorz.getAge() +
				karol.getAge() + franciszek.getAge() + tomasz.getAge()) / 7d);
	}
}