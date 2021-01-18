package introduction;


import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class LabelDemo extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void init() {
	}

	@Override
	public void start(Stage stage) {
		Label labelName = new Label("Enter Your Name");
		Label labelAge = new Label("Enter Your Age");
		Label labelSalary = new Label("Enter Your Salary");
		Label labelImage = new Label();
		labelImage.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("github_avatar.jpg"))));

		TextField textName = new TextField();
		textName.setPromptText("Enter name...");
		TextField textAge = new TextField();
		textAge.setPromptText("Enter age...");
		TextField textSalary = new TextField();
		textSalary.setPromptText("Enter salary...");

		Button btnSubmit = new Button("Submit Button");
		btnSubmit.setPrefSize(160, 20);

		GridPane grid = new GridPane();
		grid.setGridLinesVisible(false);
		grid.setHgap(30);
		grid.setVgap(5);
		grid.setConstraints(labelName, 1, 1);
		grid.setConstraints(labelAge, 2, 1);
		grid.setConstraints(labelSalary, 3, 1);
		grid.setConstraints(textName, 1, 2);
		grid.setConstraints(textAge, 2, 2);
		grid.setConstraints(textSalary, 3, 2);
		grid.setConstraints(btnSubmit, 4, 2);
		grid.setConstraints(labelImage, 4, 3);
		grid.getChildren().addAll(labelName, labelAge, labelSalary, textName, textAge, textSalary, btnSubmit,
				labelImage);

		Scene scene = new Scene(grid, 1400, 700);
		stage.setScene(scene);
		stage.setTitle("Absolution");
		stage.show();
	}

}
