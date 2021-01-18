package introduction;


import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class BorderPaneDemo extends Application {
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
		Button btn1 = new Button("First Button");
		btn1.setPrefSize(80, 20);
		Button btn2 = new Button("Second Button");
		btn2.setPrefSize(80, 20);
		Button btn3 = new Button("Third Button");
		btn3.setPrefSize(80, 20);
		Button btn4 = new Button("Fourth Button");
		btn4.setPrefSize(80, 20);

		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.getChildren().addAll(btn1, btn2, btn3, btn4);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(new TextField("Header"));
		borderPane.setBottom(new TextField("Footer"));
		borderPane.setLeft(new TextField("Testing Left"));
		borderPane.setRight(new TextField("Testing Right"));
		borderPane.setCenter(hbox);

		Scene scene = new Scene(borderPane, 1200, 800);
		stage.setScene(scene);
		stage.setTitle("Can I touch your soul forever?");
		stage.show();
	}

}
