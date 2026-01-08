package medium;
import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		 //Employee Bonus Eligibility
		
		//1] Creating an Scanner Class
		
		Scanner sc = new Scanner(System.in);
		
		
		// 2] Taking an INPUT
		
		
		// taking Salary
		System.out.println("Enter the Salary of an employee ");
		int salary = sc.nextInt();
		
		// taking experience
		System.out.println("Entere the employee experience");
		int exp = sc.nextInt();
		
		// 3] Main logic and Output
		
		if(salary >= 30000 && exp >= 3) {
			System.out.println("Employee is Eligible for bonus");
		}
		else {
			System.out.println("Employee is Uneligible for bonus");
		}
		
		
		sc.close();

	}

}
