package com.bridgelabz.felloship.model;

public class server implements computer {
	private String cpu;
	private String ram;
	private String hdd;
	private String type;

	public server(String cpu, String ram, String hdd, String type) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.type = type;
	}

	@Override
	public String toString() {
		return "server [getcpu()=" + getcpu() + ", gethdd()=" + gethdd() + ", gettype()=" + gettype() + ", getram()="
				+ getram() + "]";
	}

	@Override
	public String getcpu() {
		return this.cpu;
	}

	@Override
	public String gethdd() {
		return this.hdd;
	}

	@Override
	public String gettype() {
		return this.type;
	}

	@Override
	public String getram() {
		return this.ram;
	}

}
