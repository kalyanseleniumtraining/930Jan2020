package firstJavaPackage;

public class StringAdd {

	public String stradd(String a, String b) {

		String str = a + b;
		return str;

	}

	public static void main(String[] args) {
		StringAdd obj = new StringAdd();
		String result = obj.stradd("selenium ", "Training");
		System.out.println(result);
	}

}
