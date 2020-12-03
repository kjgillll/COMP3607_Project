import java.util.ArrayList;

public class Year_3_IT_Elec_Sem2 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 
        Courses math2250 = new Courses("MATH 2250", 3, info1600, "Industrial Statistics"); 
        Courses comp3605 = new Courses("COMP 3605", 3, math2250, "Intro to Data Analytics");   
        Courses comp1602 = new Courses("COMP 1602",3,null,"Computer Programming II");  
        Courses info2600 = new Courses("INFO 2600", 3, info1600, "Information Systems Development"); 
        Courses info1601 = new Courses("INFO 1601",3,null,"Introduction to WWW Programming");    

        Courses info3606 = new Courses("INFO 3606", 3, comp3605, "Cloud Computing"); 
        Courses info3607 = new Courses("INFO 3607", 3, comp3605, "Fundamentals of WAN Technologies"); 
        Courses info3608 = new Courses("INFO 3608", 3, info2600, "E-Commerce");  
        Courses info2604 = new Courses("INFO 2604", 3, comp1602, "Information Systems Security"); 
        Courses info2602 = new Courses("INFO 2602", 3, info1601, "Web Programming and Technologies I") ;
        Courses comp3610 = new Courses("COMP 3610", 3, comp3605, "Big Data Anaylytics");

        courses.add(info3606); 
        courses.add(info3607); 
        courses.add(comp3610); 
        courses.add(info2604);  
        courses.add(info3608); 
        courses.add(info2602);  
        courses.add(info1601); 


        return courses; 
    }//end
}//end
