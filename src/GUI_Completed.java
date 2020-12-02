import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class GUI_Completed {
    public void renderCompleted(BorderPane root,Student student){  
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12);  
        Text text2 = new Text();      
        int z= 0;
        for(Courses obj:  student.getCompletedCourses()){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourseCode());    
            grid.add(tmp,0,z);  
            z = z+2;
        }//end  

        // Set margin for left area.
        root.setLeft(grid);
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(grid, Pos.CENTER_LEFT); 
    }
}
