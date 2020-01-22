package com.designpatterns.creational.singleton;

public class threadsafe {
	private static threadsafe t;

	private threadsafe() {
	}

	public static threadsafe threadsafeInstance() {
		if (t == null) {
			synchronized (threadsafe.class) {
				if (t == null) {
					t = new threadsafe();
				}
			}
		}
		return t;
	}

	public static void main(String[] args) {
		threadsafe ts = threadsafeInstance();
		System.out.println(ts.hashCode());
		threadsafe ts1 = threadsafeInstance();
		System.out.println(ts1.hashCode());
	}
}
