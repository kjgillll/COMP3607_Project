import java.util.ArrayList;

public class StudentVisitor implements Visitor { 
    Department cs = new Department();  
    Department it = new Department(); 

    public StudentVisitor(){  
        ArrayList<Courses> CSList = new initCSDepartment().initDepartment(); 
        ArrayList<Courses> ITList = new initITDepartment().initDepartment();
        for(Courses obj: CSList) cs.addCourse(obj); 
        for(Courses obj: ITList) it.addCourse(obj);
    }//end  

    public void visit(StudentCS student){  
       //System.out.println(student.getCompletedCourses()); 
       cs.getAvailable(student); 
    }//end visit()

    public void visit(StudentIT student){  
        //System.out.println(student.getCompletedCourses()); 
        it.getAvailable(student);

    }//end visit() 
    
}//end StudentVisitor()
