package com.bridgelabz.felloship.factory;

import com.bridgelabz.felloship.model.computer;
import com.bridgelabz.felloship.model.laptop;
import com.bridgelabz.felloship.model.pc;
import com.bridgelabz.felloship.model.server;

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
