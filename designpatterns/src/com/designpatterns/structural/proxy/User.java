package com.designpatterns.structural.proxy;

public class User {
	public static void main(String[] args) {
		Logins login = new Proxylogin("admin", "123");
		login.login();
	}
}
