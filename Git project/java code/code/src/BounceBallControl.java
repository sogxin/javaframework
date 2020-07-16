import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application {
    public void start(Stage primaryStage){
        BallPane ballPane = new BallPane();
        ballPane.setOnMousePressed(e->ballPane.pause());
        ballPane.setOnMouseReleased(e->ballPane.play());
        ballPane.setOnKeyPressed(e->{
            if(e.getCode()==KeyCode.UP){ballPane.increaseSpeed();}
            else if(e.getCode()== KeyCode.DOWN){
                ballPane.decreaseSpeed();
            }
        });
        Scene scene = new Scene(ballPane,400,300);
        primaryStage.setTitle("BounceBallControl");
        primaryStage.setScene(scene);
        primaryStage.show();
        ballPane.requestFocus();
    }
}
