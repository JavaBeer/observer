package br.com.javabeer.design.observer;

import java.util.ArrayList;
import java.util.List;


public class NotificationCenter implements Subject {

	private List<Observer> observers;
	private Notification notification;


	public NotificationCenter() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		if (!observers.contains(obj)) {
			//Garante que apenas uma instacia desse objeto estará na lista
			this.observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		this.observers.remove(obj);
	}

	@Override
	public void notifyObservers(Notification notification) {
		this.notification = notification;
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.notification;
	}

}
