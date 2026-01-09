package difficult;
import java.util.Scanner;

public class LoanApprovalSystem {
     public static void main(String [] args) {
        	
        	// Loan Approval System
        	
        	// 1] Taking Scanner Class
        	
        	Scanner sc = new Scanner(System.in);
        	
        	
        	//2] taking inputs 
        	 
        	// taking age 
        	System.out.println("Enter the age of the user");
        	int age = sc.nextInt();
        	  
        	
        	//monthly salary
        	
        	System.out.println("Enter the monthly Salary of the  user");
        	double salary = sc.nextDouble();
        	
        	// Credit score
        	
        	System.out.println("Enter the credit score of the user ");
        	int cscore = sc.nextInt();
        	
        	
        	//3] Main logic and output 
        	
        	// Nested if 
        	
//          if(age >=21 && salary >=25000 && cscore >700) {
//           	System.out.println("Loan approved");
//          }
//           else {
//            	System.out.println("loan is rejected");
//           }
//        	
//      
        	
        	if(age>21) {
        		if(salary>=25000) {
        			if(cscore>=700) {
        				System.out.println("Loan is Approved");
        				
        			}
        			else {
        				System.out.println("loan is rejected");
        			}
        		}
        		else {
        			System.out.println("Loan is rejected");
        		}
        		
        	}
        	else {
        		System.out.println("loan is rejected");
        	}

                  sc.close();
     }
 }
