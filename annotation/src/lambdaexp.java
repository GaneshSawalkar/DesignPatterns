
public class lambdaexp {
	interface FuncInter2 {
		void sayMessage(String message);
	}

	@noused(desc = "", name = "")
	public static void main(String[] args) {

		FuncInter2 fobj = message -> System.out.println("Hello " + message);
		fobj.sayMessage("ganesh");
		fobj.sayMessage("ajit");
		System.out.println(lambdaexp.class.getInterfaces().hashCode());

	}

}
