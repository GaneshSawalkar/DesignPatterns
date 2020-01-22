package com.designpatterns.behavioral.mediator;

public abstract class User {
	protected String uname;
	protected chatApp chatapp;

	public User(String uname, chatApp chApp) {
		super();
		this.uname = uname;
		this.chatapp = chApp;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
