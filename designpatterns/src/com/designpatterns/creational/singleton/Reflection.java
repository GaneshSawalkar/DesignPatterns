package com.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class Reflection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Eager object1 = Eager.geteagerInstance();
		Eager object2 = null;
		try {
			Constructor[] constructors = Eager.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				object2 = (Eager) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("object1 .hashCode():- " + object1.hashCode());
		System.out.println("object2.hashCode():- " + object2.hashCode());
	}
}
