package pl.kurylek.katas.java8.streams;

import pl.kurylek.katas.java8.streams.stubs.Child;
import pl.kurylek.katas.java8.streams.stubs.Person;

import java.util.List;

public interface MapUnderagePeopleItShould {
	List<Child> findUnderagePeople(Person... people);
}
