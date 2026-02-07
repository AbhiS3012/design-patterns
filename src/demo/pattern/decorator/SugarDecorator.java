package demo.pattern.decorator;

public class SugarDecorator extends Decorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost() + 10;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return coffee.description() + ", Sugar";
	}

}
