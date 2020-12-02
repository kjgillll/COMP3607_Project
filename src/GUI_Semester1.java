import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text; 

public class GUI_Semester1 { 
    public void render(BorderPane root,Student student,StudentVisitor csCourses){  
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12); 
        ArrayList<RegisterLink> semOneRegister = new ArrayList<RegisterLink>();
        StringBuilder availableField = new StringBuilder("Semester 1 Courses\n");  
            student.accept(csCourses); 
            for(Courses obj : student.getAvailableCourses()){   
                for(Courses obj2 : new initCSDepartment().getSem1()){
                    if(obj.getCourseCode().equals(obj2.getCourseCode())){  
                        semOneRegister.add(new RegisterLink(obj,student,root));
                        availableField.append(obj.getCourseCode() + "\n"); 
                    } 

                }
                //availableField.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
            }//end for  
        int x= 0;
        for(RegisterLink obj: semOneRegister){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourse().getCourseCode());    
            grid.add(tmp,0,x); 
            grid.add(obj.getLink(),1,x); 
            x++;
        }//end  


        Text text4 = new Text();  
        text4.setText(availableField.toString());
        root.setCenter(grid); 
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10));
        // Alignment.
        BorderPane.setAlignment(grid, Pos.CENTER); 
    }
}
