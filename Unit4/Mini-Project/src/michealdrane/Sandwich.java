package src.michealdrane;

import src.michealdrane.Bread;
import src.michealdrane.SandwichFilling;

public class Sandwich {
    private Bread breadType;
    private SandwichFilling sandwichFilling;

    public Sandwich(String enterBreadType, double enterBreadCalories, String enterFillingType, double enterFillingCalories) {
        breadType = new Bread(enterBreadType, enterBreadCalories);
        sandwichFilling = new SandwichFilling(enterFillingType, enterFillingCalories);
    }

    public Bread getBreadType() {
        return breadType;
    }

    public void setBreadType(Bread breadType) {
        this.breadType = breadType;
    }

    public SandwichFilling getSandwichFilling() {
        return sandwichFilling;
    }

    public void setSandwichFilling(SandwichFilling sandwichFilling) {
        this.sandwichFilling = sandwichFilling;
    }
}