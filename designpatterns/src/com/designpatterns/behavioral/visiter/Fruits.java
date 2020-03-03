package com.designpatterns.behavioral.visiter;

public class Fruits implements Itemsvisitor {
	String name;
	int price;

	public Fruits(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int accept(Shopcarts visit) {
		// TODO Auto-generated method stub
		return visit.visit(this);
	}

}
