package overriding;

public class Parent {

	public void add() {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

	public void sub() {
		int a = 10;
		int b = 10;
		int c = a - b;
		System.out.println(c);
	}
}
