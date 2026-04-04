package demo.pattern.simplefactory;

/**
 * A simple factory directly decides which concrete class to instantiate
 */
public class PaymentClient {

	public static void main(String[] args) {
		PaymentFactory factory = new PaymentFactory();
		Payment payment = factory.getCard("CreditCard");
		payment.pay();
	}

}
