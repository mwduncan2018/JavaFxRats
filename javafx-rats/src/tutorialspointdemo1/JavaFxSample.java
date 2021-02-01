package tutorialspointdemo1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxSample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stackPane = new StackPane();
		Group root = new Group(stackPane);
		Scene scene = new Scene(root);
		primaryStage.setTitle("Tutorials Point Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() {
		System.out.println("Stopping app");
	}
	
	@Override
	public void init() {
		System.out.println("Init");
	}
}
