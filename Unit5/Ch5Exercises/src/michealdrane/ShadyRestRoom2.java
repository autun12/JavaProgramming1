package src.michealdrane;

import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose 1 for a queen bed, 2 for a king bed, 3 for a king and a pullout couch");
        int n = scanner.nextInt();
    
        if(n >= 1 && n <= 3) {
            System.out.println("choose (1) lake view or a (2) park view");
            int m = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("You have choose queen bed");
                
                    if(m == 1) {
                        System.out.println("Cost: $140");
                    }
          
                    if(m == 2) {
                        System.out.println("Cost: $125");
                    }
                break;
                case 2:
                    System.out.println("You have choose king bed");
                    
                    if(m == 1) {
                        System.out.println("Cost: $154");
                    }
                    
                    if(m == 2) {
                        System.out.println("Cost: $139");
                    }
                break;
                case 3:
                    System.out.println("You have choose king and a pullout couch");
                    
                    if(m == 1) {
                        System.out.println("Cost: $180");
                    }

                    if(m == 2) {
                        System.out.println("Cost: $165");
                    }
                break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}