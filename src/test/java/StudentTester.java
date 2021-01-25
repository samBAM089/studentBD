import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTester {

    @Test
    public void constructorTest(){
        //given
        Student myStudent = new Student("Sam", 1, "male");
        //when

        String actualOutput = myStudent.toString();

        //then
        assertEquals("Sam 1 male", actualOutput);

    }



}
