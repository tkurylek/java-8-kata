package pl.kurylek.katas.java8.streams;

import org.junit.Test;
import pl.kurylek.katas.java8.streams.exercises.FilterItShouldImpl;
import pl.kurylek.katas.java8.streams.tips.Hint;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@Hint("foldMe")
@Hint("map")
@Hint("filter")
public class _3_FilterItShouldTest {

	FilterItShould filterItShould = new FilterItShouldImpl();

	@Test
	public void shouldFilterCollection() {
		// given
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("My", "is", "Doe");

		// when
		List<String> results = filterItShould.filterWordsWithoutN(collection);

		// then
		assertThat(results).hasSameElementsAs(expected);
	}
}
