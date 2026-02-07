package demo.pattern.cor;

public class Client {

	public static void main(String[] args) {
		Handler auth = new AuthenticationHandler();
		Handler authorization = new AuthorizationHandler();
		Handler business = new BusinessHandler();

		auth.setHandler(authorization);
		authorization.setHandler(business);

		auth.handle(new Request());
	}

}
