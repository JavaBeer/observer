package br.com.javabeer.design.observer;

public class MainTeste {

	public static void main(String[] args) {

		//Criamos a central de notifica��o
		NotificationCenter center = new NotificationCenter();
		
		//Criando as notifica��es
		Notification alert = new Notification("ALERT", "Security Alert");
		Notification notify = new Notification("NOTIFY", "Updates Available");
		
		//Criando os objetos Observer
		Observer tester1 = new RegularUsers("Muhammad");
		Observer tester2 = new AdminUsers("Abu");
		Observer tester3 = new RegularUsers("Ghadir");
		
		//Registrando os observer no central de notifica��o
		center.register(tester1);
		center.register(tester2);
		center.register(tester3);
		
		//Informando aos observers quem � o Subject
		tester1.setSubject(center);
		tester2.setSubject(center);
		tester3.setSubject(center);
		
		//Observer Tentando buscar uma notifica��o
		System.out.println("-----------------------------------------------");
		tester1.update();
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		//Subject Enviando uma notifica��o
		center.notifyObservers(alert);
		center.notifyObservers(notify);
		System.out.println("-----------------------------------------------");
		
	}
}