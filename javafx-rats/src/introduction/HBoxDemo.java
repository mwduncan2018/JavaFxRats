package introduction;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class HBoxDemo extends Application {
	protected Integer width;
	protected Integer height;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void init() {
	}

	@Override
	public void start(Stage stage) {
		HBox hbox = new HBox();
		hbox.setSpacing(10);

		Button btn1 = new Button("First Button");
		btn1.setPrefSize(80, 20);
		Button btn2 = new Button("Second Button");
		btn2.setPrefSize(80, 20);
		Button btn3 = new Button("Third Button");
		btn3.setPrefSize(80, 20);
		Button btn4 = new Button("Fourth Button");
		btn4.setPrefSize(80, 20);

		hbox.getChildren().addAll(btn1, btn2, btn3, btn4);

		Scene scene = new Scene(hbox, 600, 800);
		stage.setScene(scene);
		stage.setTitle("Witch Image!");
		stage.show();
	}

}
