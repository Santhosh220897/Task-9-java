package task9;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// task9 - Question 2 - Reverse string
		
		// storing string & rev string variable
		
		String str , revStr = "";

		// importing scanner class for str variable.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String =");
		
		// input = kandy
		
		str = sc.nextLine();
		
		// integer len is defined to identify the length of str variable
		
		int len = str.length();
		
		// for loop is used.
		
		for(int i = len -1; i>=0 ; i--) {
			
			revStr += str.charAt(i);
			
		}

		System.out.println("Reverse string ="+revStr);
	}

}

// output - Reverse string = ydnak
