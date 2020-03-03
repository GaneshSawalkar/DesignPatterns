package com.designpatterns.creational.factory;


public class Productfactory {
	public static Computer get(String type, String cpu, String hdd, String ram) {
		if (type.equalsIgnoreCase("pc"))
			return new Pc(cpu, ram, hdd, type);
		if (type.equalsIgnoreCase("laptop"))
			return new Laptop(cpu, ram, hdd, type);
		if (type.equalsIgnoreCase("server"))
			return new Server(cpu, ram, hdd, type);

		return null;

	}
}
