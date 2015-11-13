package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.SeparateKidsFromAdultsItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Person;
import pl.kurylek.katas.java8.streams.tips.Hint;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class _8_SeparateKidsFromAdultsItShouldTest {

	private static final boolean ADULTS = true;
	private static final boolean KIDS = false;
	SeparateKidsFromAdultsItShould separateKidsFromAdultsItShould = new SeparateKidsFromAdultsItShouldImpl();

	@Test
	@Hint("partitioningBy")
	public void shouldSeparateKidsFromAdults() {
		// given team 10 years ago
		Person wojciech = new Person("Wojciech", 16);
		Person adam = new Person("Adam", 23);
		Person maciej = new Person("Maciej", 24);
		Person grzegorz = new Person("Grzegorz", 20);
		Person karol = new Person("Karol", 25);
		Person franciszek = new Person("Franciszek", 16);
		Person tomasz = new Person("Tomasz", 13);

		// when
		Map<Boolean, List<Person>> result = separateKidsFromAdultsItShould.separateKidsFromAdults(wojciech, adam,
				maciej, grzegorz, karol, franciszek, tomasz);

		// then
		assertThat(result.get(ADULTS)).containsOnly(adam, maciej, grzegorz, karol);
		assertThat(result.get(KIDS)).containsOnly(franciszek, wojciech, tomasz);
	}
}
