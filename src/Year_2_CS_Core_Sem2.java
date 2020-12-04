import java.util.ArrayList;
/** 
 * The Year_2_CS_Core_Sem2 class creates Course objects that model
 * the different Courses offered during Semester 2 for the Computer 
 * Science programme. 
 * 
 * I couldnt find a possible way to refactor this class.
 */
public class Year_2_CS_Core_Sem2 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 

        Courses comp2603 = new Courses("COMP 2603", 3, comp1603, "Object-Oriented Programming I");
        Courses comp2604 = new Courses("COMP 2604", 3, comp1600, "Operating Systems");  

        courses.add(comp2603);  
        courses.add(comp2604); 
           
        return courses; 
    }
}
