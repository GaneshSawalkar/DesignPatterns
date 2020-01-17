package visitor;

public class shoping implements shopcarts {

	@Override
	public int visit(Book b) {

		return b.price;
	}

	@Override
	public int visit(Fruits f) {

		return f.price;
	}

}
