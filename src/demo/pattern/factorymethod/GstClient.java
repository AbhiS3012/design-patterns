package demo.pattern.factorymethod;

/**
 * A factory method creates one product and lets subclasses decide which one.
 */
public class GstClient {

	public static void main(String[] args) {
		GSTFactory factory = new StandardGSTFactory();
		GstCalculator gstCalculator = factory.createGstCalculator();
		System.out.println(gstCalculator.calculate(1000));
	}

}
