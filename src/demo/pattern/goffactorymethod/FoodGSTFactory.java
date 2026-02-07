package demo.pattern.goffactorymethod;

public class FoodGSTFactory extends GSTFactory {

	@Override
	public GstCalculator createGstCalculator() {
		// TODO Auto-generated method stub
		return new FoodGstCalculator();
	}

}
