package introduction;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Home extends Application {
	protected Integer width;
	protected Integer height;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void init() {
		System.out.println("Width = " + getParameters().getRaw().get(0));
		System.out.println("Height = " + getParameters().getRaw().get(1));
		width = Integer.parseInt(getParameters().getNamed().get("width"));
		height = Integer.parseInt(getParameters().getNamed().get("height"));
	}

	@Override
	public void start(Stage stage) {
		Group g = new Group();
		Button btn1 = new Button("First Button");
		btn1.setLayoutX(20);
		btn1.setLayoutY(20);
		Button btn2 = new Button("Second Button");
		btn2.setLayoutX(150);
		btn2.setLayoutY(20);
		Button btn3 = new Button("Third Button");
		btn3.setLayoutX(20);
		btn3.setLayoutY(100);
		Button btn4 = new Button("Fourth Button");
		btn4.setLayoutX(150);
		btn4.setLayoutY(100);
		
		g.getChildren().addAll(btn1, btn2, btn3, btn4);

		Scene scene = new Scene(g, width, height);
		stage.setScene(scene);
		stage.setTitle("Do It!");
		stage.setResizable(false);
		stage.show();
	}

}
