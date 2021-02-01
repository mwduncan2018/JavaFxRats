package tutorialspointdemo1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawingLine extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Line line = new Line();
		line.setStartX(100.0);
		line.setStartY(150.0);
		line.setEndX(500.0);
		line.setEndY(200.0);
		
		Text text = new Text();
		text.setFont(new Font(35));
		text.setX(50);
		text.setY(150);
		text.setText("Four score and seven years ago...");
		
		Group root = new Group(text);
		Scene scene = new Scene(root, 1000, 800);
		primaryStage.setTitle("Tutorials Point - Drawing Line");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void init() {
		System.out.println("Inside init()");
	}
}
