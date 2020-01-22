package com.designpatterns.structural.proxy;

public class user {
	public static void main(String[] args) {
		logins login = new proxylogin("admin", "123");
		login.login();
	}
}
