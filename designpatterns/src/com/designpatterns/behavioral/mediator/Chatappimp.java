package com.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chatappimp implements Chatapp {
	private List<User> userlist;

	public Chatappimp() {
		this.userlist = new ArrayList<User>();
	}

	@Override
	public void sendmsg(String msg, User user) {
		for (User u : this.userlist) {
			if (u != user) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void adduser(User user) {
		this.userlist.add(user);
	}

}
