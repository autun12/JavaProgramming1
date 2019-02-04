package src.michealdrane;

public class Bread {
    private String breadType;
    private double calPerSlice;
    public static final String MOTTO = "The staff of life";

    public Bread() {
        breadType = "rye";
        calPerSlice = 50.0;
    }

    public Bread(String breadType, double calPerSlice) {
        this.breadType = breadType;
        this.calPerSlice = calPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getCalPerSlice() {
        return calPerSlice;
    }

    public void setCalPerSlice(double calPerSlice) {
        this.calPerSlice = calPerSlice;
    }
}
