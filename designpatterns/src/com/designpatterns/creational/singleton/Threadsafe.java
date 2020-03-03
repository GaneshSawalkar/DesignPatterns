package com.designpatterns.creational.singleton;

public class Threadsafe {
	private static Threadsafe t;

	private Threadsafe() {
	}

	public static Threadsafe threadsafeInstance() {
		if (t == null) {
			synchronized (Threadsafe.class) {
				if (t == null) {
					t = new Threadsafe();
				}
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Threadsafe ts = threadsafeInstance();
		System.out.println(ts.hashCode());
		Threadsafe ts1 = threadsafeInstance();
		System.out.println(ts1.hashCode());
	}
}
