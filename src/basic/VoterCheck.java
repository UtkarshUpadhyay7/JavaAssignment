package basic;
import java.util.Scanner;

public class VoterCheck {

	public static void main(String[] args) {
		
		// Check voter Eligibility 
		
		
		// 1] created input object
		Scanner sc = new Scanner(System.in);
		
		// 2] Entering the input 
		
		System.out.println("Enter the voter age !");
		int age = sc.nextInt();
		
		
		// 3] Logic 
		if(age >= 18) {
			System.out.println("Voter is Eligible to vote !!");
		}
		else {
			System.out.println("Voter is not eligible to vote");
		}	

		sc.close();
	}

}
