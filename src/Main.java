import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;

public class Main extends Application
{
	Stage primaryStage;
	Button button;

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Title");

		button = new Button("Click me");
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Title", "Are u sure ?");
			System.out.println(result);
		});

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(button);

		Scene scene = new Scene(stackPane, 300, 250);
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
	}
}
