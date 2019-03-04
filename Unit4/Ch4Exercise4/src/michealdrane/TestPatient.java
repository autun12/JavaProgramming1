package src.michealdrane;

public class TestPatient {
    public static void main(String[] args) {
        
        Patient patient = new Patient();
        System.out.println("ID Number is : " + patient.getIdNumber());
        System.out.println("Age is : " + patient.getAge());
        System.out.println("Blood Type Group: " + patient.getBloodData());

        System.out.println("Sets the ID Number to '21' : ");
        patient.setIdNumber(21);

        System.out.println("Sets the Age to '42' : ");
        patient.setAge(42);

        System.out.println("After setting now gets the Id Number is : " + patient.getIdNumber());
        System.out.println("After setting now gets the Age is : " + patient.getAge());
    }
}