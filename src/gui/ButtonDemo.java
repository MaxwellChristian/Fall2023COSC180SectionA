package gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonDemo extends Application {

    public static void main(String ... args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lblMessage = new Label("JAVA FX Programming");

        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");

        btnLeft.setOnAction(actionEvent -> lblMessage.setTranslateX(lblMessage.getTranslateX() - 10) );

        // btnRight.setOnAction(actionEvent -> lblMessage.setTranslateX(lblMessage.getTranslateX() + 10) );
        btnRight.setOnAction(actionEvent -> moveToRight(lblMessage, 10) );

        HBox buttonBox = new HBox(20);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(btnLeft, btnRight);

        BorderPane pane = new BorderPane();
        pane.setBottom(buttonBox);
        pane.setCenter(lblMessage);

        // scene
        Scene scene =new Scene(pane, 450, 200);

        // scene to stage
        stage.setScene(scene);

        // stage properties
        stage.setTitle("Button Demo");

        // show the stage
        stage.show();

    }

    private void moveToRight(Label lblMessage, int position) {
        lblMessage.setTranslateX(lblMessage.getTranslateX() + position);
    }
}
