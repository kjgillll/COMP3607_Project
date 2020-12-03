import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.util.ArrayList;
public class StudentCSTest {
    private StudentCS Bob;
    private ArrayList<Courses> courses = new ArrayList<>();
    Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 

    Courses comp2601 = new Courses("COMP 2601", 3, comp1600, "Computer Architechture");   



    public StudentCSTest(){}

    @BeforeEach
    public void setUp(){
        courses.add(comp1600);  
        Bob = new StudentCS("Bob Saget", "Physics", 2.00, courses);
    }


    @Test
    public void testGetRegisteredCourses(){
        Bob.register(comp2601);
        ArrayList<Courses> expected = new ArrayList<>();
        expected.add(comp2601);
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
    public void testGetAvailableCourses(){
        ArrayList<Courses> expected = new ArrayList<Courses>();
        expected.add(comp2601);
        ArrayList<Courses> actual = Bob.getAvailableCourses();
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
        String expected = "Computer Science";
        String actual = Bob.getMinor();
        assertEquals(expected, actual);
    }
}
