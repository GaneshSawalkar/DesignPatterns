package com.designpatterns.behavioral.visiter;

public class Shoping implements Shopcarts {

	@Override
	public int visit(Book b) {

		return b.price;
	}

	@Override
	public int visit(Fruits f) {

		return f.price;
	}

}
