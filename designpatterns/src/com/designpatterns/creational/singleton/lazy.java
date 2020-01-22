package com.designpatterns.creational.singleton;

public class lazy {
	private static lazy l;

	private lazy() {
	}

	public static lazy lazygetInstance() {
		if (l == null) {
			l = new lazy();
		}
		return l;
	}

	public static void main(String[] args) {
		lazy ts = lazygetInstance();
		System.out.println(ts.hashCode());
		lazy ts1 = lazygetInstance();
		System.out.println(ts1.hashCode());
	}
}
