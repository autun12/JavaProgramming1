package src.michealdrane;

public class SandwichFilling {
    private String fillingType;
    private double calPerServing;

    public SandwichFilling() {
        fillingType = "egg salad";
        calPerServing = 150.0;
    }

    public SandwichFilling(String fillingType, double calPerServing) {
        this.fillingType = fillingType;
        this.calPerServing = calPerServing;
    }

    public String getFillingType() {
        return fillingType;
    }

    public void setFillingType(String fillingType) {
        this.fillingType = fillingType;
    }

    public double getCalPerServing() {
        return calPerServing;
    }

    public void setCalPerServing(double calPerServing) {
        this.calPerServing = calPerServing;
    }
}
