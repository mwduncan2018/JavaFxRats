package fxmldemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OriginSimpleUI extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		HBox hBox = new HBox();

		VBox vBox = new VBox(new Label("This goes down"), new Button("Down"), new Button("Further Down"));

		hBox.getChildren().addAll(new Label("User Name"), new TextField(), new Button("Connect"), vBox);
		
		Scene scene = new Scene(hBox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
