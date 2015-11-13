package pl.kurylek.katas.java8.streams.stubs;

import static pl.kurylek.katas.java8.streams.stubs.JobTitle.MEDIUM;

public class Person implements Comparable<Person> {
	private final String name;
	private final int age;
	private JobTitle jobTitle = MEDIUM;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, JobTitle jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public int compareTo(Person otherPerson) {
		return Integer.valueOf(age).compareTo(otherPerson.getAge());
	}
}
