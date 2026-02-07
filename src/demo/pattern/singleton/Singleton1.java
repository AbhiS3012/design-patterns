package demo.pattern.singleton;

public enum Singleton1 {

	INSTANCE;

	public void doSomething() {
		System.out.println("Doing something...");
	}

	public static void main(String[] args) {
		Singleton1.INSTANCE.doSomething();
	}
}
