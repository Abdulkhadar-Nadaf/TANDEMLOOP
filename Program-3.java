
// Programming done in java
package Package;

import java.util.Scanner;

public class Program3_SeriesOfNumber2 {
	public static void main(String[] args) {
		
		// taking the input form the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int input = sc.nextInt();
		
		// Creating an object
		result r = new result();
		r.getResult(input);
	}
}

class result{
	
	public void getResult(int input){
	
		// if input is 2 then it will return 1
		if(input==2) {
			System.out.println("1");
		}
		// if input is not equal to 2 then below procedure will execute
		else if (input!=2) {
			for(int i =1, p=1; i<=input; i++, p=p+2) {
				System.out.print(p +" ");
				}
		} else {
			System.out.println("Please enter a number");
		}		
	}
	
}
