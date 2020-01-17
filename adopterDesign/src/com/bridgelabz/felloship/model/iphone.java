package com.bridgelabz.felloship.model;

public class iphone implements AdopterCharger {
	public static int available;

	@Override
	public volt getvolt() {
		volt v = new volt(available);
		return convert(v, 240);
	}

	@Override
	public volt get120v() {
		volt v = new volt(available);
		return convert(v, 120);
	}

	@Override
	public volt get15v() {
		volt v = new volt(available);
		return convert(v, 15);
	}

	@Override
	public volt get12v() {
		volt v = new volt(available);
		return convert(v, 12);
	}

	@Override
	public volt get3v() {
		volt v = new volt(available);
		return convert(v, 3);
	}

	private volt convert(volt v, int i) {
		int reduce = v.getVolt() - i;
		System.out.print("reduce volt: " + reduce + "  availabale now: ");
		return new volt(v.getVolt() - reduce);
	}

}
