import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 
/** 
 * The FilePicker class is reponsible for reading Student Data from a Transcript File.
 */
public class FilePicker {  
    private Stage stage; 

    public FilePicker(Stage stage){ 
        this.stage = stage;
    }//end 
    /**
     * The readFile function opens a File Chooser window where the student 
     * can navigate to the Transcript File saved on their system.
     * @return
     */
    public Student readFile(){  
        ArrayList<String> studentFile = new ArrayList<>();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Student Transcript");
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) { 
            studentFile = loadStudent(file); 
            return new initStudent().initStudentObject(studentFile);
        }//end if 
        return null;
    }
    /**
     * The loadStudent function reads the file choosen by the student line by line and 
     * extracts the relevant data. This data is then stored in an Student Object.
     * @param file
     * @return
     */
    public ArrayList<String> loadStudent(File file){   
        ArrayList<String> fileInfo = new ArrayList<String>(); 
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) fileInfo.add(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileInfo;
    }

}

    
