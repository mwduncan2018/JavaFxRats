package scenebuilderdemo4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CyberTruckController implements Initializable {
	@FXML
	private Button btnAddOrder;
	@FXML
	private ComboBox<String> comboProduct;
	@FXML
	private Spinner<Integer> spinnerPercentComplete;
	@FXML
	private ProgressBar progressBarPercentComplete;
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
    @FXML
    private TableView<Order> tableOrders;
    @FXML
    private TableColumn<?, ?> tableColumnName;
    @FXML
    private TableColumn<?, ?> tableColumnDescription;
    @FXML
    private TableColumn<?, ?> tableColumnProduct;
    @FXML
    private TableColumn<?, ?> tableColumnMealDeal;
    @FXML
    private TableColumn<?, ?> tableColumnComplete;
    
	@Override
	public void initialize(URL location, ResourceBundle rb) {
		textCustomerName.setText("Stephanie Harford");
		
		tableOrders.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Order> observable, Order oldValue, Order newValue) -> {
			tableOrders.setItems(createTableData());
		});
		
		spinnerPercentComplete.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
		spinnerPercentComplete.valueProperty().addListener(new ChangeListener<Integer>() {
			@Override
			public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
				if (newValue.intValue() == 100) {
					chkOrderComplete.setSelected(true);
				} else if (newValue.intValue() <= 99) {
					chkOrderComplete.setSelected(false);
				}
				progressBarPercentComplete.setProgress(1.0 * newValue / 100d);
			}
		});
	}
	
	private ObservableList<Order> createTableData() {
		ObservableList<Order> orderList = FXCollections.observableArrayList(
				new Order("Stephanie", "SUV", "Chicken Sandwich", "Sandwich Only", 100),
				new Order("Mike", "Camry", "Triple Burger", "Sandwich Only", 0),
				new Order("Erik", "Model 3", "Double Burger", "Add Large Soda & Fries", 50)
				);
		return orderList;
	}
			

}
