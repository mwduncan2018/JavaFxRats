package introduction;

import javafx.application.Application;
import javafx.geometry.Pos;
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
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;

public class BigDemo extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void init() {
	}

	/**
	 *
	 */
	@Override
	public void start(Stage stage) {
		TextField taskName = new TextField();
		taskName.setPromptText("Enter task name");
		taskName.setText("Default Text");
		taskName.setMinWidth(300);
		GridPane.setConstraints(taskName, 1, 1, 1, 1);

		ComboBox comboPriority = new ComboBox();
		comboPriority.getItems().addAll("High", "Low", "Medium");
		comboPriority.setPromptText("Enter Priority");
		GridPane.setConstraints(comboPriority, 2, 1, 1, 1);

		Button btnAdd = new Button("Add");
		btnAdd.setMinWidth(100);
		GridPane.setConstraints(btnAdd, 1, 2, 1, 1);

		Button btnCancel = new Button("Cancel");
		btnCancel.setMinWidth(100);
		GridPane.setConstraints(btnCancel, 2, 2, 1, 1);

		HBox progressArea = new HBox();
		progressArea.getChildren().addAll(new Label("Progress"), new Spinner<Integer>(0, 100, 0), new CheckBox("Completed"));
		progressArea.setAlignment(Pos.CENTER_RIGHT);
		progressArea.setSpacing(10);
		GridPane.setConstraints(progressArea, 1, 3, 2, 1);

		Label tableArea = new Label("Check out this table!");
		tableArea.setMinWidth(600);
		GridPane.setConstraints(tableArea, 1, 4, 10, 1);

		TableView table = new TableView();
		table.setMinHeight(300);
		table.setMinWidth(550);
		TableColumn tableColumn1 = new TableColumn("Priority");
		TableColumn tableColumn2 = new TableColumn("Description");
		TableColumn tableColumn3 = new TableColumn("Progress");
		table.getColumns().addAll(tableColumn1, tableColumn2, tableColumn3);
		GridPane.setConstraints(table, 1, 5, 10, 1);

		GridPane grid = new GridPane();
		//grid.setMinWidth(600);
		//grid.setMinHeight(400);
		grid.setVgap(20);
		grid.setHgap(20);
		grid.setGridLinesVisible(false);
		grid.getChildren().addAll(table, tableArea, taskName, comboPriority, btnAdd, btnCancel, progressArea);

		/*
		 * Label labelName = new Label("Enter Your Name"); Label labelAge = new
		 * Label("Select Your Age"); Label labelSalary = new
		 * Label("Select Your Salary"); Label labelPizza = new Label("Pizza"); Label
		 * labelImage = new Label(); labelImage.setGraphic(new ImageView(new
		 * Image(getClass().getResourceAsStream("github_avatar.jpg"))));
		 * 
		 * TextField textName = new TextField();
		 * textName.setPromptText("Enter name...");
		 * 
		 * ComboBox comboAge = new ComboBox(); comboAge.getItems().addAll("Baby",
		 * "Child", "Young", "Old F%%k"); ComboBox comboSalary = new ComboBox();
		 * comboSalary.getItems().addAll("<50k", "50k-100k", "100k-150k", ">150k");
		 * 
		 * CheckBox checkPizza = new CheckBox("Want pizza?");
		 * 
		 * Button btnSubmit = new Button("Submit Button"); btnSubmit.setPrefSize(160,
		 * 20);
		 */

		/*
		 * grid.setConstraints(labelName, 1, 1); grid.setConstraints(labelAge, 2, 1);
		 * grid.setConstraints(labelSalary, 3, 1); grid.setConstraints(labelPizza, 4,
		 * 1); grid.setConstraints(textName, 1, 2); grid.setConstraints(comboAge, 2, 2);
		 * grid.setConstraints(comboSalary, 3, 2); grid.setConstraints(checkPizza, 4,
		 * 2); grid.setConstraints(btnSubmit, 5, 2); grid.setConstraints(labelImage, 5,
		 * 3); grid.getChildren().addAll(labelName, labelAge, labelSalary, labelPizza,
		 * textName, comboAge, comboSalary, checkPizza, btnSubmit, labelImage);
		 */

		Scene scene = new Scene(grid, 1400, 700);
		stage.setScene(scene);
		stage.setTitle("Jaws Of Life");
		stage.setAlwaysOnTop(true);
		stage.show();
	}
}
