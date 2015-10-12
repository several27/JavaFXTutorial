import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox
{
	static boolean answer;

	public static boolean display(String title, String message)
	{
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL); // block input events with other windows
		stage.setTitle(title);
		stage.setMinWidth(250);

		Label label = new Label();
		label.setText(message);

		Button yesButton = new Button("Yes");
		Button noButton = new Button("No");

		yesButton.setOnAction(e -> {
			answer = true;
			stage.close();
		});
		noButton.setOnAction(e -> {
			answer = false;
			stage.close();
		});

		VBox layout = new VBox(20);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		stage.setScene(scene);
		stage.showAndWait();

		return answer;
	}
}
