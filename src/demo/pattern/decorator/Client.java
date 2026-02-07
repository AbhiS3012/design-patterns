package demo.pattern.decorator;

public class Client {

	public static void main(String[] args) {
		// (Base coffee + milk + sugar)
		Coffee coffee = new SimpleCoffee();
		System.out.print(coffee.cost());
		System.out.println(coffee.description());

		coffee = new MilkDecorator(coffee);
		System.out.print(coffee.cost());
		System.out.println(coffee.description());

		coffee = new SugarDecorator(coffee);
		System.out.print(coffee.cost());
		System.out.println(coffee.description());
	}

}
