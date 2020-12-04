import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
public class StudentITTest{
    private StudentIT Bob;
    private ArrayList<Courses> courses = new ArrayList<Courses>();
    private Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts");
    private Courses info2603 = new Courses("INFO 2603", 3, info1600, "Platform Technologies");

    @Before
    public void setUp(){
        courses.add(info1600);
        Bob = new StudentIT("Bob Saget","Physics", 2.00, courses);
    }
    
    @After
    public void tearDown(){
        courses.remove(info1600);    
    }

    @Test
    public void testGetRegisteredCourses(){
        Bob.register(info2603);
        ArrayList<Courses> expected = new ArrayList<Courses>();
        expected.add(info2603);
        ArrayList<Courses> actual = Bob.getRegisteredCourses();
        assertEquals(expected, actual);
    }


    @Test
    public void testGetCompletedCourses(){
        ArrayList<Courses> expected = courses;
        ArrayList<Courses> actual = Bob.getCompletedCourses();
        assertEquals(expected, actual);  
    }

    @Test
    public void testGetName(){
        String expected = "Bob Saget";
        String actual = Bob.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMajor(){
        String expected = "Physics";
        String actual = Bob.getMajor();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMinor(){
        String expected = "Information Technology";
        String actual = Bob.getMinor();
        assertEquals(expected, actual);
    }

}
