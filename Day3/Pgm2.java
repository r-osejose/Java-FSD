package Day3;
	class Member {
		String name;
		int age;
		String phone;
		String address;
		int salary;
		
		public void printsalary()
		{
			System.out.println("Salary is : " +salary);
		}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

public class Pgm2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Chinnu";
		emp.salary = 14710;
		emp.printsalary();
		
		Manager mng = new Manager();
		mng.salary = 22000;
	}

	}

}
