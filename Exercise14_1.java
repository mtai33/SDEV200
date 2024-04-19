import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exercise14_1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a grid pane to hold the images
        GridPane pane = new GridPane();

        // Load the images
        Image flag1 = new Image(getClass().getResourceAsStream("flag1.gif"));
        Image flag2 = new Image(getClass().getResourceAsStream("flag2.gif"));
        Image flag6 = new Image(getClass().getResourceAsStream("flag6.gif"));
        Image flag7 = new Image(getClass().getResourceAsStream("flag7.gif"));

        // Create image views and add them to the grid pane
        ImageView imageView1 = new ImageView(flag1);
        ImageView imageView2 = new ImageView(flag2);
        ImageView imageView6 = new ImageView(flag6);
        ImageView imageView7 = new ImageView(flag7);

      double imageSize = 120; // Adjust this value as needed
      imageView1.setFitWidth(imageSize);
      imageView1.setFitHeight(imageSize);
      imageView2.setFitWidth(imageSize);
      imageView2.setFitHeight(imageSize);
      imageView6.setFitWidth(imageSize);
      imageView6.setFitHeight(imageSize);
      imageView7.setFitWidth(imageSize);
      imageView7.setFitHeight(imageSize);

        pane.add(imageView1, 0, 0);
        pane.add(imageView2, 1, 0);
        pane.add(imageView6, 0, 1);
        pane.add(imageView7, 1, 1);

        // Create the scene and set it to the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
