import java.util.ArrayList; 
/** 
 * The Coures class models the Courses available for a 
 * the Information Technology and Computer Science Degree Programme.
 */
public class Courses implements CourseListing {
    private String courseCode;  
    private String title;
    private Courses prerequisite;  

    public Courses(String courseCode,int credits,Courses prerequisite,String title){ 
        this.courseCode = courseCode; 
        this.prerequisite = prerequisite; 
        this.title = title;
    }  
    /** 
     * The getAvailable Function searches through the Student's Completed Courses 
     * to see if they contain the prerequisites for a given Course.
     */
    public boolean getAvailable(Student student){   
        ArrayList<Courses> studentCourses = student.getCompletedCourses();  

        for(Courses obj: studentCourses){  
            if ((this.prerequisite == null)  || (obj.getCourseCode().equals(this.getCourseCode()))) return false;
        }

        for(Courses obj: studentCourses){    
            if (obj.getCourseCode().equals(this.prerequisite.getCourseCode() )) return true;
        }
        return false;
    } 
    /**
     * The getCourseCode Function returns the Course Code and Title for a given Course.
     * @return
     */
    public String getCourseCode(){ 
        return this.courseCode+" "+this.title;
    }//end getCourseCode()


}//end Courses()
