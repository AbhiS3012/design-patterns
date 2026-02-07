package demo.pattern.goffactorymethod;

/**
 * 
 * Spring-managed registry factory
 * 
 * @Autowired private Map<String, GSTCalculator> calculators;
 * 
 */
public class GstClient {

	public static void main(String[] args) {
		GSTFactory factory = new StandardGSTFactory();
		GstCalculator gstCalculator = factory.createGstCalculator();
		System.out.println(gstCalculator.calculate(1000));
	}

}
