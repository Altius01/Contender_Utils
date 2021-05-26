package io;

public class InetMsg {
	private InetMsgType type;
	private String body;

	public InetMsg(InetMsgType head, String body) {
		this.type = head;
		this.body = body;
	}

	public InetMsgType getHead() {
		return type;
	}

	public void setHead(InetMsgType head) {
		this.type = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
