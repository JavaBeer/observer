package br.com.javabeer.design.observer;

public interface Observer {
	public void update();
	public void setSubject(Subject subject);
}
