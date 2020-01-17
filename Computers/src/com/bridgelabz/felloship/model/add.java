package com.bridgelabz.felloship.model;

public class add implements calculation {
	private int num1;
	private int num2;

	public add(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public long getcal() {
		
		return num1 + num2;

	}

}
