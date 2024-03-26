package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplitPaneDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        // using a split pane to have multiple areas on a scene with different controls

        // create the split pane
        SplitPane splitPane = new SplitPane();

        // create a scene
        Scene scene = new Scene(splitPane, 300, 250);


        // add the content to the split pane

        // create a container with 3 radio buttons
        VBox vBox = new VBox(10);

        // create radio buttons and add to the vbox
        RadioButton rbCA = new RadioButton("CA");
        RadioButton rbUS = new RadioButton("US");
        RadioButton rbUK = new RadioButton("UK");

        // add the radio buttons to the vbox
        vBox.getChildren().add(rbCA);
        vBox.getChildren().add(rbUS);
        vBox.getChildren().add(rbUK);

        // add all the radio buttons to a group so that only one can be selected
        ToggleGroup rbGroup = new ToggleGroup();
        rbCA.setToggleGroup(rbGroup);
        rbUS.setToggleGroup(rbGroup);
        rbUK.setToggleGroup(rbGroup);

        // add this vbox to the spit pane
        splitPane.getItems().add(vBox);

        // create a new container with buttons and a text area
        TextArea taDescription = new TextArea("Description is displayed here");
        splitPane.getItems().add(new ScrollPane(taDescription));

        // set the scene in the stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("Split Pane Demo");

        // show the stage
        stage.show();


        // add actions to the radio buttons so that appropriate text is displayed in the text area
        rbCA.setOnAction(actionEvent -> taDescription.setText("This is CANADA"));
        rbUS.setOnAction(actionEvent -> taDescription.setText("This is United State of America"));
        rbUK.setOnAction(actionEvent -> taDescription.setText("This is United Kingdom"));
    }
}
