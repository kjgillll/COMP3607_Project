import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CourseRecommedations { 
    
    public void display(Student student) { 
        Stage window = new Stage(); 
        window.initModality(Modality.APPLICATION_MODAL); 
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15, 20, 10, 10));
        
        StudentVisitor csCourses = new StudentVisitor();    
        // TOP 
        GUI_TOP(student,root);
        // LEFT  
        GUI_LEFT(student, root);
        // CENTER   
        GUI_CENTER(student, root, csCourses);
        //RIGHT
        GUI_RIGHT(student, root, csCourses);
        // Set margin for bottom area.
    
        Scene scene = new Scene(root, 1100, 600);
    
        //primaryStage.setTitle("BorderPane Layout Demo");
        window.setScene(scene);  
        window.showAndWait();

    }//end 

    public void GUI_TOP(Student student, BorderPane root){ 
        Text text = new Text(); 
        text.setText(student.getName()+"\n"+student.getMajor()+" Minor in "+student.getMinor()+"\n");
        root.setTop(text);  
        // Set margin for top area.
        BorderPane.setMargin(text, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(text, Pos.TOP_CENTER);
    }//end 

    public void GUI_LEFT(Student student, BorderPane root){ 
        GUI_Completed render1 = new GUI_Completed();
        render1.renderCompleted(root,student);
    }//end 

    public void GUI_RIGHT(Student student, BorderPane root,StudentVisitor csCourses){
        GUI_Semester2 render3 = new GUI_Semester2(); 
        render3.render(root,student, csCourses);
    }//end

    public void GUI_CENTER(Student student, BorderPane root,StudentVisitor csCourses){  
        GUI_Semester1 render2 = new GUI_Semester1(); 
        render2.render(root,student,csCourses);
    }//end

 
}//end
