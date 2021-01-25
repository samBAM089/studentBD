package model;

public class StudentDB {

    Student[] students;

    //Constructor
    public StudentDB(Student[] students) {
        // Array wird in this.student gespeichert
        this.students = students;
    }

    public Student[] list() {
        // gib den Array this.students aus
        return this.students;

    }
    public String toString(){
        String result = "";
        for (int i = 0; i < this.students.length; i++) {
            result += this.students[i].getFirstName()
        }

    }


}
