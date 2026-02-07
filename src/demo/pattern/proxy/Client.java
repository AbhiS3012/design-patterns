package demo.pattern.proxy;

public class Client {

	public static void main(String[] args) {
		ProxyService service = new ProxyService("ADMIN");
		service.execute();
		service.execute();
	}

}
