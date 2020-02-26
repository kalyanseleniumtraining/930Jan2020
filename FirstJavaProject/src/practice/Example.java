package practice;

public class Example {

	String empName;
	String empId;
	String empDesg;
	String empSalary;

	public void test(String a, String b, String c, String d) {

		empName = a;
		empId = b;
		empDesg = c;
		empSalary = d;

	}
	
	public static void main(String[] args) {
		
		Example one = new Example();
		one.test("", "", "", "");
		
	}
}
