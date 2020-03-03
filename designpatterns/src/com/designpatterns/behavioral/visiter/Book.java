package com.designpatterns.behavioral.visiter;

public class Book implements Itemsvisitor {
	String id;
	int price;

	public Book(String id, int price) {
		super();
		this.id = id;
		this.price = price;
	}

	@Override
	public int accept(Shopcarts visit) {
		// TODO Auto-generated method stub
		return visit.visit(this);
	}

}
