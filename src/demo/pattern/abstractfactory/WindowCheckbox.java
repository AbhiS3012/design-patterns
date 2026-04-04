package demo.pattern.abstractfactory;

public class WindowCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Windows Checkbox");
	}

}
