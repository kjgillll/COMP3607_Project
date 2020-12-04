import java.util.ArrayList;
/** 
 * The initDepartment Class returns a list of Information 
 * Technology Coures to be added a the Department Object.
 */
public class initITDepartment {
    public ArrayList<Courses> initDepartment(){
        ArrayList<Courses> ITList = new ArrayList<Courses>(); 
        ITList.addAll(new Year_2_IT_Core_Sem1().getList());  
        ITList.addAll(new Year_2_IT_Core_Sem2().getList()); 
        ITList.addAll(new Year3_IT_Elec_Sem1().getList());   
        ITList.addAll(new Year_3_IT_Elec_Sem2().getList()); 


        return ITList; 
    }
    /**
     * The getSem1 function returns a list of Semester 1 Courses 
     * for the Information Technology programme.
     */
    public ArrayList<Courses> getSem1(){
        ArrayList<Courses> ITList = new ArrayList<Courses>(); 
        ITList.addAll(new Year_2_IT_Core_Sem1().getList());  
        ITList.addAll(new Year3_IT_Elec_Sem1().getList());   

        return ITList; 
    }
    /**
     * The getSem2 function returns a list of Semester 1 Courses 
     * for the Information Technology programme.
     */
    public ArrayList<Courses> getSem2(){
        ArrayList<Courses> ITList = new ArrayList<Courses>();  
        ITList.addAll(new Year_2_IT_Core_Sem2().getList()); 
        ITList.addAll(new Year_3_IT_Elec_Sem2().getList()); 

        return ITList; 
    }
}
