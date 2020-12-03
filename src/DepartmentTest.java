import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
public class DepartmentTest {
    Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts");
    Courses comp2601 = new Courses("COMP 2601", 3, comp1600, "Computer Architechture");
    ArrayList<Courses> deptCourses = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();
    Department dept = new Department();
    StudentCS Bob;

    DepartmentTest(){};

    @BeforeEach
    public void setUpClass(){
        courses.add(comp1600);
        Bob = new StudentCS("Bob Saget", "Physics", 2.00, courses);
        deptCourses.add(comp2601);
        dept.addCourse(comp2601);
    }

    @AfterEach
    public void tearDown(){
        courses.remove(comp1600);
        dept.removeCourse(comp2601);
        deptCourses.remove(comp2601);
    }

    @Test
    public void testGetAvailable(){
        Boolean expected = true;
        Boolean actual = dept.getAvailable(Bob);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCourses(){
        ArrayList<Courses> expected = deptCourses;
        ArrayList<Courses> actual = dept.getCourses();
        assertEquals(expected, actual);
    }

}
