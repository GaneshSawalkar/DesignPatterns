package com.designpatterns.structural.adopter;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getforsamsung();
		getforiphone();

	}

	private static void getforiphone() {
		System.out.println("iphone    :");

		Adoptercharger adopterCharger = new Iphone();
		Iphone.available = scanner.nextInt();

		Volt v = adopterCharger.getvolt();
		System.out.println(v.getVolt());

		Volt v1 = adopterCharger.get120v();
		System.out.println(v1.getVolt());

		Volt v2 = adopterCharger.get15v();
		System.out.println(v2.getVolt());

		Volt v3 = adopterCharger.get12v();
		System.out.println(v3.getVolt());

		Volt v4 = adopterCharger.get3v();
		System.out.println(v4.getVolt());
	}

	private static void getforsamsung() {
		System.out.println("samsung    :");

		Adoptercharger adopterCharger = new Samsung();
		Samsung.available = scanner.nextInt();
		Volt v = adopterCharger.getvolt();
		System.out.println(v.getVolt());

		Volt v1 = adopterCharger.get120v();
		System.out.println(v1.getVolt());

		Volt v2 = adopterCharger.get15v();
		System.out.println(v2.getVolt());

		Volt v3 = adopterCharger.get12v();
		System.out.println(v3.getVolt());

		Volt v4 = adopterCharger.get3v();
		System.out.println(v4.getVolt());

	}
}
