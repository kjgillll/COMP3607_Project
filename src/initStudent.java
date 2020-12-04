import java.util.ArrayList;
import java.util.ListIterator;
/** 
 * The initStudent class takes the data retrieved from the Student's Transcript and 
 * returns a Student Object.
 */
public class initStudent {
    /**
     * The initStudent create either a StudentCS or StudentIT based on data read from the 
     * Student's Transcript
     * @param studentInfo
     * @return
     */
    public Student initStudentObject(ArrayList<String> studentInfo){  
        if (studentInfo.get(2).equals("Computer Science")){  
            StudentCS student = new StudentCS(studentInfo.get(0), studentInfo.get(1), Double.valueOf(studentInfo.get(3)), csComplete(studentInfo));
            return student;
        }else{ 
            StudentIT student = new StudentIT(studentInfo.get(0), studentInfo.get(1), Double.valueOf(studentInfo.get(3)), itComplete(studentInfo));
            return student;
        }
    }
    /**
     * The csComplete function creates Course Objects that correspond to the Courses read 
     * from the Student's transcript.
     * @param studentInfo
     * @return
     */
    public ArrayList<Courses> csComplete(ArrayList<String> studentInfo){  
        ArrayList<Courses> studentCourses = new ArrayList<Courses>(); 
        ArrayList<Courses> csCourses = new initCSDepartment().initDepartment();
        ListIterator<String> it = studentInfo.listIterator(4);
        while (it.hasNext()) { 
            String temp = it.next();
            for(Courses obj: csCourses){  
                if (obj.getCourseCode().equals(temp) ){ 
                    studentCourses.add(obj);
                }
            }
        }
        return studentCourses;
    }
    /**
     * The itComplete function creates Course Objects that correspond to the Courses read 
     * from the Student's transcript.
     * @param studentInfo
     * @return
     */
    public ArrayList<Courses> itComplete(ArrayList<String> studentInfo){  
        ArrayList<Courses> studentCourses = new ArrayList<Courses>(); 
        ArrayList<Courses> itCourses = new initITDepartment().initDepartment();
        ListIterator<String> it = studentInfo.listIterator(4);
        while (it.hasNext()) { 
            String temp = it.next();
            for(Courses obj: itCourses){  
                if (obj.getCourseCode().equals(temp) ){ 
                    studentCourses.add(obj);
                }
            }
        }
        return studentCourses;
    }
   
}
