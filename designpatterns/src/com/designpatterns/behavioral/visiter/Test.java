package com.designpatterns.behavioral.visiter;

public class Test {
	public static void main(String[] args) {
		Itemsvisitor[] items = new Itemsvisitor[] { new Book("11", 100), new Fruits("orange", 75),
				new Fruits("banana", 45) };
		int totalamount = getprice(items);

		System.out.println(totalamount);
	}

	private static int getprice(Itemsvisitor[] items) {
		Shoping shoping = new Shoping();
		int sum = 0;
		for (Itemsvisitor itemsvisitor : items) {
			sum += itemsvisitor.accept(shoping);
		}
		return sum;
	}
}
