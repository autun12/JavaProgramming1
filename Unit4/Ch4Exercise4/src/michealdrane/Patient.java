package src.michealdrane;

import src.michealdrane.BloodData;

public class Patient {
   private int IdNumber,age;
   private BloodData bloodData;

    public Patient() {
        IdNumber = 10;
        age = 25;
        bloodData = new BloodData();
        bloodData.setBloodType("O");
        bloodData.setRhFact("+");
    }

   public Patient(int IdNumber, int age, BloodData bloodData) {
        this.IdNumber = IdNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(int IdNumber) {
        this.IdNumber = IdNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodData() {
        return bloodData.toString();
    }

    public void setbloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }
}