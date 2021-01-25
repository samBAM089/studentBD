import model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTester {

    @Test
    public void constructorTest() {
        //given
        Student myStudent = new Student("Sam", 1, "male");
        //when

        String actualOutput = myStudent.toString();

        //then
        assertEquals("Sam 1 male", actualOutput);

    }

    @Test
    public void methodEqualsTester(){
        Student samuelNgo = new Student("Sam", 1, "male");
        Student samuelN = new Student("Sam", 1, "male");

        boolean result = samuelNgo.equals(samuelN);

        assertEquals(true, result);

    }
/*
    @ParameterizedTest
    @MethodSource

    public void methodHAshcodeTester(){String firstName, int matriculationNumber, String gender, boolean expected){

        boolean result = new Student().equals(new Student);

        assertEquals(expected, result);
    }
    private static Stream<Arguments> methodHAshcodeTester(){
        return Stream.of(
                Arguments.of("Sam", 1, "male", true),
                Arguments.of("Sam", 2, "male", false)

        );
    }
*/

}
