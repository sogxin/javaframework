import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
public class ClockAnimation  extends Application {
    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        ClockPane clock = new ClockPane();
        pane.setCenter(clock);
        EventHandler<ActionEvent> eventHandler = e -> { clock.setCurrentTime(); };
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(pane,250,250);
        primaryStage.setTitle("ClockAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.widthProperty().addListener(ov->clock.setW(pane.getWidth()));
        pane.widthProperty().addListener(ov->clock.setH(pane.getHeight()));
    }
}
