package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	private Stage stage;
	@Override

	public void start(Stage stage) throws IOException {
		 AnchorPane mypane;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("interfaz.fxml"));
		mypane = (AnchorPane) loader.load();
		stage.setTitle("Login");
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
