package model;

import java.util.Objects;

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


    @Override
    public String toString() {

        String printStudentInfo = firstName + " " + matriculationNumber + " " + gender;
        return printStudentInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculationNumber == student.matriculationNumber && Objects.equals(firstName, student.firstName) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, matriculationNumber, gender);
    }
}



