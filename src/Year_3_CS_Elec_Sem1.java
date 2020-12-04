import java.util.ArrayList;
/** 
 * The Year_3_CS_Elec_Sem1 class creates Course objects that model
 * the different Courses offered during Semester 1 for the Computer 
 * Science programme. 
 * 
 * I couldnt find a possible way to refactor this class.
 */
public class Year_3_CS_Elec_Sem1 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){   
        Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 
        Courses comp2603 = new Courses("COMP 2603", 3, comp1603, "Object-Oriented Programming I");
        Courses comp2611 = new Courses("COMP 2611", 3, comp1603, "Data Structures"); 
        Courses comp2606 = new Courses("COMP 2606", 3, comp1603, "Software Engineering I");    
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts");  
        Courses comp1601 = new Courses("COMP 1601",3,null,"Computer Programming I"); 

        Courses math2250 = new Courses("MATH 2250", 3, info1600, "Industrial Statistics");
        Courses comp2602 = new Courses("COMP 2602", 3, comp1600, "Computer Networks");  
        Courses comp3602 = new Courses("COMP 3602", 3, comp2611, "Theory of Computing"); 
        Courses comp3606 = new Courses("COMP 3606", 3, comp2602, "Wireless and Mobile Computing"); 
        Courses comp3607 = new Courses("COMP 3607", 3, comp2603, "Object Oriented Programming II"); 
        Courses comp3612 = new Courses("COMP 3612", 3, comp2611, "Special Topics in Computer Science"); 
        Courses comp3613 = new Courses("COMP 3613", 3, comp2606, "Software Engineering II");  
        Courses comp3603 = new Courses("COMP 3603", 3, comp2606, "Human Computer Interaction");  
        Courses comp2605 = new Courses("COMP 2605", 3, comp1601, "Enterprise Database Systems"); 
        Courses comp3605 = new Courses("COMP 3605", 3, math2250, "Introduction to Data Analytics");   
        Courses info2605 = new Courses("INFO 2605", 3, info1600, "Professional Ethics and Law"); 
        Courses info3605 = new Courses("INFO 3605", 3, math2250, "Fundamentals of LAN Technologies");  
        Courses info3600 = new Courses("INFO 3600", 3, comp2605, "Business Information Systems"); 

        courses.add(math2250);  
        courses.add(comp3602);  
        courses.add(comp3603);  
        courses.add(comp3605);  
        courses.add(comp3606);  
        courses.add(comp3607); 
        courses.add(info3605); 
        courses.add(info2605);  
        courses.add(info3600);  
        courses.add(comp3612);   
        courses.add(comp3613);    
        courses.add(comp2605);   
        courses.add(comp2602);   
  
        return courses;
    } 
}
