package pl.kurylek.katas.java8.streams.tips;

import java.lang.annotation.Repeatable;

@Repeatable(value = Hints.class)
public @interface Hint {
	String value();
}
