import java.util.ArrayList;
/**
 * The StudentCS Class stores Student data for an 
 * Computer Science Student.
 */
public class StudentCS implements Student,Visitable{
    private String name;  
    private String major;
    private String minor = "Computer Science"; 
    private ArrayList<Courses> completedCourses; 
    private ArrayList<Courses> registeredCourses;   
    private ArrayList<Courses> availableCourses;  
    private int limit;  
    private int registerCount = 0;

    public StudentCS(String name,String major,double gpa, ArrayList<Courses> courses){ 
        this.name = name; 
        this.major = major;
        this.registeredCourses = new ArrayList<Courses>();  
        this.availableCourses = new ArrayList<Courses>(); 
        this.completedCourses = courses; 

        if(gpa < 2.00){ 
            this.limit = 3; 
        }else{ 
            this.limit = 5;
        }
    }

    public void register(Courses course){  
        if(registerCount < limit){ 
            this.registeredCourses.add(course); 
            this.registerCount++;
        }//end
    }

    /**
     * The accept method passes the StudentCS objecet to the Visitor
     */
    public void accept(Visitor visitor){  
        visitor.visit(this);
    }

    public ArrayList<Courses> getRegisteredCourses() {
        return this.registeredCourses;
    }

    public void setCompletedCourses(Courses course){ 
        this.completedCourses.add(course);
    }

    public ArrayList<Courses> getCompletedCourses(){ 
        return this.completedCourses;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    public ArrayList<Courses> getAvailableCourses() {
        return availableCourses;
    }

    public void setAvailableCourses(Courses course) {
        this.availableCourses.add(course);
    }

}//end StudentCS
