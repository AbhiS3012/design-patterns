package demo.pattern.strategy;

public class PaymentClient {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext(new CreditCardPayment());
		context.pay(1000);
	}

}
