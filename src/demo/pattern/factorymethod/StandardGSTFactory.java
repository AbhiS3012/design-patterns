package demo.pattern.factorymethod;

public class StandardGSTFactory extends GSTFactory {

	@Override
	public GstCalculator createGstCalculator() {
		// TODO Auto-generated method stub
		return new StandardGstCalculator();
	}

}
