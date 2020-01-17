package visitor;

public class test {
	public static void main(String[] args) {
		itemsvisitor[] items = new itemsvisitor[] { new Book("11", 100), new Fruits("orange", 75),
				new Fruits("banana", 45) };
		int totalamount = getprice(items);

		System.out.println(totalamount);
	}

	private static int getprice(itemsvisitor[] items) {
		shoping shoping = new shoping();
		int sum = 0;
		for (itemsvisitor itemsvisitor : items) {
			sum += itemsvisitor.accept(shoping);
		}
		return sum;
	}
}
