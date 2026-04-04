package demo.pattern.abstractfactory;

public class WindowButton implements Button {

	@Override
	public void paint() {
		System.out.println("Windows Button");
	}

}
