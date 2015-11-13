package pl.kurylek.katas.java8.lambdas;

@FunctionalInterface
public interface MultipleMethodsInterfaceWithDefault {

	void a();
	default void b() {}
}
