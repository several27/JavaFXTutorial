import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application
{
	Button button;

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Title of the Window");

		button = new Button();
		button.setText("Click me");
//		button.setOnAction(new EventHandler<ActionEvent>()
//		{
//			@Override
//			public void handle(ActionEvent event)
//			{
//				System.out.println("I am in this thing :(");
//			}
//		});

//		Simplified:
//		button.setOnAction((ActionEvent event) -> {
//			System.out.println("I am in this thing :(");
//		});

//		Even more simplified:
		button.setOnAction(
				(ActionEvent event) -> System.out.println("I am in this thing :(")
		);

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
