package com.designpatterns.creational.singleton;

public class Staticblock {
	private static Staticblock s;

	private Staticblock() {
	}

	static {
		try {
			s = new Staticblock();
		} catch (Exception e) {
			throw new RuntimeException("occured");
		}
	}

	public static Staticblock getstStaticblockInstance() {
		return s;
	}

	public static void main(String[] args) {
		Staticblock ts = getstStaticblockInstance();
		System.out.println(ts.hashCode());
		Staticblock ts1 = getstStaticblockInstance();
		System.out.println(ts1.hashCode());
	}
}
