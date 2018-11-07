package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Controller {
	@FXML
	Pane pane1;
	@FXML
	Pane pane2;
	@FXML
	Pane pane3;
	@FXML
	Pane pane4;

	public void initialize() {
		pane1.setStyle("-fx-background-image: url('..\\media\\1.jpg')");
		pane2.setStyle("-fx-background-image: url('..\\media\\2.jpg')");
		pane3.setStyle("-fx-background-image: url('..\\media\\3.jpg')");
		pane4.setStyle("-fx-background-image: url('..\\media\\4.jpg')");
		transicion();
	}

	private void transicion() {
		FadeTransition ft1 = new FadeTransition(Duration.seconds(5), pane4);
		ft1.setFromValue(1);
		ft1.setToValue(0);
		ft1.play();
		ft1.setOnFinished(event1 -> {
			FadeTransition ft2 = new FadeTransition(Duration.seconds(3), pane3);
			ft2.setFromValue(1);
			ft2.setToValue(0);
			ft2.play();
			ft2.setOnFinished(event2 -> {
				FadeTransition ft3 = new FadeTransition(Duration.seconds(3), pane2);
				ft3.setFromValue(0);
				ft3.setToValue(1);
				ft3.play();
				ft3.setOnFinished(event3 -> {
					FadeTransition ft4 = new FadeTransition(Duration.seconds(3), pane1);
					ft4.setFromValue(0);
					ft4.setToValue(1);
					ft4.play();
					ft4.setOnFinished(event4 -> {
						FadeTransition ft5 = new FadeTransition(Duration.seconds(3), pane2);
						ft5.setFromValue(0);
						ft5.setToValue(1);
						ft5.play();
						ft5.setOnFinished(event5 -> {
							transicion();
						});
					});
				});
			});
		});
	}
}
