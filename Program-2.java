
// Program was done in java
package Package;

import java.util.Scanner;

public class Program2_SeriesofNumber1 {
	public static void main(String[] args) {
		
		// Taking the input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		int input = sc.nextInt();
		
		// Creating an object
		Series s = new Series();
		s.getResult(input);
	}
}

class Series{
	
	// getting the result number of series
	public void getResult(int input) {
		
		// printing i for rows<input and printing p with addition of 2
		for(int i=1, p=1; i<=input; i++, p=p+2) {
			System.out.print(p + " ");
		}
	}		
}
