package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class BorderPaneDemo2 extends Application {

    private Label lbl;

    public static void main(String... args) {
        Application.launch(args);
    }

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
        Pane bottomPane = setupBottomPane();
        Pane leftPane = setupLeftPane();
        Pane rightPane = setupRightPane();
        Pane centerPane = setupCenterPane();

        // add to the pane
        borderPane.setTop(topPane);
        borderPane.setBottom(bottomPane);
        borderPane.setLeft(leftPane);
        borderPane.setRight(rightPane);
        borderPane.setCenter(centerPane);

        // return the pane
        return borderPane;
    }

    private Pane setupCenterPane() {

        lbl = new Label("JAVAFX Demo (BorderPane)");

        HBox hBox = new HBox(lbl);
        hBox.setAlignment(Pos.CENTER);

        return hBox;
    }

    private Pane setupLeftPane() {

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

        return boxColors;
    }

    private Pane setupRightPane() {

        CheckBox cbBold = new CheckBox("Bold");
        CheckBox cbItalic = new CheckBox("Italic");

        VBox boxFontStyle = new VBox(10);
        boxFontStyle.getChildren().addAll(cbBold, cbItalic);

        // handle font style selection
        EventHandler<ActionEvent> actionHandler = actionEvent -> {
            if (cbBold.isSelected() && cbItalic.isSelected()) {
                // set font to both bold and italics
                setFontStyle(lbl, FontWeight.BOLD, FontPosture.ITALIC);
            } else {
                if (cbBold.isSelected()) {
                    // set the font to bold
                    setFontStyle(lbl, FontWeight.BOLD, FontPosture.REGULAR);
                } else {
                    if (cbItalic.isSelected()) {
                        // set the font to italics
                        setFontStyle(lbl, FontWeight.NORMAL, FontPosture.ITALIC);
                    } else {
                        // set the font to normal
                        setFontStyle(lbl, FontWeight.NORMAL, FontPosture.REGULAR);
                    }
                }
            }
        };
        cbBold.setOnAction(actionHandler);
        cbItalic.setOnAction(actionHandler);

        return boxFontStyle;
    }

    private Pane setupBottomPane() {

        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");

        btnLeft.setOnAction(actionEvent -> lbl.setTranslateX(lbl.getTranslateX() - 10));
        btnRight.setOnAction(actionEvent -> lbl.setTranslateX(lbl.getTranslateX() + 10));

        HBox boxButtons = new HBox(20);
        boxButtons.setAlignment(Pos.CENTER);
        boxButtons.getChildren().addAll(btnLeft, btnRight);

        return boxButtons;
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
