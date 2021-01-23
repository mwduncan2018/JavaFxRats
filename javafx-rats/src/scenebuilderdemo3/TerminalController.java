package scenebuilderdemo3;

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

public class TerminalController implements Initializable {
	
    @FXML
    private Button buttonSubmit;
    @FXML
    private TextField textName;
    @FXML
    private TextField textProfession;
    @FXML
    private CheckBox checkBaseball;
    @FXML
    private CheckBox checkTennis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	textName.setText("Hello World");
    }
    
}
