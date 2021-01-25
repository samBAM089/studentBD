import model.Student;
import model.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDBTest {

    @Test
    public void constructorTester() {
        //given
        //erstelle neuen Array und neues Objekt der Klasse StudentDB
        Student[] students = {
                new Student("Sam", 1, "male"),
                new Student("Daniel", 2, "male"),
                new Student("Katharina", 3, "female"),
        };
        StudentDB db = new StudentDB(students);
        //when
        // db.list() liest array aus, welches in Ziele 18 erzeugt wurde
        Student[] result = db.list();
        //then
        assertArrayEquals(students, result);
    }

    @Test
    public void toStringTester() {
        //given
        Student[] students = {
                new Student("Sam", 1, "male"),
                new Student("Daniel", 2, "male")
        };
        StudentDB db = new StudentDB(students);
        //when
        //wie soll der reuslt aussehen: "Sam has matriculationnumber 1 and is male"
        String result = db.toString();
        //then
        assertEquals("Sam has matriculationnumber 1 and is male", result);
    }
}
