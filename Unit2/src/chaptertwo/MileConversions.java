package src.chaptertwo;

import java.util.Scanner;

public class MileConversions {
    public static final double INCHES_IN_MILE = 63360.0;
    public static final double FEET_IN_MILE = 5280.0;
    public static final double YARDS_IN_MILE = 1760.0;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float miles;
        System.out.print("Please enter a distance in miles: ");
        miles = sc.nextFloat();
        
        System.out.println(miles + " miles is " + INCHES_IN_MILE*miles +" inches,or "
        + FEET_IN_MILE*miles +" feet,or " +  YARDS_IN_MILE*miles +" yards");
    }
}
