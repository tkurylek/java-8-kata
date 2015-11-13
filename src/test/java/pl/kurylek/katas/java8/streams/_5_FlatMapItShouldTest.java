package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.FlatMapItShoutImpl;
import pl.kurylek.katas.java8.streams.tips.Hint;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@Hint("foldMe")
@Hint("flatMap")
public class _5_FlatMapItShouldTest {

	FlatMapItShould flatMapItShould = new FlatMapItShoutImpl();

	@Test
	public void shouldFlattenCollection() {
		// given
		List<List<String>> collection = asList(asList("Apple", "Banana", "Orange"), asList("Cucumber", "Potato"));
		List<String> expected = asList("Apple", "Banana", "Orange", "Cucumber", "Potato");

		// when
		List<String> results = flatMapItShould.flatten(collection);

		// then
		assertThat(results).hasSameElementsAs(expected);
	}

	@Test
	public void shouldExtractNumbersFromString() {
		// given
		String numbers = "1,2\n3,4\n5";
		List<Integer> expected = asList(1, 2, 3, 4, 5);

		// when
		List<Integer> results = flatMapItShould.extractNumbers(numbers);

		// then
		assertThat(results).hasSameElementsAs(expected);
	}
}