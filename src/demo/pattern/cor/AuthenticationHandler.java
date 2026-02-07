package demo.pattern.cor;

public class AuthenticationHandler extends Handler {

	@Override
	public void handle(Request request) {
		if (!request.authenticated) {
			throw new RuntimeException("Request not authenticated");
		}
		
		System.out.println("Processing next handler");
		next.handle(request);
	}

}
