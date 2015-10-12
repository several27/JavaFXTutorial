import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
	Stage primaryStage;
	Scene scene1, scene2;

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		this.primaryStage = primaryStage;

		Label label1 = new Label("Welcome to the first screen!");
		Button button1 = new Button("Go to scene 2");
		button1.setOnAction(e -> primaryStage.setScene(scene2));

		// Layout 1
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);

		Button button2 = new Button("Go back to scene 1");
		button2.setOnAction(e -> primaryStage.setScene(scene1));

		// Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);

		primaryStage.setScene(scene1);
		primaryStage.setTitle("Title here");
		primaryStage.show();
	}
}
