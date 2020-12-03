import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;  

public class GUI_Semester2 {
    public void render(BorderPane root,Student student,StudentVisitor csCourses) {  
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12); 
        ArrayList<Courses> list = new ArrayList<Courses>();
        ArrayList<RegisterLink> semtwoRegister = new ArrayList<RegisterLink>();
        StringBuilder availableField2 = new StringBuilder("Semester 2 Courses\n"); 
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
                //availableField.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
            } 
            int y= 0;
            for(RegisterLink obj: semtwoRegister){  
                Text tmp = new Text(); 
                tmp.setText(obj.getCourse().getCourseCode());    
                grid.add(tmp,0,y); 
                grid.add(obj.getLink(),1,y); 
                y++;
            }//end  
        
        Text text3 = new Text();  
        text3.setText(availableField2.toString());
        root.setRight(grid); 
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10)); 
        // Alignment.
        BorderPane.setAlignment(grid, Pos.CENTER_RIGHT);
    

    }//end()
}//end
