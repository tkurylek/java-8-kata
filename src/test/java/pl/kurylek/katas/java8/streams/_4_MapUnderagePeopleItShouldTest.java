package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.MapUnderagePeopleItShouldImpl;
import pl.kurylek.katas.java8.streams.stubs.Child;
import pl.kurylek.katas.java8.streams.stubs.Person;
import pl.kurylek.katas.java8.streams.tips.Hint;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Hint("filter")
@Hint("map")
public class _4_MapUnderagePeopleItShouldTest {

	MapUnderagePeopleItShould mapUnderagePeopleItShould = new MapUnderagePeopleItShouldImpl();

	@Test
	public void shouldFilterUnderagePeopleAndMapThemToKids() {
		// given
		Person wojciech = new Person("Wojciech", 16);
		Person adam = new Person("Adam", 23);
		Person maciej = new Person("Maciej", 24);
		Person grzegorz = new Person("Grzegorz", 20);
		Person karol = new Person("Karol", 25);
		Person franciszek = new Person("Franciszek", 16);
		Person tomasz = new Person("Tomasz", 13);

		// when
		List<Child> underageChildren = mapUnderagePeopleItShould.findUnderagePeople(wojciech, adam, maciej, grzegorz,
				karol, franciszek, tomasz);

		// then
		assertThat(underageChildren).hasSize(3);
	}
}