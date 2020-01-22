package com.designpatterns.creational.singleton;

public class staticblock {
	private static staticblock s;

	private staticblock() {
	}

	static {
		try {
			s = new staticblock();
		} catch (Exception e) {
			throw new RuntimeException("occured");
		}
	}

	public static staticblock getstStaticblockInstance() {
		return s;
	}

	public static void main(String[] args) {
		staticblock ts = getstStaticblockInstance();
		System.out.println(ts.hashCode());
		staticblock ts1 = getstStaticblockInstance();
		System.out.println(ts1.hashCode());
	}
}
