package br.com.javabeer.design.observer;

public class RegularUsers implements Observer {
	private String name;
	private Subject subject;

	public RegularUsers(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		Notification msg = (Notification)subject.getUpdate(this);
		if (msg == null) {
			System.out.println("Ol� "+name+" N�o temos notifica��es para voc�");
		} else {
			if (msg.getType() == "NOTIFY") {
				System.out.println(name+":: Consuming message ::"+msg.getMessage());
			}
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}

