import java.util.ArrayList;
/** 
 * The Year_3_IT_Elec_Sem1 class creates Course objects that model
 * the different Courses offered during Semester 1 for the Information 
 * Technology programme. 
 * 
 * I couldnt find a possible way to refactor this class.
 */
public class Year3_IT_Elec_Sem1 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 

        Courses math2250 = new Courses("MATH 2250", 3, info1600, "Industrial Statistics"); 
        Courses comp3605 = new Courses("COMP 3605", 3, math2250, "Intro to Data Analytics");  
        Courses info2605 = new Courses("INFO 2605", 3, info1600, "Professional Ethics and Law"); 
        Courses info3605 = new Courses("INFO 3605", 3, math2250, "Fundamentals of LAN Technologies"); 

        courses.add(info2605); 
        courses.add(info3605); 
        courses.add(comp3605); 
        courses.add(math2250); 


        return courses; 
    }
}
