import java.util.ArrayList;
/**
 * The StudentIT Class stores Student data for an 
 * Computer Science Student.
 */
public class StudentIT implements Student,Visitable{
    private String name;  
    private String major;
    private String minor = "Information Technology"; 
    private ArrayList<Courses> registeredCourses;  
    private ArrayList<Courses> completedCourses;   
    private ArrayList<Courses> availableCourses; 
    private int limit;  
    private int registerCount = 0;

    public StudentIT(String name,String major,double gpa, ArrayList<Courses> courses){ 
        this.name = name; 
        this.major = major; 
        
        this.registeredCourses = new ArrayList<Courses>();  
        this.availableCourses = new ArrayList<Courses>(); 
        this.completedCourses = courses; 

        if(gpa < 2.00){ 
            this.limit = 3; 
        }else{ 
            this.limit = 5;
        }//end 
    }//end StudentCS() 
    public void register(Courses course){ 
        if(registerCount < limit){ 
            this.registeredCourses.add(course); 
            this.registerCount++;
        }//end
    }//end register() 
    /**
     * The accept method passes the StudentCS objecet to the Visitor
     */
    public void accept(Visitor visitor){  
        visitor.visit(this);
    }//end

    public ArrayList<Courses> getRegisteredCourses() {
        return this.registeredCourses;
    }//end  

    public void setCompletedCourses(Courses course){ 
        this.completedCourses.add(course);
    }//end

    public ArrayList<Courses> getCompletedCourses(){ 
        return this.completedCourses;
    }//end get()

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public ArrayList<Courses> getAvailableCourses() {
        return availableCourses;
    }

    public void setAvailableCourses(Courses course) {
        this.availableCourses.add(course);
    }
}//end StudentIT()
