package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.MaxAndCompareItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;
import pl.kurylek.katas.java8.streams.tips.Hint;

import static org.assertj.core.api.Assertions.assertThat;

public class _10_MaxAndCompareItShouldTest {

	MaxAndCompareItShould maxAndCompareItShould = new MaxAndCompareItShouldImpl();

	@Test
	@Hint("min")
	@Hint("comparing")
	public void shouldGetYoungestPerson() {
		// given
		Person wojciech = new Person("Wojciech", 26);
		Person adam = new Person("Adam", 33);
		Person maciej = new Person("Maciej", 34);
		Person grzegorz = new Person("Grzegorz", 30);
		Person karol = new Person("Karol", 35);
		Person franciszek = new Person("Franciszek", 26);
		Person tomasz = new Person("Tomasz", 23);

		// when
		Person youngestPerson = maxAndCompareItShould.findYoungestPerson(wojciech, adam, maciej, grzegorz, karol,
				franciszek, tomasz);

		// then
		assertThat(youngestPerson).isEqualTo(tomasz);
	}

	@Test
	@Hint("mapToInt")
	@Hint("max")
	public void shouldGetOldestPersonAge() {
		// given
		Person wojciech = new Person("Wojciech", 26);
		Person adam = new Person("Adam", 33);
		Person maciej = new Person("Maciej", 34);
		Person grzegorz = new Person("Grzegorz", 30);
		Person karol = new Person("Karol", 35);
		Person franciszek = new Person("Franciszek", 26);
		Person tomasz = new Person("Tomasz", 23);

		// when
		int age = maxAndCompareItShould.findOldestPersonAge(wojciech, adam, maciej, grzegorz, karol, franciszek,
				tomasz);

		// then
		assertThat(age).isEqualTo(karol.getAge());
	}
}