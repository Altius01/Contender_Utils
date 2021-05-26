package msgSystem;

public abstract class Msg {
	final private Adress from;
	final private Adress to;
	
	public Msg(Adress from, Adress to) {
		this.from = from;
		this.to = to;
	}
	
	protected Adress getFrom() {
		return from;
	}
	
	protected Adress getTo() {
		return to;
	}
	
	public abstract void exec(Abonent abonent);
}
