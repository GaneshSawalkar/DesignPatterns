package com.bridgelabz.felloship.main;

import com.bridgelabz.felloship.factory.singletone;

public class test {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(singletone.get(20, 10, (i % 4) + 1).getCalculation() + " ");
		}
	}
}
