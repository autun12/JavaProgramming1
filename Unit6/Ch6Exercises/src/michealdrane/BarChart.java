package src.michealdrane;

import java.util.Scanner;

public class BarChart {   
    public void displayBar(int playersPoints) {
        int points;
        for(points = 0; points < playersPoints; ++points) {
            System.out.print("*");
        }
        
        System.out.println();
    }

    public BarChart() {
        int artPoints, bobPoints, calPoints, danPoints, eliPoints;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter points scored by Art >> ");
        artPoints = input.nextInt();
        System.out.print("Enter points scored by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("Enter points scored by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("Enter points scored by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("Enter points scored by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println();
        System.out.println("Points for Game");
        System.out.println();
        System.out.print("Art   ");
        displayBar(artPoints);
        System.out.print("Bob   ");
        displayBar(bobPoints);
        System.out.print("Cal   ");
        displayBar(calPoints);
        System.out.print("Dan   ");
        displayBar(danPoints);
        System.out.print("Eli   ");
        displayBar(eliPoints);
    }

    public static void main(String[] args) {
        BarChart barChart = new BarChart();
      
   }
}