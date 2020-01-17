package visitor;

public class Book implements itemsvisitor {
	String id;
	int price;

	public Book(String id, int price) {
		super();
		this.id = id;
		this.price = price;
	}

	@Override
	public int accept(shopcarts visit) {
		// TODO Auto-generated method stub
		return visit.visit(this);
	}

}
