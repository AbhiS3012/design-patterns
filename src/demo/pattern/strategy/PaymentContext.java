package demo.pattern.strategy;

public class PaymentContext {

	private Payment payment;

	public PaymentContext(Payment payment) {
		this.payment = payment;
	}

	public void pay(double amount) {
		payment.pay(amount);
	}

}
