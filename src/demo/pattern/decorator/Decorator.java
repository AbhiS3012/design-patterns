package demo.pattern.decorator;

public abstract class Decorator implements Coffee {

	protected Coffee coffee;

	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

}
