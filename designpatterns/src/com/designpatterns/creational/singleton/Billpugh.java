package com.designpatterns.creational.singleton;

public class Billpugh {
	public Billpugh() {
	}

	private static class help {
		private static final Billpugh b = new Billpugh();
	}

	public static Billpugh get() {
		return help.b;
	}

	public static void main(String[] args) {
		Billpugh ts = get();
		System.out.println(ts.hashCode());
		Billpugh ts1 = get();
		System.out.println(ts1.hashCode());
	}
}
