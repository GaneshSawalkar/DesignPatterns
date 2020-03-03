package com.designpatterns.structural.proxy;

public class Proxylogin implements Logins {
	private Logins log;
	private boolean isauthorised;

	public Proxylogin(String username, String pass) {
		if (username.equals("admin") && pass.equals("123")) {
			System.out.println("ok");
			isauthorised = true;
			log = new Loginsimplement();

		}
	}

	@Override
	public void login() {
		if (isauthorised) {
			open();
		} else {
			System.out.println("only authoriesed have access");
		}

	}

	private void open() {
		System.out.println("welcome to bridgelabz");

	}

}
