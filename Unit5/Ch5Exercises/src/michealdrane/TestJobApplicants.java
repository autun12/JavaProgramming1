package src.michealdrane;

import src.michealdrane.JobApplicant;

public class TestJobApplicants {
    public static void main(String[] args) {
        JobApplicant applicant1 = new JobApplicant("Jason", "8927401244", true, true, true, true);   
        JobApplicant applicant2 = new JobApplicant("Alex", "8989865318", false, false, true, true);   
        JobApplicant applicant3 = new JobApplicant("Mike", "9425378987", true, false, true, true);   
        JobApplicant applicant4 = new JobApplicant("Mariam", "8989501244", true, true, false, true);   
        JobApplicant applicant5 = new JobApplicant("Chris", "7490990740", true, false, false, true);  

        if(applicant1.isQualified() == true) {
            System.out.println("Name: " + applicant1.getName() + "\n" + "Result: Qualified\n");
        } else {
            System.out.println("Name: " + applicant1.getName() + "\n" + "Result: Disqualified\n");
        }

        if(applicant2.isQualified() == true) {
            System.out.println("Name: " + applicant2.getName() + "\n" + "Result: Qualified\n");
        } else {
            System.out.println("Name: " + applicant2.getName() + "\n" + "Result: Disqualified\n");
        }

        if(applicant3.isQualified() == true) {
            System.out.println("Name: " + applicant3.getName() + "\n" + "Result: Qualified\n");
        } else {
            System.out.println("Name: " + applicant3.getName() + "\n" + "Result: Disqualified\n");
        }

        if(applicant4.isQualified() == true) {
            System.out.println("Name: " + applicant4.getName() + "\n" + "Result: Qualified\n");
        } else {
            System.out.println("Name: " + applicant4.getName() + "\n" + "Result: Disqualified\n");
        }

        if(applicant5.isQualified() == true) {
            System.out.println("Name: " + applicant5.getName() + "\n" + "Result: Qualified\n");
        } else {
            System.out.println("Name: " + applicant5.getName() + "\n" + "Result: Disqualified\n");
        }
    }
}