package demo.pattern.abstractfactory;

public class MacUIFactory implements UIFactory {
	public Button createButton() {
		return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
