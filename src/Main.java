import com.sun.org.apache.xpath.internal.operations.Bool;
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

		this.primaryStage.setOnCloseRequest(e -> {
			e.consume(); // i'm going to care about closing the program
			closeProgram();
		});

		button = new Button("Cloes window");
		button.setOnAction(e -> closeProgram());

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(button);

		Scene scene = new Scene(stackPane, 300, 250);
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
	}

	public void closeProgram()
	{
		System.out.println("Before program close");

		Boolean answer = ConfirmBox.display("Closing program", "Are you sure, that you want to close this window?");
		if (answer)
			primaryStage.close();
	}
}
