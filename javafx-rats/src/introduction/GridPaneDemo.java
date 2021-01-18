package introduction;


import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class GridPaneDemo extends Application {
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
		GridPane grid = new GridPane();
		grid.setGridLinesVisible(true);
		grid.setHgap(20);
		grid.setVgap(30);
		
		Button btn1 = new Button("First Button");
		btn1.setPrefSize(140, 20);
		Button btn2 = new Button("Second Button");
		btn2.setPrefSize(140, 20);
		Button btn3 = new Button("Third Button");
		btn3.setPrefSize(140, 20);
		Button btn4 = new Button("Fourth Button");
		btn4.setPrefSize(140, 20);
		Button btn5 = new Button("5 Button");
		btn5.setPrefSize(140, 20);
		Button btn6 = new Button("6 Button");
		btn6.setPrefSize(140, 20);
		Button btn7 = new Button("7");
		btn7.setPrefSize(140, 20);
		Button btn8 = new Button("8");
		btn8.setPrefSize(140, 20);
		grid.setConstraints(btn1, 1, 1);
		grid.setConstraints(btn2, 2, 1);
		grid.setConstraints(btn3, 3, 1);
		grid.setConstraints(btn4, 4, 1);
		grid.setConstraints(btn5, 1, 2);
		grid.setConstraints(btn6, 2, 2);
		grid.setConstraints(btn7, 4, 3);
		grid.setConstraints(btn8, 5, 3);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(new TextField("Top"));
		borderPane.setBottom(new TextField("Bottom"));
		grid.setConstraints(borderPane, 1, 4, 4, 2);
		
		grid.getChildren().addAll(btn1, btn2, btn3, btn4, borderPane);
		
		Scene scene = new Scene(grid, 1400, 700);
		stage.setScene(scene);
		stage.setTitle("Grilled Cheese");
		stage.show();
	}

}
