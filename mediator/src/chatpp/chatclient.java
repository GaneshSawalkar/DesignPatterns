package chatpp;

public class chatclient {
	public static void main(String[] args) {
		chatApp app = new ChatAppimp();
		User user1 = new userimp(app, "amit");
		User user2 = new userimp(app, "ajay");
		User user3 = new userimp(app, "akash");
		User user4 = new userimp(app, "ajit");
		app.adduser(user1);
		app.adduser(user2);
		app.adduser(user3);
		app.adduser(user4);
		user1.send("hi....");
	}
}
