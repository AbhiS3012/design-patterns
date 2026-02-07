package demo.pattern.decorator;

public class SimpleCoffee implements Coffee {

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Simle Coffee";
	}

}
