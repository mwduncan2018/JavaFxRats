package scenebuilderdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HomeController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML // fx:id="tasksTable"
    private TableView<?> tasksTable; 
    @FXML // fx:id="comboPriority"
    private ComboBox<String> comboPriority; 
    @FXML // fx:id="textDescription"
    private TextField textDescription; 
    @FXML // fx:id="btnAdd"
    private Button btnAdd; 
    @FXML // fx:id="spinnerDescription"
    private Spinner<?> spinnerDescription; 
    @FXML // fx:id="radioCompleted"
    private CheckBox radioCompleted; 
    @FXML // fx:id="btnCancel"
    private Button btnCancel; 
    
    @Override
	public void initialize(URL url, ResourceBundle rb) {
		textDescription.setText("Testing");
		comboPriority.getItems().addAll("Red","Green","Blue");
	}
	

}
