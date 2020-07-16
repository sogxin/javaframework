import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class ShowRectangle extends Application {
    public void start(Stage primaryStage){
        Pane pane = new Pane();

        Rectangle  r1 =  new Rectangle(100,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(80,27,"r1"));
        pane.getChildren().add(r1);

        Rectangle r2 = new Rectangle(100,50,60,30);
        pane.getChildren().add(new Text(80,67,"r2"));
        pane.getChildren().add(r2);

        Rectangle r3 = new Rectangle(100,90,60,30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        pane.getChildren().add(new Text(80,107,"r3"));
        pane.getChildren().add(r3);
        for(int i = 0;i<4;i++){
            Rectangle r = new Rectangle(200,50,100,30);
            r.setRotate(i*360/8);
            r.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            r.setFill(null);
            pane.getChildren().add(r);
        }
        Scene scene = new Scene(pane,400,150);
        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
