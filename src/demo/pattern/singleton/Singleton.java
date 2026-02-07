package demo.pattern.singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {};

	//1. Basic
	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	//2. Thread-safe
	public static synchronized Singleton getThreadSafeInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

	//3. Double-chekced locking
	private static volatile Singleton instance1;
	
	public static Singleton getSyncInstance() {

		if (instance1 == null) {
			synchronized (Singleton.class) {
				if (instance1 == null) {
					instance1 = new Singleton();
				}
			}
		}

		return instance1;
	}

	//4. Eager Initialization
	private static final Singleton INSTANCE = new Singleton();

	public static Singleton getEagerInstance() {
		return INSTANCE;
	}

}