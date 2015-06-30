package br.com.javabeer.design.observer;

public interface Subject {
	
	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObservers(Notification notification);
	public Object getUpdate(Observer obj);
}
