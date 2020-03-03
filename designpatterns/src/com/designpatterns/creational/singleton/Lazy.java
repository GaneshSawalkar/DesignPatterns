package com.designpatterns.creational.singleton;

public class Lazy {
	private static Lazy l;

	private Lazy() {
	}

	public static Lazy lazygetInstance() {
		if (l == null) {
			l = new Lazy();
		}
		return l;
	}

	public static void main(String[] args) {
		Lazy ts = lazygetInstance();
		System.out.println(ts.hashCode());
		Lazy ts1 = lazygetInstance();
		System.out.println(ts1.hashCode());
	}
}
