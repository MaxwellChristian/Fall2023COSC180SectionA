package gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class BorderPaneDemo2 extends Application {

    public static void main(String... args) {
        Application.launch(args);
    }

    /*
    @Override
    public void start(Stage stage) throws Exception {

        // create the controls

        // the buttons for left and right movement
        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");
        HBox boxButtons = new HBox(20);
        boxButtons.setAlignment(Pos.CENTER);
        boxButtons.getChildren().addAll(btnLeft, btnRight);

        // the text (to be displayed in center)
        Label lbl = new Label("JAVAFX Demo (BorderPane)");

        // check boxes on the right
        CheckBox cbBold = new CheckBox("Bold");
        CheckBox cbItalic = new CheckBox("Italic");
        VBox boxFontStyle = new VBox(10);
        boxFontStyle.getChildren().addAll(cbBold, cbItalic);

        // handle font style selection
        EventHandler<ActionEvent> actionHandler = actionEvent -> {
            if( cbBold.isSelected() && cbItalic.isSelected() ){
                // set font to both bold and italics
                setFontStyle(lbl, FontWeight.BOLD, FontPosture.ITALIC);
            }
            else {
                if( cbBold.isSelected() ){
                    // set the font to bold
                    setFontStyle(lbl, FontWeight.BOLD, FontPosture.REGULAR);
                }
                else {
                    if ( cbItalic.isSelected() ){
                        // set the font to italics
                        setFontStyle(lbl, FontWeight.NORMAL, FontPosture.ITALIC);
                    }
                    else {
                        // set the font to normal
                        setFontStyle(lbl, FontWeight.NORMAL, FontPosture.REGULAR);
                    }
                }
            }
        };
        cbBold.setOnAction(actionHandler);
        cbItalic.setOnAction(actionHandler);

        // radio buttons for color
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");

        ToggleGroup grpColors = new ToggleGroup();
        rbRed.setToggleGroup(grpColors);
        rbGreen.setToggleGroup(grpColors);
        rbBlue.setToggleGroup(grpColors);
        VBox boxColors = new VBox(10);
        boxColors.getChildren().addAll(rbRed, rbGreen, rbBlue);

        // handle color selection
        rbRed.setOnAction(actionEvent -> setColor(lbl, Color.RED));
        rbGreen.setOnAction(actionEvent -> setColor(lbl, Color.GREEN));
        rbBlue.setOnAction(actionEvent -> setColor(lbl, Color.BLUE));

        // arrange the controls in a pane
        BorderPane pane = new BorderPane();
        pane.setBottom(boxButtons);
        pane.setCenter(lbl);
        pane.setRight(boxFontStyle);
        pane.setLeft(boxColors);


        // add the pane to a scene
        Scene scene = new Scene(pane);

        // add the scene to the stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("BorderPane Demo");

        // show the stage
        stage.show();

    }
    */

    @Override
    public void start(Stage stage) throws Exception {

        // set up the controls
        Pane pane = setupControls();

        // add to scene
        Scene scene = new Scene(pane, 400, 200);

        // set the stage with scene
        stage.setScene(scene);

        // display the scene
        stage.show();

    }

    private Pane setupControls() {

        // create an appropriate pane
        BorderPane borderPane = new BorderPane();

        // create the controls
        Pane topPane = setupTopPane();

        // add to the pane
        borderPane.setTop(topPane);

        // return the pane
        return borderPane;
    }

    private Pane setupTopPane() {

        Label lbl = new Label("Enter your message:");
        TextField textField = new TextField();
        textField.setOnAction(actionEvent -> handleTextField(textField, lbl));

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(lbl, textField);

        return hBox;
    }

    private void handleTextField(TextField textField, Label lbl) {
        lbl.setText(textField.getText());
    }

    private void setFontStyle(Label lbl, FontWeight weight, FontPosture posture) {
        lbl.setFont(Font.font(lbl.getFont().getName(), weight, posture, lbl.getFont().getSize()));
    }

    private void setColor(Label lbl, Color color) {
        lbl.setTextFill(color);
    }


}
