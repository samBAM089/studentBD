package model;

public class Student {

    private String firstName;
    private int matriculationNumber;
    private String gender;

    // Constructor
    public Student(String firstName, int matriculationNumber, String gender){
        this.firstName = firstName;
        this.matriculationNumber = matriculationNumber;
        this.gender = gender;
    }


    public String getFirstName(){
        return firstName;
            }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {

        String printStudentInfo = firstName + " " + matriculationNumber + " " + gender;
        return printStudentInfo;
    }




}



