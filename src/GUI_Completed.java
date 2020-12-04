import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
/** 
 * The GUI_Completed class retrieves the Courses that the Student selects
 * on the GUi on displays a list of the courses that the Student wants to register for.
 */
public class GUI_Completed {
    public void renderCompleted(BorderPane root,Student student){  
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12);      
        int z= 0;
        for(Courses obj:  student.getCompletedCourses()){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourseCode());    
            grid.add(tmp,0,z);  
            z = z+2;
        } 
        root.setLeft(grid);
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(grid, Pos.TOP_LEFT);
    }
}
