package singletonpractice;

import java.io.Serializable;

public class Serialize implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	public Serialize() {
	}

	private static class SingletonHelper {
		private static final Serialize instance = new Serialize();
	}

	public static Serialize getInstance() {
		return SingletonHelper.instance;
	}

	public static void main(String[] args) {
		Serialize s1 = getInstance();
		System.out.println(s1.hashCode());
		Serialize s2 = getInstance();
		System.out.println(s2.hashCode());
	}

}