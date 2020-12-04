import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
/** 
 * The CourseRecommendations class uses the data read from the Student's transcript
 * to recommendation possible semester 1 and semester 2 courses that the student
 * is eligible to register for.
 */
public class CourseRecommedations {  
    /**
     * The Display Function renders the recommendated courses to 
     * the screen for the user to see.
     */
    public void display(Student student) { 
        Stage window = new Stage(); 
        window.initModality(Modality.APPLICATION_MODAL); 
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15, 20, 10, 10));
        
        StudentVisitor csCourses = new StudentVisitor();  
        student.accept(csCourses);   
        GUI_TOP(student,root);
        GUI_LEFT(student, root);
        GUI_CENTER(student, root);
        GUI_RIGHT(student, root);
    
        Scene scene = new Scene(root, 1100, 600);
        window.setScene(scene);  
        window.showAndWait();
    }
    /**
     * The GUI_TOP function rennders the top portion of the GUI screen which displays
     * Student Information.
     * @param student
     * @param root
     */
    public void GUI_TOP(Student student, BorderPane root){ 
        Text text = new Text(); 
        text.setText(student.getName()+"\n"+student.getMajor()+" Minor in "+student.getMinor()+"\n");
        root.setTop(text);  
        BorderPane.setMargin(text, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(text, Pos.TOP_CENTER);
    }  
    /**
     * The GUI_LEFT function renders the left portion of the GUI that displays the 
     * Student's Completed Courses.
     * @param student
     * @param root
     */
    public void GUI_LEFT(Student student, BorderPane root){ 
        GUI_Completed render1 = new GUI_Completed();
        render1.renderCompleted(root,student);
    }
    /**
     * The GUI_RIGHT function renders the right portion of the GUI that displays the Student's 
     * recommended Semester 2 Courses
     * @param student
     * @param root
     * @param csCourses
     */
    public void GUI_RIGHT(Student student, BorderPane root){
        GUI_Semester2 render3 = new GUI_Semester2(); 
        render3.render(root,student);
    }
    /**
     * The GUI_CENTER function renders the center portion of the GUI that displays the Student's 
     * recommeneded Semester 1 Courses.
     * @param student
     * @param root
     * @param csCourses
     */
    public void GUI_CENTER(Student student, BorderPane root){  
        GUI_Semester1 render2 = new GUI_Semester1(); 
        render2.render(root,student);
    }

}
