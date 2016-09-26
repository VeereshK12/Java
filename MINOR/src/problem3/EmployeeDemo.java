package problem3;

import java.util.Scanner;

public class EmployeeDemo {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		System.out.println("ENTER NAME");
		String name=sc1.nextLine();
		System.out.println("ENTER ID AND BASIC SALARY");
		int id=sc.nextInt();		
		float salary=sc.nextFloat();
		Employee veer= new Employee(id, name, salary);
		veer.calNetsalary();
		veer.display();
		
	}

}
