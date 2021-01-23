package scenebuilderdemo4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class CyberTruckController implements Initializable {
    @FXML
    private Button btnAddOrder;
    @FXML
    private ComboBox<String> comboProduct;
    @FXML
    private Spinner<Integer> spinnerPercentComplete;
    @FXML
    private CheckBox chkOrderComplete;
    @FXML
    private Button btnDeleteOrder;
    @FXML
    private TextField textCustomerName;
    @FXML
    private TextField textCustomerDescription;
    @FXML
    private Button btnUpdateOrder;
    @FXML
    private RadioButton radioMealDealLarge;
    @FXML
    private RadioButton radioSandwichOnly;
    @FXML
    private RadioButton radioMealDealMedium;

    @Override
	public void initialize(URL location, ResourceBundle rb) {
		textCustomerName.setText("Stephanie Harford");
		
		spinnerPercentComplete.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
		spinnerPercentComplete.valueProperty().addListener(new ChangeListener<Integer>() {
			@Override
			public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
				if (newValue.intValue() == 100) {
					chkOrderComplete.setSelected(true);
				} else {
					chkOrderComplete.setSelected(false);
				}
			}
		});
	}

}
