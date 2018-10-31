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
	@FXML
	private void nuevapantalla() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("interfaz2.fxml"));
//		loader.setController(new setBlur());
		AnchorPane mypane;
		try {
			
			mypane = (AnchorPane) loader.load();
			stage=new Stage();
			stage.setTitle("Registro");
			Scene scene=new Scene(mypane);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
