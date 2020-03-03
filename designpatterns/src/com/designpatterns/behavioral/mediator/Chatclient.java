package com.designpatterns.behavioral.mediator;

public class Chatclient {
	public static void main(String[] args) {
		Chatapp app = new Chatappimp();
		User user1 = new Userimp(app, "amit");
		User user2 = new Userimp(app, "ajay");
		User user3 = new Userimp(app, "akash");
		User user4 = new Userimp(app, "ajit");
		app.adduser(user1);
		app.adduser(user2);
		app.adduser(user3);
		app.adduser(user4);
		user1.send("hi....");
	}
}
