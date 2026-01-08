package basic;
import java.util.Scanner;
public class MinimumBalance {

	public static void main(String[] args) {
	
		// Minimum Balance Check 
		
		// 1] Creating Scanner Class
		
		Scanner sc = new  Scanner(System.in);
		
		
		// 2] Taking Input 
		
		System.out.println("Enter the amount !");
		double balance = sc.nextDouble();
		
		
		// 3] logic and Output 
		
		if(balance >= 1000) {
			System.out.println("Balance is sufficient ");
		}
		else {
			System.out.println("Balance is low ");
		}
		
		sc.close();
	}

}
