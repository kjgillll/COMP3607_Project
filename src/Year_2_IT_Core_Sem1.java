import java.util.ArrayList;

public class Year_2_IT_Core_Sem1 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses comp1601 = new Courses("COMP 1601",3,null,"Computer Programming I"); 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 

        Courses comp2605 = new Courses("COMP 2605", 3, comp1601, "Enterprise Database Systems"); 
        Courses info2601 = new Courses("INFO 2601", 3, info1600, "Networking Technologies Fundamentals");
        Courses info2603 = new Courses("INFO 2603", 3, info1600, "Platform Technologies");    

        courses.add(comp2605);  
        courses.add(info2601); 
        courses.add(info2603);  
        courses.add(comp1601);  
        courses.add(info1600);  

        return courses;
    }//end
}
