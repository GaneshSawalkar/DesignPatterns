package com.designpatterns.structural.adopter;

public class Samsung implements AdopterCharger {
	public static int available;

	@Override
	public Volt getvolt() {
		Volt v = new Volt(available);
		return converts(v, 240);
	}

	@Override
	public Volt get120v() {
		Volt v = new Volt(available);
		return converts(v, 120);
	}

	@Override
	public Volt get15v() {
		Volt v = new Volt(available);
		return converts(v, 15);
	}

	@Override
	public Volt get12v() {
		Volt v = new Volt(available);
		return converts(v, 12);
	}

	@Override
	public Volt get3v() {
		Volt v = new Volt(available);
		return converts(v, 3);
	}

	public Volt converts(Volt available, int requiredvolts) {
		int reducevolt = available.getVolt() - requiredvolts;

		System.out.print("reduce voltage: " + reducevolt + "  Available now: ");
		return new Volt(available.getVolt() - reducevolt);

	}

}
