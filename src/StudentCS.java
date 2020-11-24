import java.util.ArrayList;

public class StudentCS implements Student,Visitable{
    private String name;  
    private String major;
    private String minor = "Computer Science"; 
    private ArrayList<Courses> completedCourses; 
    private ArrayList<Courses> registeredCourses;  
    private double gpa; 

    public StudentCS(String name,String major,double gpa){ 
        this.name = name; 
        this.major = major; 
        this.gpa = gpa; 
        
        this.registeredCourses = new ArrayList<Courses>(); 

    }//end StudentCS() 

    public void register(Courses course){ 

    }//end register()


    public void accept(Visitor visitor){  
        visitor.visit(this);
        
    }//end accept()

    public ArrayList<Courses> getRegisteredCourses() {
        return this.registeredCourses;
    }//end get()

    public ArrayList<Courses> getCompletedCourses(){ 
        return this.completedCourses;
    }//end get()

}//end StudentCS
