package basic;
import java.util.Scanner;

public class PostiveNegativeZero {

	public static void main(String[] args) {

        // To check the number is postive , negative and zero 
		 
		// 1]  Creating Scanner class
		
		Scanner sc = new Scanner(System.in);
		
		//2 ] Taking Input 
		
		System.out.println("Enter the Number !");
		int num = sc.nextInt();
		
//		3] logic and main portion 
		
		if(num >0) {
			System.out.println("The number is postive ");
		}
		else if(num <0) {
			System.out.println("The number is negative ");
		}
		else {
			System.out.println("The number is zero");
		}
		
		
		
		
		sc.close();
		

	}

}
