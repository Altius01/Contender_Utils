package msgSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MsgSystem{
	private static MsgSystem instance;
	
	private final Map<Adress, ConcurrentLinkedQueue<Msg>> messages 
		= new HashMap<Adress, ConcurrentLinkedQueue<Msg>>();
	
	private MsgSystem() {}

	public static MsgSystem getInstance() {
		if (instance == null) {
			instance = new MsgSystem();
		}
		return instance;
	}
	
	public void addAbonents(List<Abonent> abonents) {
		Iterator<Abonent> it = abonents.iterator();
		
		while(it.hasNext()) {
			messages.put(it.next().getAdress(), new ConcurrentLinkedQueue<Msg>());
		}
	}
	
	public void addAbonent(Abonent abonent) {
		messages.put(abonent.getAdress(), new ConcurrentLinkedQueue<Msg>());
	}
	
	public void sendMessage(Msg message) {
		Queue<Msg> messageQueue = messages.get(message.getTo());
		messageQueue.add(message);
	}
	
	public void execForAbonent(Abonent abonent) {
		Queue<Msg> messageQueue = messages.get(abonent.getAdress());
		while(!messageQueue.isEmpty()) {
			Msg message = messageQueue.poll();
			message.exec(abonent);
		}
	}
}
