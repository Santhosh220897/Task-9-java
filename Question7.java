package task9;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// task9- Question7 Largest among three numbers
		
		// initializing the three variables using integer.
		
		// input a = 40,b= 50,c= 10;
		
		int a,b,c;
		
		// implementing the scanner class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		
		a = sc.nextInt();
		
		System.out.println("Enter the value of b :");
		
		b = sc.nextInt();
		
		System.out.println("Enter the value of c :");
		
		c = sc.nextInt();
		
		// using else-if statement to identify the largest number among three.
		
		if(a>=b && a>=c) {
			
			System.out.println(a +" is the largest number");
		}
		else if(b>=a && b>=c) {
			
			System.out.println(b +" is the largest number");
		}
		
		else {
			
			System.out.println(c +" is the largest number");
		}
		

	}

}

// output = 50 is the largest number.