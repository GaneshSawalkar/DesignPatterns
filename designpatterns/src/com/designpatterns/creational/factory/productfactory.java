package com.designpatterns.creational.factory;


public class productfactory {
	public static computer get(String type, String cpu, String hdd, String ram) {
		if (type.equalsIgnoreCase("pc"))
			return new pc(cpu, ram, hdd, type);
		if (type.equalsIgnoreCase("laptop"))
			return new laptop(cpu, ram, hdd, type);
		if (type.equalsIgnoreCase("server"))
			return new server(cpu, ram, hdd, type);

		return null;

	}
}
