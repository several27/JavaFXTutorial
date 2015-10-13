import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;

public class Main extends Application
{
	Stage primaryStage;

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Title");

		HBox topMenu = new HBox();
		Button buttonFile = new Button("File");
		Button buttonEdit = new Button("Edit");
		Button buttonView = new Button("View");
		topMenu.getChildren().addAll(buttonFile, buttonEdit, buttonView);

		VBox leftMenu = new VBox();
		Button buttonA = new Button("A");
		Button buttonB = new Button("B");
		Button buttonC = new Button("C");
		leftMenu.getChildren().addAll(buttonA, buttonB, buttonC);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);

		Scene scene = new Scene(borderPane, 300, 250);
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
	}
}
