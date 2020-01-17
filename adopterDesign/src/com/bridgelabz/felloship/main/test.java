package com.bridgelabz.felloship.main;

import com.bridgelabz.felloship.model.AdopterCharger;

import java.util.Scanner;

import com.bridgelabz.felloship.model.*;

public class test {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getforsamsung();
		getforiphone();

	}

	private static void getforiphone() {
		System.out.println("iphone    :");

		AdopterCharger adopterCharger = new iphone();
		iphone.available = scanner.nextInt();

		volt v = adopterCharger.getvolt();
		System.out.println(v.getVolt());

		volt v1 = adopterCharger.get120v();
		System.out.println(v1.getVolt());

		volt v2 = adopterCharger.get15v();
		System.out.println(v2.getVolt());

		volt v3 = adopterCharger.get12v();
		System.out.println(v3.getVolt());

		volt v4 = adopterCharger.get3v();
		System.out.println(v4.getVolt());
	}

	private static void getforsamsung() {
		System.out.println("samsung    :");

		AdopterCharger adopterCharger = new samsung();
		samsung.available = scanner.nextInt();
		volt v = adopterCharger.getvolt();
		System.out.println(v.getVolt());

		volt v1 = adopterCharger.get120v();
		System.out.println(v1.getVolt());

		volt v2 = adopterCharger.get15v();
		System.out.println(v2.getVolt());

		volt v3 = adopterCharger.get12v();
		System.out.println(v3.getVolt());

		volt v4 = adopterCharger.get3v();
		System.out.println(v4.getVolt());

	}
}
