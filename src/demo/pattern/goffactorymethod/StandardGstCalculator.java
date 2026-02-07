package demo.pattern.goffactorymethod;

public class StandardGstCalculator implements GstCalculator {

	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.18;
	}

}
