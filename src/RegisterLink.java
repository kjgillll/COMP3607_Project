import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
/** 
 * The RegisterLink class creates a Link Object that when clicked
 * adds the Course that corresponds to the link to the link to a 
 * list Courses the student wishes to register for.
 */
public class RegisterLink { 
    private Hyperlink link;
    private Courses course; 
    private BorderPane root; 
    private Student student; 

    public RegisterLink(Courses course,Student student,BorderPane root) {
        this.link = new Hyperlink(course.getCourseCode());
        link.setText("Register");
        this.course = course; 
        this.student = student;
        this.root = root;
        
        linkAction();
    } 
    /** 
     * The updateBtm function updates the list of the selected Courses with the 
     * last Course selected by the Student.
     */
    public void updateBtm(){  
        StringBuilder x = new StringBuilder("Registered Courses:\n\n");
        for(Courses obj: student.getRegisteredCourses())
            x.append(obj.getCourseCode()+"\n");
        Text text = new Text(); 
        text.setText(x.toString());
        root.setBottom(text); 
        BorderPane.setAlignment(text, Pos.BOTTOM_CENTER);
        BorderPane.setMargin(text, new Insets(10, 10, 10, 10));
        
    }//end  
    /**
     * The linkAction function adds the functionality a to link when clicked.
     */
    public void linkAction(){ 
        link.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                student.register(course);  
                link.setDisable(true);;
                updateBtm(); 
            }
        });
    } 

    public Hyperlink getLink() {
        return link;
    }

    public Courses getCourse() {
        return course;
    }

}//end
