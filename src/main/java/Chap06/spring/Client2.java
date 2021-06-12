package Chap06.spring;

public class Client2 {

	private String host;

	public void setHost(String host) {
		this.host = host;
	}

	public void connect() {
		System.out.println("connect() 실행");
	}

	public void send() {
		System.out.println("send()" + host);
	}

	public void close() {
		System.out.println("close() 실행");
	}

}
