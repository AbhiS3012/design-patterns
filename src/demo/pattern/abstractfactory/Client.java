package demo.pattern.abstractfactory;

/**
 * An abstract factory families of related objects where factory object decides which one.
 */
public class Client {

	public static void main(String[] args) {
		UIFactory factory = new WindowsUIFactory();

		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();

		button.paint();
		checkbox.paint();
	}
}
