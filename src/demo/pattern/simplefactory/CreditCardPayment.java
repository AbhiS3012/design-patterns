package demo.pattern.simplefactory;

public class CreditCardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Credit Card payment");
	}

}
