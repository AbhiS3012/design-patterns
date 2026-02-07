package demo.pattern.simplefactory;

public class DebitCardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Debit Card payment");
	}

}
