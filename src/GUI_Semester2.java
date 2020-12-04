import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;  
/** 
 * The GUI_Semester1 renders a list of possible Semester 1 courses that the 
 * Student can register for.
 */
public class GUI_Semester2 { 
    private ArrayList<Courses> list = new ArrayList<Courses>();
    private ArrayList<RegisterLink> semtwoRegister = new ArrayList<RegisterLink>();
    private StringBuilder availableField2 = new StringBuilder("Semester 2 Courses\n");  

    public void render(BorderPane root,Student student) {  
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12); 

        getCourses(student, root); 
        renderLink(grid);
        
        root.setRight(grid); 
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10)); 
        BorderPane.setAlignment(grid, Pos.CENTER_RIGHT);
    }
    /**
     * The getCourses function searches that list of recommended Courses for 
     * the Students and returns only the Semester 1 Courses.
     * @param student
     * @param root
     */
    public void getCourses(Student student,BorderPane root){ 
        for(Courses obj3 : student.getAvailableCourses()){    
            if(student instanceof StudentCS){ 
                list = new initCSDepartment().getSem2();
            }else if(student instanceof StudentIT){ 
                list = new initITDepartment().getSem2();
            }//end
            for(Courses obj4 : list){
                if(obj4.getCourseCode().equals(obj3.getCourseCode())){
                    semtwoRegister.add(new RegisterLink(obj4,student,root));
                    availableField2.append(obj3.getCourseCode() +"\n"); 
                    }
                }
        } 
    }  
    /**
     * The renderLink function displays the link of Semester 2 Courses to the Student with a button 
     * that when clicked adds the chosen Course to the list of Courses the Student wishes to register for.
     * @param grid
     */
    public void renderLink(GridPane grid){  
        int y= 1;  
        Text tmp2 = new Text(); 
        tmp2.setText("Semester 2:"); 
        grid.add(tmp2, 0, 0);
        for(RegisterLink obj: semtwoRegister){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourse().getCourseCode());    
            grid.add(tmp,0,y); 
            grid.add(obj.getLink(),1,y); 
            y++;
        }  
    }
} 