package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;

public interface SeparateKidsFromAdultsItShould {
	Map<Boolean, List<Person>> separateKidsFromAdults(Person... people);
}
