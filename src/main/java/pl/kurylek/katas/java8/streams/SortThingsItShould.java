package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;

public interface SortThingsItShould {

	List<String> sortAlphabetically(String... fruits);

	List<Person> sortByAge(Person... people);
}
