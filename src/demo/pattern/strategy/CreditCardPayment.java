package demo.pattern.strategy;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Credit Card payment of : " + amount);
	}

}
