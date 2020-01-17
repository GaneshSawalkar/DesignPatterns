package com.bridgelabz.felloship.factory;

public class singletone {
	public static int num1;
	public static int num2;
	private int calculation;

	public int getCalculation() {
		return calculation;
	}

	public void setCalculation(int calculation) {
		this.calculation = calculation;
	}

	private static singletone s;

	public static singletone get(int id, int name, int choice) {

		if (s == null) {
			s = new singletone(id, name);
		}
		int out = operation(choice);
		s.setCalculation(out);
		return s;
	}

	public singletone(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public static int operation(int ch) {
		switch (ch) {
		case 1:
			System.out.print("add: ");
			return (num1 + num2);
		case 2:System.out.print("sub: ");
			return (num1 - num2);
		case 3:System.out.print("mul: ");
			return (num1 * num2);
		case 4:System.out.print("div: ");
			return (num1 / num2);
		default:
			break;
		}
		return ch;
	}

}
