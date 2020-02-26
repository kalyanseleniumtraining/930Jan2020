package overriding;

public class Child extends Parent {

	public void sub() {
		System.out.println(20 - 10);

	}

	public static void main(String[] args) {

		Child obj = new Child();
		obj.add();
		obj.sub();

	}

}
