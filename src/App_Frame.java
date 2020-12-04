import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

    /** 
     * The App Frame class displays the initial screen that the student sees
     * when the first run. Here the user can upload their transcript to later 
     * receive course recommendations. 
     */
public class App_Frame extends Application { 
    /** 
     * The start functions renders the contents of the first 
     * screen to the user.
     */
    @Override
    public void start(Stage primaryStage) {   
        Button btn = new Button();
        btn.setText("Upload Transcript"); 
        Text title = new Text();
        title.setText("Returning Students Course Recommendations\n\t\t (Minor IT and Minor CS)\n");
        VBox root = new VBox();   
        root.getChildren().add(title); 
        root.getChildren().add(btn);  
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 450, 250);
        btnAction(btn,primaryStage);
        primaryStage.setTitle("Group 3a Project Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    } 
    /**
     * The btnAction function adds the functionality for the button displayed on the screen
     * This button opens a File Picker where the user can navigate to their transcipt file 
     * stored on their pc and the selected file is upladed to the program.
     * @param btn
     * @param primaryStage
     */
    public void btnAction(Button btn,Stage primaryStage){ 
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               FilePicker fPicker = new FilePicker(primaryStage); 
               Student student = fPicker.readFile();    
               new CourseRecommedations().display(student);
            }//end 
        });
    } 
    /**
     * The main function launches the app.
     * @param args
     */
 public static void main(String[] args) {
        launch(args);
    }
}
