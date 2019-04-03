package src.michealdrane;

import src.michealdrane.Sandwich;

public class TestSandwich {

    public TestSandwich() {
        Sandwich sandwich1 = new Sandwich("rye", 50.0, "egg salad", 150.0);
        displaySandwichInfo(sandwich1, 1);
        Sandwich sandwich2 = new Sandwich("wheat", 75.0, "cheese", 250.0);
        displaySandwichInfo(sandwich2, 2);
        Sandwich sandwich3 = new Sandwich("white", 150.0, "green salad", 50.0);
        displaySandwichInfo(sandwich3, 3);
    }

    public void displaySandwichInfo(Sandwich sandwich, int sandwichNumber) {
        System.out.println("");
        System.out.println("MOTTO: " + sandwich.getBreadType().MOTTO);
        System.out.println("---------- BREAD " + sandwichNumber + " -----------");
        System.out.println("Bread Type:             " + sandwich.getBreadType().getBreadType());
        System.out.println("Calories per slice:     " + sandwich.getBreadType().getCalPerSlice());
        System.out.println("Filling Type:           " + sandwich.getSandwichFilling().getFillingType());
        System.out.println("Bread Type:             " + sandwich.getSandwichFilling().getCalPerServing());
        System.out.println("Total Calories:         " + getTotalCalories(sandwich));
    }

    public double getTotalCalories(Sandwich sandwich) {
        double breadCalories = sandwich.getBreadType().getCalPerSlice();
        double sandwichFillingCalories = sandwich.getSandwichFilling().getCalPerServing();
        double calories = breadCalories + breadCalories + sandwichFillingCalories;
        return calories;
    }

    public static void main(String[] args) {
        TestSandwich testSandwich = new TestSandwich();
    }
}
