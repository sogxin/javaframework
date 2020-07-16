import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
public class ShowImage  extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591622090828&di=955067516423a8f86d712568094372d7&imgtype=0&src=http%3A%2F%2Fi03.c.aliimg.com%2Fimg%2Fibank%2F2012%2F048%2F556%2F668655840_1033273584.310x310.jpg");
        pane.getChildren().add(new ImageView(image));
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);


        ImageView imageView3= new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
