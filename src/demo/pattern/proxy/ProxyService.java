package demo.pattern.proxy;

public class ProxyService implements Service {

	private RealService realService;
	private String role;

	public ProxyService(String role) {
		this.role = role;
	}

	@Override
	public void execute() {
		if (!role.equals("ADMIN")) {
			throw new RuntimeException("Access Denied!");
		}

		if (realService == null) {
			realService = new RealService(); // Lazy loading
			System.out.println("Real Service loaded");
		}

		realService.execute();
	}

}
