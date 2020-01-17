package singletonpractice;

public class billpugh {
	public billpugh() {
	}

	private static class help {
		private static final billpugh b = new billpugh();
	}

	public static billpugh get() {
		return help.b;
	}

	public static void main(String[] args) {
		billpugh ts = get();
		System.out.println(ts.hashCode());
		billpugh ts1 = get();
		System.out.println(ts1.hashCode());
	}
}
