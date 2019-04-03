package src.chaptertwo;
// Interactive program that converts Quarts to Gallon

import java.util.Scanner;

public class QuartsToGallonsInteractive {    
   public static void main(String[] args) {  
      final int QUARTS_IN_GALLON = 4; 
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;

      Scanner kb = new Scanner(System.in);
      System.out.print("Enter quarts needed >> ");
      quartsNeeded = kb.nextInt();

      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts.");
   }
}
