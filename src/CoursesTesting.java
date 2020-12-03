import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CoursesTesting {
    private Courses comp2601;
    private StudentCS Bob;
    private ArrayList<Courses> courses = new ArrayList<>();
    Courses comp1600 = new Courses("COMP 1600", 3, null, "Introduction to Computing Concepts");
       
    public CoursesTesting(){}
    
    @BeforeEach
    public void setUp(){
        courses.add(comp1600);
        comp2601 = new Courses("COMP 2601", 3, comp1600, "Computer Architechture");
        Bob = new StudentCS("Bob Saget", "Physics", 2.00, courses);
    }

    @Test
    public void testGetCourseCode(){
        String expected = "COMP 2601 Computer Architecture";
        String result = comp2601.getCourseCode();
        assertEquals(expected,result);
    }

    @Test
    public void testGetAvailable(){
        Boolean expected = true;
        Boolean actual = comp2601.getAvailable(Bob);
        assertEquals(expected, actual);
    }
}
