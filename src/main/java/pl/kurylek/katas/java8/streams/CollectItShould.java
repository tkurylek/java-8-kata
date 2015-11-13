package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CollectItShould {

	Map<Integer, Person> convertToMap(Person... people);

	Set<Person> convertToSet(Person... people);

	List<Person> convertToList(Iterable<Person> collection);

	List<Person> convertToList(Person ... people);
}
