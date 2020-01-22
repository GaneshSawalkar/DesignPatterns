package com.designpatterns.creational.prototype;


public class prototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Articals oops = new Articals();
		oops.addlist("basic program");
		oops.addlist("advance program");
		System.out.println(oops.getarticallist());

		Articals database = (Articals) oops.clone();
		database.addlist("oracle");
		database.addlist("mysql");
		System.out.println(database.getarticallist());

		Articals newoops = (Articals) oops.clone();
		newoops.addlist("js");
		System.out.println(newoops.getarticallist());

	}
}
