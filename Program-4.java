
// Program is done in java
package Package;

import java.util.Scanner;

public class program4_totalCount {
	public static void main(String[] args) {
		
		// Taking the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the length: ");
		// Taking the total length of an array
		int n = sc.nextInt();
		
		// Now taking the numbers till array length
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter the number: ");
			arr[i] = sc.nextInt();
		}
		
		// Now printing the inputs taken from the user
		System.out.print("\n" + "The element You have entered is: [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
		System.out.print("]");
		
		
		// Creating an Object
		Results t = new Results();
		t.getResult(arr, n);
		
	}
}

class Results{
	
	public void getResult(int arr[], int n){

		int c = arr.length;
		int count[] = new int[c];		
		
		// Now dividing the number from 1-9
		for(int i =1; i<10; i++) {
			for(int j=0; j<c; j++) {
				if(arr[j]%i == 0 ) {
					count[i]++;
				}
			
			}
		
		}
		
		// Now printing the result
		System.out.println();
		for(int i=1; i<10; i++) {
			System.out.print(i+":"+count[i] + ", ");
		} 
		
		
	}
}
