package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LabelDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // create a pane to hold the nodes
        Pane pane = new StackPane();

        // create a circle with desired properties
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));

        // create a label with desired properties
        Label label = new Label("JAVA FX Demos");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        // add the nodes to the pane
        pane.getChildren().add(circle);
        pane.getChildren().add(label);

        // create a scene to hold the components
        Scene scene = new Scene(pane, 300, 300);

        // set the properties of the stage
        stage.setTitle("Label and Circle");

        // set the scene in the stage
        stage.setScene(scene);

        // show the stage
        stage.show();

    }

    public static void main(String []args){
        Application.launch(args);
    }
}
