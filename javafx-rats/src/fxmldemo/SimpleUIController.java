package fxmldemo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SimpleUIController {

	@FXML
	public TextField textField;

	public void initialize() {
		System.out.println("Calling the initialize() method!");
		textField.setText("This is set in initialize()");
	}
}
