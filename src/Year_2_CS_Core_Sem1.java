import java.util.ArrayList;
/** 
 * The Year_2_CS_Core_Sem1 class creates Course objects that model
 * the different Courses offered during Semester 1 for the Computer 
 * Science programme. 
 * 
 * I couldnt find a possible way to refactor this class.
 */
public class Year_2_CS_Core_Sem1 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses comp1601 = new Courses("COMP 1601",3,null,"Computer Programming I"); 
        Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 
        Courses comp1602 = new Courses("COMP 1602",3,null,"Computer Programming II"); 
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 

        Courses comp2601 = new Courses("COMP 2601", 3, comp1600, "Computer Architechture"); 
        Courses comp2611 = new Courses("COMP 2611", 3, comp1603, "Data Structures");     

        courses.add(comp1600);  
        courses.add(comp1601); 
        courses.add(comp1602);  
        courses.add(comp1603); 
        courses.add(comp2601); 
        courses.add(comp2611);       

        return courses;
    }
}
