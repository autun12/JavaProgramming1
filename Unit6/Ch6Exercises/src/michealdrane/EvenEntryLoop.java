package src.michealdrane;

import java.util.Scanner;

public class EvenEntryLoop {
	public static void main(String[] args) {
		int userNum;
      	int result;
      	
		Scanner input = new Scanner(System.in);
      	System.out.print("Please enter an even number or 999 to exit... ");
      	
		userNum = input.nextInt();
      	result = userNum % 2;
      	
		while(userNum != 999) {
        	while(result != 0) {
            	System.out.println("You did not enter an even number.");
            	System.out.print("Please enter an even number... ");
            	userNum = input.nextInt();
            	result = userNum % 2;
         	}   
            
			System.out.println("Good job!");
            System.out.print("Please enter an even number or 999 to exit... ");
            userNum = input.nextInt();
            result = userNum % 2;
		}
	}
}