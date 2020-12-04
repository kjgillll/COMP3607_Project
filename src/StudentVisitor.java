import java.util.ArrayList;
/** 
 * The StudentVistitor class implements different versions 
 * of behaviour based on the type of the object that is passed
 * to it.
 */
public class StudentVisitor implements Visitor { 
    Department cs = new Department();  
    Department it = new Department(); 

    public StudentVisitor(){  
        ArrayList<Courses> CSList = new initCSDepartment().initDepartment(); 
        ArrayList<Courses> ITList = new initITDepartment().initDepartment();
        for(Courses obj: CSList) cs.addCourse(obj); 
        for(Courses obj: ITList) it.addCourse(obj);
    }

    public void visit(StudentCS student){  
       cs.getAvailable(student); 
    }

    public void visit(StudentIT student){  
        it.getAvailable(student);
    }
    
}
