package demo.pattern.singleton;

public class Singleton2 {

	private Singleton2() {
	};

	private static class Holder {
		private final static Singleton2 SINGLETON = new Singleton2();
	}

	public Singleton2 getInstance() {
		return Holder.SINGLETON;
	}

}
