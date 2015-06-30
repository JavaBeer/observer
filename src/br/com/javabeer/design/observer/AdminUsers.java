package br.com.javabeer.design.observer;


public class AdminUsers implements Observer {
	
	String name;
	Subject subject;
	
	public AdminUsers(String name) {
		this.name = name;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		Notification msg = (Notification)subject.getUpdate(this);
		if (msg == null) {
			System.out.println(name+" ==> Sem notificações");
		} else {
			if (msg.getType() == "ALERT") {
				System.out.println(name+":: Consuming message ::"+msg.getMessage());
			}
		}
	}
}
