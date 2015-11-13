package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.JoinPeopleItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;
import pl.kurylek.katas.java8.streams.tips.Hint;

import static org.assertj.core.api.Assertions.assertThat;

@Hint("foldMe")
@Hint("collect(joining(...))")
public class _7_JoinPeopleItShouldTest {

	JoinPeopleItShould joinPeopleItShould = new JoinPeopleItShouldImpl();

	@Test
	public void shouldJoinPeopleByTheirNames() {
		// given
		Person wojciech = new Person("Wojciech", 16);
		Person adam = new Person("Adam", 23);
		Person maciej = new Person("Maciej", 24);
		Person grzegorz = new Person("Grzegorz", 20);
		Person karol = new Person("Karol", 25);
		Person franciszek = new Person("Franciszek", 16);
		Person tomasz = new Person("Tomasz", 13);

		// when
		String result = joinPeopleItShould.joinPeopleByName(wojciech, adam, maciej, grzegorz, karol, franciszek,
				tomasz);

		// then
		assertThat(result).isEqualTo("Wojciech, Adam, Maciej, Grzegorz, Karol, Franciszek, Tomasz");
	}

	@Test
	public void shouldJoinPeopleByTheirNamesWithPrefixAndSuffix() {
		// given
		Person wojciech = new Person("Wojciech", 16);
		Person adam = new Person("Adam", 23);
		Person maciej = new Person("Maciej", 24);
		Person grzegorz = new Person("Grzegorz", 20);
		Person karol = new Person("Karol", 25);
		Person franciszek = new Person("Franciszek", 16);
		Person tomasz = new Person("Tomasz", 13);

		// when
		String result = joinPeopleItShould.joinPeopleByNameWithPrefixAndSuffix(wojciech, adam, maciej, grzegorz,
				karol, franciszek, tomasz);

		// then
		assertThat(result).isEqualTo("Space Invaders: Wojciech, Adam, Maciej, Grzegorz, Karol, Franciszek, Tomasz.");
	}
}
