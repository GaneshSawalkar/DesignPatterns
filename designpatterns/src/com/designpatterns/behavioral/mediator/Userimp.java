package com.designpatterns.behavioral.mediator;

public class Userimp extends User {

	public Userimp(Chatapp app, String name) {
		super(name, app);
	}

	@Override
	public void send(String msg) {
		System.out.println("Send: name: " + this.uname + " " + msg);
		chatapp.sendmsg(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println("reciver name: " + this.uname + " " + msg);
	}

}
