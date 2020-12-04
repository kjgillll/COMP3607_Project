import java.util.ArrayList;
/** 
 * The Department Course stores the different course available 
 * for a degree programme.
 */
public class Department implements CourseListing {
    private ArrayList<Courses> departmentCourses;  

    public Department(){ 
        this.departmentCourses = new ArrayList<Courses>(); 
    }
    /**
     * The getAvailable Function traverses all the Avaiable couses for a
     * degree programme and if the Student contains the prerequisites for a course,
     * that course is added to a list of courses that would be recommended to the Student.
     */
    public boolean getAvailable(Student student){ 
        for(Courses obj : departmentCourses) {
            if(obj.getAvailable(student) == true){  
                student.setAvailableCourses(obj);
            }
        }
        return true;
    }

    public void addCourse(Courses course){ 
        this.departmentCourses.add(course);
    } 

    public void removeCourse(Courses course){ 
        this.departmentCourses.remove(course);
    }
    /**
     * The getCourses returns a list of Courses for the degree programme.
     * @return
     */
    public ArrayList<Courses> getCourses(){ 
        return this.departmentCourses;
    }

}