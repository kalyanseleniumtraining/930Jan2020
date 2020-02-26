package firstJavaPackage;

public class FirstJavaClass {
	int a = 10;
	String str = "selenium webdriver";
	boolean b = true;
	char ch = 'a';

	public int add(int a, int b) {

		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		FirstJavaClass fjc1 = new FirstJavaClass();
		int c = fjc1.add(1111, 4212);
		System.out.println(c);
		System.out.println(fjc1.a);
		System.out.println(fjc1.str);
		System.out.println(fjc1.b);
		System.out.println(fjc1.ch);

	}

}
