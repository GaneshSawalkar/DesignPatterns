package com.designpatterns.creational.factory;

public class pc implements computer {

	private String cpu;
	private String ram;
	private String hdd;
	private String type;

	public pc(String cpu, String ram, String hdd, String type) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.type = type;
	}


	@Override
	public String toString() {
		return "pc [cpu=" + getcpu() + ", hdd=" + gethdd() + ", type=" + gettype() + ", ram="
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
