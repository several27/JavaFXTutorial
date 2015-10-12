import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox
{
	public static void display(String title, String message)
	{
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL); // block input events with other windows
		stage.setTitle(title);
		stage.setMinWidth(250);

		Label label = new Label();
		label.setText(message);

		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e -> stage.close());

		VBox layout = new VBox(20);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		stage.setScene(scene);
		stage.showAndWait();
	}
}
