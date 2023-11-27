package task9;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// task9 -Question4- *patterns
		
		// input n =5
		
		//variable n is stored in integer 
		
		int n ;
		
		// implementing Scanner class to call n value
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value =");
		
		n = sc.nextInt();
		
		// nested for loop
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (i == j || i + j == n - 1) {
					
					System.out.print("*");
				} 
				else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println(" ");
		}

	}

}

// output

/* *   * 
    * *  
     *   
    * *  
   *   *  */


