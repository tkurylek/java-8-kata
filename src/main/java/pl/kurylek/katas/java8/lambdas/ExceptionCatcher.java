package pl.kurylek.katas.java8.lambdas;

public final class ExceptionCatcher {

	private ExceptionCatcher() {
		throw new AssertionError("Using constructor of this class is prohibited.");
	}

	@SuppressWarnings("unchecked")
	public static <E extends Exception> E tryToCatch(Class<E> exceptionType, ExceptionalOperation exceptionalOperation) {
		try {
			exceptionalOperation.operate();
		} catch (Exception e) {
			if (exceptionType.isInstance(e)) {
				return (E) e;
			}
		}
		return null;
	}
}
