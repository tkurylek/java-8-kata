package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.MapItShouldImpl;
import pl.kurylek.katas.java8.streams.tips.Hint;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@Hint("foldMe")
@Hint("map")
public class _2_MapItShouldTest {

	MapItShould mapper = new MapItShouldImpl();

	@Test
	public void shouldMapToUpperCase() {
		// given
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");

		// when
		List<String> result = mapper.mapToUpperCaseString(collection);

		// then
		assertThat(result).hasSameElementsAs(expected);
	}

	@Test
	public void shouldMapToIntegers() {
		// given
		List<String> collection = asList("1", "2", "3", "4", "5");
		List<Integer> expected = asList(1, 2, 3, 4, 5);

		// when
		List<Integer> result = mapper.mapToIntegers(collection);

		// then
		assertThat(result).hasSameElementsAs(expected);
	}
}
