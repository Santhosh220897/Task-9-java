package task9;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// task9 - Question5 - Students Grading system
		
		// input - 90
		
		// initializing the mark in integer.
		
		int mark;
		
		//importing scanner class for the input
		
		Scanner sc = new Scanner(System.in);
		
		// enter the mark in console
		
		System.out.println("Please enter the Mark =");
		
		mark = sc.nextInt();
		
		// else if statement is used to identify the grade
		
		if (mark==100) {
			
			System.out.println("Student Grade = S" );
		}
		else if (mark<=99 && mark>=90) {
			
			System.out.println(" Student Grade = A");
		}
		else if (mark<=89 && mark>=80) {
			
			System.out.println("Student Grade = B");
			
		}
		else if (mark<=79 && mark>=70) {
			
			System.out.println("Student Grade = c");
		}
		else if (mark<=69 && mark>=60) {
			
			System.out.println("Student Grade = D");
		}
		else if (mark<=59 && mark>=50) {
			
			System.out.println("Student Grade = E");
			
		}
		// if input is given below 50 output will be student is fail 
		
		else if (mark<=50) {
			
			System.out.println("Student is fail");
		}
		
		// if mark is given above 100 output will be invalid input
		else {
			
			System.out.println("Invalid input");
				
		}
		

	}

}

// output = Student Grade = A
