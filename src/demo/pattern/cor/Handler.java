package demo.pattern.cor;

public abstract class Handler {

	protected Handler next;

	public void setHandler(Handler next) {
		this.next = next;
	}

	public abstract void handle(Request request);

}
