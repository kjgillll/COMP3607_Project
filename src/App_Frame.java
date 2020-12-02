import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App_Frame extends Application { 

    @Override
    public void start(Stage primaryStage) {  
        Button btn = new Button();
        btn.setText("Import Transcript"); 
        Text title = new Text();
        title.setText("Returning Students Course Recommendations\n\t\t (Minor IT and Minor CS)\n");
        VBox root = new VBox(); 
        root.getChildren().add(title); 
        root.getChildren().add(btn); 
        root.setAlignment(Pos.CENTER);

    
        Scene scene = new Scene(root, 450, 250);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               FilePicker fPicker = new FilePicker(primaryStage); 
               Student student = fPicker.readFile(); 
               //for(Courses obj: student.getCompletedCourses()) System.out.println(obj.getCourseCode());
                
               new CourseRecommedations().display(student);
            }//end 
        });


        primaryStage.setTitle("Group 3a Project Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}
