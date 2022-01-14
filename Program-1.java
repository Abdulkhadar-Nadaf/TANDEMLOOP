
// Program is done in Java
package Package;

import java.util.Scanner;

public class Program1_Calculator {
	public static void main(String[] args) {
		
		System.out.println("This is small calculator");
		
		// taking the input from the user
		Scanner sc = new Scanner(System.in);
		
		// First number
		System.out.print("Enter the First Number: ");
		double num1 = sc.nextDouble();
		
		// Which operator he want to assign
		System.out.print("Select opreator: +, -, *, / : ");
		String operator = sc.next();
		
		//Second Number
		System.out.print("Enter the second Number: ");
		double num2 = sc.nextDouble();
		
		// Creating an object
		calulator c = new calulator();
		c.getResult(num1, operator, num2);
	}
}


class calulator{
	
	public void getResult(double num1, String operator, double num2) {
		
		// String to char
		char s = operator.charAt(0);
		
		// used switch case
		switch (s) {
			
		// Addition
		case '+':
			double result = num1 + num2;
			System.out.print("The output of" + num1 +" & "+num2 + " is: " +result);
			break;
			
		// Subtraction
		case '-' : 
			double result1 = num1 - num2;
			System.out.print("The output of" + num1 +" & "+num2 + " is: " +result1);
			break;
		
		// Multiplication
		case '*' : 
			double result2 = num1 * num2;
			System.out.print("The output of" + num1 +" & "+num2 + " is: " +result2);
			break;
		
		// Division
		case '/' : 
			double result3 = num1 / num2;
			System.out.print("The output of" + num1 +" & "+num2 + " is: " +result3);
			break;	
		
		// If the operator assigned invalid operator
		default : 
			System.out.println("Please enter valid operator");
			break;
			
		}
	}
	
}
