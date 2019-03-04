package src.michealdrane;

import src.michealdrane.BloodData;

public class TestBloodData {
    public static void main(String[] args) {

        BloodData bloodData1 = new BloodData();

        System.out.println("Blood Group : "+bloodData1.getBloodType());
        System.out.println("Rh Factor : "+bloodData1.getRhFact());
        System.out.println("Sets the blood Group as 'A' : ");
        bloodData1.setBloodType("A");
        
        System.out.println("Sets the Rh factor to '-' : ");
        bloodData1.setRhFact("-");

        System.out.println("After setting now gets the blood Group is : "+bloodData1.getBloodType());
        System.out.println("After setting now gets the Rh Factor is : "+bloodData1.getRhFact());

        System.out.println();
        BloodData bloodData2 = new BloodData("AB","-");
        System.out.println("Blood Group : "+bloodData2.getBloodType());
        System.out.println("Rh Factor : "+bloodData2.getRhFact());
    }
}