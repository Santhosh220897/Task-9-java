package task9;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// task3 - Question 3 - pattern
		
		
		// input -1
		
		// variable n and value 1 is stored as integer
		
		int n;
		
		//Scanner class is implemented
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value =");
		
		n = sc.nextInt();
		
		// nested for loop is used
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print((n++) +" ");
				
			}

			System.out.println( );
		}
		
			
	}

}

// output 
/*1 
  2 3 
  4 5 6 
  7 8 9 10 */

