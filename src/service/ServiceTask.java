package service;

import msgSystem.Adress;
import msgSystem.Msg;

public abstract class ServiceTask<V> extends Msg implements Future<V>{
	protected boolean doneFlag;
	protected V result;
	
	public ServiceTask(Adress to) {
		super(null, to);
		doneFlag = false;
	}

	@Override
	public boolean isDone() {
		return doneFlag;
	}

	@Override
	public V get() {
		return result;
	}
}
