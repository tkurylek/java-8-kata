package pl.kurylek.katas.java8.lambdas;

public class BetterExceptionCatcher {

	private ExceptionalOperation exceptionalOperation;

	private BetterExceptionCatcher(ExceptionalOperation exceptionalOperation) {
		this.exceptionalOperation = exceptionalOperation;
	}

	public static BetterExceptionCatcher when(ExceptionalOperation exceptionalOperation) {
		return new BetterExceptionCatcher(exceptionalOperation);
	}

	@SuppressWarnings("unchecked")
	public <EXCEPTION extends Exception> EXCEPTION tryToCatch(Class<EXCEPTION> exceptionType) {
		try {
			exceptionalOperation.operate();
		} catch (Throwable e) {
			if (exceptionType.isInstance(e)) {
				return (EXCEPTION) e;
			}
		}
		return null;
	}
}
