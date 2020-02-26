package practice;

public class Employee {

	String empName;
	String empId;
	String empDesg;
	String empSalary;

	public Employee(String empName, String empId, String empDesg, String empSalary) {

		this.empName = empName;
		this.empId = empId;
		this.empDesg = empDesg;
		this.empSalary = empSalary;

	}

	public static void main(String[] args) {

		Employee one = new Employee("ABC", "E1", "SE", "6 lakhs");
		System.out.println("First employee details");
		System.out.println(one.empName);
		System.out.println(one.empId);
		System.out.println(one.empDesg);
		System.out.println(one.empSalary);
		System.out.println("second employee details");
		Employee two = new Employee("XYZ", "E2", "SSE", "10 lakhs");
		System.out.println(two.empName);
		System.out.println(two.empId);
		System.out.println(two.empDesg);
		System.out.println(two.empSalary);

	}

}
