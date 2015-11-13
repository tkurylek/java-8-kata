package pl.kurylek.katas.java8.streams;

import java.util.List;

public interface FlatMapItShould {

	List<String> flatten(List<List<String>> collection);

	List<Integer> extractNumbers(String numbers);
}
