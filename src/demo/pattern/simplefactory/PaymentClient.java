package demo.pattern.simplefactory;

/**
 * This is a Simple Factory implemented using a registry pattern. Instead of
 * if-else, I’m using a Map<String, Supplier<Payment>>. Since object creation is
 * not delegated to subclasses, this is not GoF Factory Method.
 */
public class PaymentClient {

	public static void main(String[] args) {
		PaymentFactory factory = new PaymentFactory();
		Payment payment = factory.getCard("CreditCard");
		payment.pay();
	}

}
