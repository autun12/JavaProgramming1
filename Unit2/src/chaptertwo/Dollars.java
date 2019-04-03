package src.chaptertwo;

import java.util.Scanner;

public class Dollars {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a dollar amount: ");
        int dollarAmount = keyboard.nextInt();

        int numTwenties = dollarAmount/20;
        int numTens = (dollarAmount - 20*numTwenties)/10;
        int numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        int numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));

        System.out.println("You have entered  $" + dollarAmount );

	System.out.println("$20 bills: " + numTwenties);
	System.out.println("$10 bills: " + numTens);
       	System.out.println("$5 bills: " + numFives);
	System.out.println("$1 bills: " + numOnes);
    }
}
