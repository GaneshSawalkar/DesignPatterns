package com.bridgelabz.felloship.model;

public class div implements calculation {
	private int num1;
	private int num2;

	public div(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public long getcal() {
		return num1 / num2;
	}

}
