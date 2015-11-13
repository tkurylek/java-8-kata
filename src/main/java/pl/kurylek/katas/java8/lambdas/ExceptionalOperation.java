package pl.kurylek.katas.java8.lambdas;

@FunctionalInterface
public interface ExceptionalOperation {
	void operate() throws Exception;
}
