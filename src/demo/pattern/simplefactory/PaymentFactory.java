package demo.pattern.simplefactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {

	public Map<String, Supplier<Payment>> factory = new HashMap<>();

	public PaymentFactory() {
		factory.put("CreditCard", CreditCardPayment::new);
		factory.put("DebitCard", DebitCardPayment::new);
	}

	public Payment getCard(String type) {
		return factory.get(type).get();
	}

}
