package com.bridgelabz.felloship.model;

public class samsung implements AdopterCharger {
	public static int available;

	@Override
	public volt getvolt() {
		volt v = new volt(available);
		return converts(v, 240);
	}

	@Override
	public volt get120v() {
		volt v = new volt(available);
		return converts(v, 120);
	}

	@Override
	public volt get15v() {
		volt v = new volt(available);
		return converts(v, 15);
	}

	@Override
	public volt get12v() {
		volt v = new volt(available);
		return converts(v, 12);
	}

	@Override
	public volt get3v() {
		volt v = new volt(available);
		return converts(v, 3);
	}

	public volt converts(volt available, int requiredvolts) {
		int reducevolt = available.getVolt() - requiredvolts;

		System.out.print("reduce voltage: " + reducevolt + "  Available now: ");
		return new volt(available.getVolt() - reducevolt);

	}

}
