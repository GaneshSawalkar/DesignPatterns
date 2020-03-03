package com.designpatterns.creational.singleton;

public class Eager {

	private static final Eager e = new Eager();

	private Eager() {
	}

	public static Eager geteagerInstance() {
		return e;
	}

	public static void main(String[] args) {
		Eager ts = geteagerInstance();
		System.out.println(ts.hashCode());
		Eager ts1 = geteagerInstance();
		System.out.println(ts1.hashCode());
	}
}
