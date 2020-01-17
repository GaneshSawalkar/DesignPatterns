package proxypattern;

public class proxylogin implements logins {
	private logins log;
	private boolean isauthorised;

	public proxylogin(String username, String pass) {
		if (username.equals("admin") && pass.equals("123")) {
			System.out.println("ok");
			isauthorised = true;
			log = new loginsimplement();

		}
	}

	@Override
	public void login() {
		if (isauthorised) {
			open();
		} else {
			System.out.println("only authoriesed have access");
		}

	}

	private void open() {
		System.out.println("welcome to bridgelabz");

	}

}
