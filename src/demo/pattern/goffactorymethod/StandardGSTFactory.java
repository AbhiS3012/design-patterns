package demo.pattern.goffactorymethod;

public class StandardGSTFactory extends GSTFactory {

	@Override
	public GstCalculator createGstCalculator() {
		// TODO Auto-generated method stub
		return new StandardGstCalculator();
	}

}
