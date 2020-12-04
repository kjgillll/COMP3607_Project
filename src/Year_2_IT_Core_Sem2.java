import java.util.ArrayList;
/** 
 * The Year_2_IT_Core_Sem1 class creates Course objects that model
 * the different Courses offered during Semester 1 for the Information 
 * Technology programme. 
 * 
 * I couldnt find a possible way to refactor this class.
 */
public class Year_2_IT_Core_Sem2 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 

        Courses info2600 = new Courses("INFO 2600", 3, info1600, "Information Systems Development");

        courses.add(info2600); 

        return courses;
    }
}
