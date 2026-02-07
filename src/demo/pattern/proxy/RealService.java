package demo.pattern.proxy;

public class RealService implements Service {

	@Override
	public void execute() {
		System.out.println("Do Something");
	}

}
