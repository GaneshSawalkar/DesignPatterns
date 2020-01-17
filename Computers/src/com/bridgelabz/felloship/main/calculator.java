package com.bridgelabz.felloship.main;

import com.bridgelabz.felloship.factory.calculatorfactory;
import com.bridgelabz.felloship.model.calculation;

public class calculator {
	public static void main(String[] args) {
		calculation c1 = calculatorfactory.getcalculation("add", 10, 20);
		System.out.println(c1.getcal());
		calculation c2 = calculatorfactory.getcalculation("div", 10, 20);
		System.out.println(c2.getcal());
		calculation c3 = calculatorfactory.getcalculation("mul", 10, 20);
		System.out.println(c3.getcal());
	}
}
