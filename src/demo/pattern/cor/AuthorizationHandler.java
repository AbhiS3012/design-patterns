package demo.pattern.cor;

public class AuthorizationHandler extends Handler {

	@Override
	public void handle(Request request) {
		if (!request.authorized) {
			throw new RuntimeException("Request not authorized");
		}
		
		System.out.println("Processing next handler");
		next.handle(request);
	}

}
