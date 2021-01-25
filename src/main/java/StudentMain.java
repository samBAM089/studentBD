import model.Student;

public class StudentMain {

    public static void main(String[] args) {
        Student samuelNgo = new Student("Sam", 1, "male");
       Student samuelN = new Student( "Sam", 2, "male");

               boolean sameStudent = samuelNgo.equals(samuelN);

        System.out.println(sameStudent);

        int idSamuelNgo = samuelNgo.hashCode();
        System.out.println(idSamuelNgo);
        System.out.println(samuelN.hashCode());


    }


}
