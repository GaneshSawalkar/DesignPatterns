package com.designpatterns.creational.factory;

public class sale {
	public static void main(String[] args) {
		computer pc = productfactory.get("pc", "i7", "1-Tb", "8 Gb");
		System.out.println(pc);
		computer pc2 = productfactory.get("laptop", "i7", "1-Tb", "8 Gb");
		System.out.println(pc2);

	}
}
