import java.util.ArrayList;

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
        }//end 

    }//end StudentCS() 

    public void register(Courses course){  
        if(registerCount < limit){ 
            this.registeredCourses.add(course); 
            this.registerCount++;
        }//end
    }//end register()


    public void accept(Visitor visitor){  
        visitor.visit(this);
        
    }//end accept()

    public ArrayList<Courses> getRegisteredCourses() {
        return this.registeredCourses;
    }//end get() 

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

}//end StudentCS
