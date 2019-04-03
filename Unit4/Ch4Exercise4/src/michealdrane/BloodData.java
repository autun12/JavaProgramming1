package src.michealdrane;

public class BloodData {
    
    private String bloodType;
    private String rhFact;

    public BloodData() {
        bloodType = "O";
        rhFact = "+";
    }

    public BloodData(String bloodType, String rhFact) {
        this.bloodType = bloodType;
        this.rhFact = rhFact;
    }

    public String getRhFact() {
        return rhFact;
    }

    public void setRhFact(String rhFact) {
        this.rhFact = rhFact;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String toString(){
 		return "BloodType: " + bloodType + " RH factor: " + rhFact;
 	}
}