package com.designpatterns.structural.adopter;

public class Iphone implements Adoptercharger {
	public static int available;

	@Override
	public Volt getvolt() {
		Volt v = new Volt(available);
		return convert(v, 240);
	}

	@Override
	public Volt get120v() {
		Volt v = new Volt(available);
		return convert(v, 120);
	}

	@Override
	public Volt get15v() {
		Volt v = new Volt(available);
		return convert(v, 15);
	}

	@Override
	public Volt get12v() {
		Volt v = new Volt(available);
		return convert(v, 12);
	}

	@Override
	public Volt get3v() {
		Volt v = new Volt(available);
		return convert(v, 3);
	}

	private Volt convert(Volt v, int i) {
		int reduce = v.getVolt() - i;
		System.out.print("reduce volt: " + reduce + "  availabale now: ");
		return new Volt(v.getVolt() - reduce);
	}

}
