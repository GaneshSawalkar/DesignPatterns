package com.bridgelabz.annotation;

public class Lambdaexp {
	interface Function1 {
		void sayMessage(String message);
	}

	@Noused(desc = "", name = "")
	public static void main(String[] args) {

		Function1 fobj = message -> System.out.println("Hello " + message);
		fobj.sayMessage("ganesh");
		fobj.sayMessage("ajit");
		System.out.println(Lambdaexp.class.getInterfaces().hashCode());

	}

}
