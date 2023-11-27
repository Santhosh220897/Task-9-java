package task9;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// task9-Question6 - tariff for room rent
		
		// initializing the variables.
		
		// Input month - 4; room rent = 2200.50; no of days = 2
		
		int month;
		float roomRent;
		int days;
		
		//importing scanner class for the inputs
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the month :");
		
		month = sc.nextInt();
		
		System.out.println("Please enter the Room rent");
		
		roomRent = sc.nextFloat();
		
		System.out.println("Please enter the no.of days");
		
		days = sc.nextInt();
		
		
		float tariff;
		
		
		//using switch statement for month variable to show increase in tariff by 20%
		
		switch(month) {
		
		case 4:
		
		case 5:
		
		case 6:
			
		case 7:
			
		case 11:
			
		case 12:
			
			// if the month is given in between the 4-6 & 11-12 below tariff will be shown as output with 20% increase
			
			tariff =(float) (roomRent*1.2*days);
			
			System.out.println("Tariff for the room with 20% increase :"+tariff);
			
			break;
			
			// if the month is given in normal days by default this function will be executed.
			
			default:
				
				tariff = (roomRent * days);
				
				System.out.println("Tariff of the room in normal months :" +tariff);
				
				break;
			
		}
		
	}

}

// output = tariff for the room with 20% increase :5281.20
