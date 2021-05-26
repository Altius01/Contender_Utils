package msgSystem;

import java.util.concurrent.atomic.AtomicInteger;

public class Adress {
	static private AtomicInteger abonentIdCreator = new AtomicInteger();
	
	final private int abonentId;
	
	public Adress() {
		this.abonentId = abonentIdCreator.incrementAndGet();
	}
	
	public int hashCode() {
		return abonentId;
	}

}