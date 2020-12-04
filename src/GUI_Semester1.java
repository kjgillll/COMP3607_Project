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
public class GUI_Semester1 {  
    ArrayList<Courses> list = new ArrayList<Courses>();
    ArrayList<RegisterLink> semOneRegister = new ArrayList<RegisterLink>();
    StringBuilder availableField = new StringBuilder("Semester 1 Courses\n");  

    public void render(BorderPane root,Student student){  
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12);  
        
        getCourses(student, root); 
        renderLink(grid);

        root.setCenter(grid); 
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10));
        BorderPane.setAlignment(grid, Pos.CENTER); 
    } 
    /**
     * The getCourses function searches that list of recommended Courses for 
     * the Students and returns only the Semester 1 Courses.
     * @param student
     * @param root
     */
    public void getCourses(Student student,BorderPane root){ 
        for(Courses obj : student.getAvailableCourses()){    
            if(student instanceof StudentCS){ 
                list = new initCSDepartment().getSem1();
            }else if(student instanceof StudentIT){ 
                list = new initITDepartment().getSem1();
            }//end
            for(Courses obj2 : list){ 
                if(obj.getCourseCode().equals(obj2.getCourseCode())){ 
                    semOneRegister.add(new RegisterLink(obj,student,root));
                    availableField.append(obj.getCourseCode() + "\n"); 
                } 
             } 
        }
    }  
    /**
     * The renderLink function displays the link of Semester 1 Courses to the Student with a button 
     * that when clicked adds the chosen Course to the list of Courses the Student wishes to register for.
     * @param grid
     */
    public void renderLink(GridPane grid){ 
        int x= 0;
        for(RegisterLink obj: semOneRegister){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourse().getCourseCode());    
            grid.add(tmp,0,x); 
            grid.add(obj.getLink(),1,x); 
            x++;
        }
    }
}
