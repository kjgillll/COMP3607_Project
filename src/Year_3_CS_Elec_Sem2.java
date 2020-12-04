import java.util.ArrayList;
/** 
 * The Year_2_CS_Elec_Sem1 class creates Course objects that model
 * the different Courses offered during Semester 2 for the Computer 
 * Science programme. 
 * 
 * I couldnt find a possible way to refactor this class.
 */
public class Year_3_CS_Elec_Sem2 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){   
        Courses comp1602 = new Courses("COMP 1602",3,null,"Computer Programming II"); 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts");  
        Courses info1601 = new Courses("INFO 1601",3,null,"Introduction to WWW Programming");    
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 
        Courses comp2611 = new Courses("COMP 2611", 3, comp1603, "Data Structures");  
        Courses comp2603 = new Courses("COMP 2603", 3, comp1603, "Object-Oriented Programming I"); 
        Courses math2250 = new Courses("MATH 2250", 3, info1600, "Industrial Statistics");
        Courses comp3605 = new Courses("COMP 3605", 3, math2250, "Introduction to Data Analytics");   
        Courses info2600 = new Courses("INFO 2600", 3, info1600, "Information Systems Development"); 

        Courses comp2606 = new Courses("COMP 2606", 3, comp1603, "Software Engineering I");  
        Courses comp3601 = new Courses("COMP 3601", 3, comp2611, "Design and Analysis of Algorithms");
        Courses comp3608 = new Courses("COMP 3608", 3, comp2611, "Intelligent Systems"); 
        Courses comp3609 = new Courses("COMP 3609", 3, comp2603, "Game Programming"); 
        Courses comp3610 = new Courses("COMP 3610", 3, comp3605, "Big Data Anaylytics"); 
        Courses comp3611 = new Courses("COMP 3611", 3, math2250, "Modelling and Simulation"); 
        Courses info2602 = new Courses("INFO 2602", 3, info1601, "Web Programming and Technologies I") ;
        Courses info2604 = new Courses("INFO 2604", 3, comp1602, "Information Systems Security");
        Courses info3606 = new Courses("INFO 3606", 3, comp3605, "Cloud Computing"); 
        Courses info3607 = new Courses("INFO 3607", 3, comp3605, "Fundamentals of WAN Technologies"); 
        Courses info3608 = new Courses("INFO 3608", 3, info2600, "E-Commerce");  
        Courses info3604 = new Courses("INFO 3604", 3, comp2606, "Project"); 


        courses.add(comp3601);  
        courses.add(comp2606);  
        courses.add(info2602);  
        courses.add(info2604);  
        courses.add(info3606);  
        courses.add(info3607); 
        courses.add(comp3608);  
        courses.add(comp3609); 
        courses.add(comp3610);  
        courses.add(comp3611);  
        //courses.add(comp3612);   
        courses.add(info3604);   
        courses.add(info3608);   
  
        return courses;
    } 
}
