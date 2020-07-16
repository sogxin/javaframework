import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class HandleEvent  extends Application {
    public void start(Stage primaryStage){
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancal");
        OKHandlerClass  handler1 = new  OKHandlerClass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK,btCancel);
        Scene scene =  new Scene(pane,400,400);
        primaryStage.setTitle("HandleExent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class OKHandlerClass implements EventHandler<ActionEvent>{
    public void handle(ActionEvent e){
        System.out.println("OK button clicked");
    }
}
class CancelHandlerClass implements EventHandler<ActionEvent> {
    public void handle(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}