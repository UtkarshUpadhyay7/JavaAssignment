package medium;
import java.util.Scanner;




public class ElectricityBill {

	public static void main(String[] args) {
		
	//Electricity Bill Category 
		
		// 1] Creating Scanner class
		
		Scanner sc  =  new Scanner(System.in);
		
		
		//2 ] creating an input
		
		
		System.out.println("Enter the units of electricity consumed ");
		int units = sc.nextInt();
		
		//3] Main logic and output 
		
		//Nested  if else
		
		if(units <=100) {
			System.out.println("There is low usage of electricity");
		}
		else {
			if  (units >100 && units <=300) {
			 System.out.println("There is medium usage of electricity");
			    }
		else  {
			 System.out.println("There is high usage of electricity");
		 }
	}
	
		
		
		sc.close();

	}

}
