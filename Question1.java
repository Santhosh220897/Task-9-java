package task9;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Task9 - Question9 - Palindrome or not
		
		
		// storing string & rev string variable
		String str , revStr = "";
		
		// importing scanner class for str variable.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String =" );
		
		// input - malayalam
		
		str = sc.nextLine();
		
		// integer len is defined to identify the length of str variable
		
		int len = str.length();
		
		// for loop is used 
		
		for (int i = len-1; i>=0; i--) {
			
			revStr =revStr + str.charAt(i);
			
		}
		
		// if else statement is check the str variable matches revstr variable
			
			if (str.equals(revStr)) {
				
				System.out.println(str +" is a palindrome string");
				
			}
			else {
				System.out.println(str +" is not a palindrome string");
			}
			
			
		
	}
}

// output

// malayalam is a palindrome string

