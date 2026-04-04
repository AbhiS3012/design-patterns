package demo.pattern.abstractfactory;

public class WindowsUIFactory implements UIFactory {
	public Button createButton() {
		return new WindowButton();
	}

	public Checkbox createCheckbox() {
		return new WindowCheckbox();
	}
}
