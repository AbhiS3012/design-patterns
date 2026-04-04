package demo.pattern.factorymethod;

public class FoodGSTFactory extends GSTFactory {

	@Override
	public GstCalculator createGstCalculator() {
		// TODO Auto-generated method stub
		return new FoodGstCalculator();
	}

}
