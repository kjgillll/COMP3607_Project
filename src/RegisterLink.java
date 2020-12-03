import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class RegisterLink { 
    //public static StringBuilder  registered = new StringBuilder("Registered Courses"); 
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
        this.link.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                student.register(course);  
                link.setDisable(true);;
                updateBtm(); 
            }
        });
    }//end 

    public void updateBtm(){  
        StringBuilder x = new StringBuilder("Registered Courses:\n\n");
        for(Courses obj: student.getRegisteredCourses())
            x.append(obj.getCourseCode()+"\n");
        Text text = new Text(); 
        text.setText(x.toString());
        root.setBottom(text); 
        BorderPane.setAlignment(text, Pos.BOTTOM_CENTER);
    
        // Set margin for bottom area.
        BorderPane.setMargin(text, new Insets(10, 10, 10, 10));
        
    }//end  

    public Hyperlink getLink() {
        return link;
    }

    public void setLink(Hyperlink link) {
        this.link = link;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
    
}//end
