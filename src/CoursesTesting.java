import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CoursesTesting {
    private Courses comp2601;
    private StudentCS Bob;
    private ArrayList<Courses> courses = new ArrayList<>();
    Courses comp1600 = new Courses("COMP 1600", 3, null, "Introduction to Computing Concepts");
       
    public CoursesTesting(){}
    
    @Before
    public void setUp(){
        courses.add(comp1600);
        comp2601 = new Courses("COMP 2601", 3, comp1600, "Computer Architecture");
        Bob = new StudentCS("Bob Saget", "Physics", 2.00, courses);
    }
    
    @After
    public void tearDown(){
        courses.remove(comp1600);
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
