package src.michealdrane;

import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose 1 for a queen bed, 2 for a king bed, 3 for a king and a pullout couch");
        int n = scanner.nextInt();

        if(n >= 1 && n <= 3) {
            switch (n) {
                case 1:
                    System.out.println("You have choose queen bed");
                    System.out.println("Cost: $125");
                break;
                case 2:
                    System.out.println("You have choose king bed");
                    System.out.println("Cost: $139");
                break;
                case 3:
                    System.out.println("You have choose king and a pullout couch");
                    System.out.println("Cost: $165");
                break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}