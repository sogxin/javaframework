import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
public class ControlCircle extends Application {
    private CirclePane circlePane = new CirclePane();
    public void start(Stage primaryStage){
        HBox hBox= new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);
        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHanderler());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);

        Scene scene = new Scene(borderPane,400,400);
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class EnlargeHandler implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e) {
          circlePane.enlarge();
        }
    }
    class ShrinkHanderler implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e) {
         circlePane.Shrink();
        }
    }
}
class CirclePane extends StackPane{
    private Circle circle = new Circle(100);
    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }
    public void enlarge(){
        circle.setRadius(circle.getRadius()+2);
    }
    public void Shrink(){
        circle.setRadius(circle.getRadius()>2 ? circle.getRadius()-2:circle.getRadius());
    }
}