package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipses extends Application {

//    public static void main(String... args) {
//        Application.launch(args);
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // create a scene with custom pane
        Scene scene = new Scene(new EllipsePane(), 300, 200);

        // add the scene to the stage
        primaryStage.setScene(scene);

        // set the title of the stage
        primaryStage.setTitle("Ellipse Demo");

        // show the stage
        primaryStage.show();

        System.out.println("Width: " + primaryStage.getWidth());
        System.out.println("Height: " + primaryStage.getHeight());
    }
}

class EllipsePane extends Pane {

    public EllipsePane() {

        getChildren().clear();
        for (int index = 0; index < 8; index++) {
            Ellipse ellipse = new Ellipse(getWidth() / 2, getHeight() / 2, getWidth() / 2 - 50, getHeight() / 2 - 50);
            ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            ellipse.setFill(Color.WHITE);
            ellipse.setRotate(index * 180/8);

            getChildren().add(ellipse);
        }

    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setHeight(double height) {
        super.setHeight(height);
    }

}
