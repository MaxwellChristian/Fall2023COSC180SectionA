package gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextControlsDemo extends Application {

    public static void main(String ... args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // create the controls

        // text field
        Label lblPrompt = new Label("Enter your message: ");
        TextField tfMessage = new TextField();
        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(lblPrompt, tfMessage);

        Label lblMessage = new Label("Your message goes here");
        lblMessage.setAlignment(Pos.CENTER);
        lblMessage.setStyle("-fx-border-width: 2; -fx-border-color: green");

        // add the appropriate event handling
        tfMessage.setOnAction(actionEvent -> lblMessage.setText(tfMessage.getText()));

        // add to the appropriate pane
        BorderPane pane = new BorderPane();
        pane.setTop(hBox);
        pane.setBottom(lblMessage);

        // create the scene
        Scene scene = new Scene(pane, 400, 100);

        // add the scene to the stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("Text Controls");

        // show the stage
        stage.show();

    }
}
