package com.designpatterns.creational.singleton;

public class eager {

	private static final eager e = new eager();

	private eager() {
	}

	public static eager geteagerInstance() {
		return e;
	}

	public static void main(String[] args) {
		eager ts = geteagerInstance();
		System.out.println(ts.hashCode());
		eager ts1 = geteagerInstance();
		System.out.println(ts1.hashCode());
	}
}
