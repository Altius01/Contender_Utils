package service;

import msgSystem.Abonent;
import msgSystem.Adress;
import msgSystem.MsgSystem;

public class Service extends Thread implements Abonent {
	protected MsgSystem ms;
	protected Adress adress;
	
	public Service() {
		adress = new Adress();
		ms = MsgSystem.getInstance();
		ms.addAbonent(this);
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()) {
			ms.execForAbonent(this);
		}
	}

	@Override
	public Adress getAdress() {
		return adress;
	}

}
