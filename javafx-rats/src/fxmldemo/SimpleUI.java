package fxmldemo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class SimpleUI extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SimpleUI.fxml"));
		HBox hBox = loader.load();
		
		SimpleUIController simpleUIController = loader.getController();
		System.out.println("Hey I am in the start() method --> " + simpleUIController.textField.getText());
		
		Scene scene = new Scene(hBox);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
