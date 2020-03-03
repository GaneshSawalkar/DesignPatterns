package com.designpatterns.creational.factory;

public class Sale {
	public static void main(String[] args) {
		Computer pc = Productfactory.get("pc", "i7", "1-Tb", "8 Gb");
		System.out.println(pc);
		Computer pc2 = Productfactory.get("laptop", "i7", "1-Tb", "8 Gb");
		System.out.println(pc2);

	}
}
