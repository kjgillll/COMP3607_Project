import java.util.ArrayList;
/** 
 * The inCSDepartment Class returns a list of Computer 
 * Science Coures to be added a the Department Object.
 */
public class initCSDepartment {
    public ArrayList<Courses> initDepartment(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year_2_CS_Core_Sem1().getList()); 
        courseList.addAll(new Year_2_CS_Core_Sem2().getList()); 
        courseList.addAll(new Year_3_CS_Elec_Sem1().getList());  
        courseList.addAll(new Year_3_CS_Elec_Sem2().getList());  

        return courseList;
    }
    /**
     * The getSem1 function returns a list of Semester 1 Courses 
     * for the Computer Science programme.
     */
    public ArrayList<Courses> getSem1(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year_2_CS_Core_Sem1().getList()); 
        courseList.addAll(new Year_3_CS_Elec_Sem1().getList());   

        return courseList;
    }
    /**
     * The getSem2 function returns a list of Semester 1 Courses 
     * for the Computer Science programme.
     */
    public ArrayList<Courses> getSem2(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year_2_CS_Core_Sem2().getList());  
        courseList.addAll(new Year_3_CS_Elec_Sem2().getList());  

        return courseList; 
    }

}
