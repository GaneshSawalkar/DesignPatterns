package com.designpatterns.behavioral.visiter;

public interface Shopcarts {
	int visit(Book b);

	int visit(Fruits f);
}
