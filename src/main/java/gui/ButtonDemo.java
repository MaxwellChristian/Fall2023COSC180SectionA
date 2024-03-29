package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ButtonDemo extends Application {

    public static void main(String ... args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lblMessage = new Label("JAVA FX Programming");
        lblMessage.setFont(Font.font("Arial", FontPosture.REGULAR, 20));

        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");

        btnLeft.setOnAction(actionEvent -> lblMessage.setTranslateX(lblMessage.getTranslateX() - 10) );

        // btnRight.setOnAction(actionEvent -> lblMessage.setTranslateX(lblMessage.getTranslateX() + 10) );
        btnRight.setOnAction(actionEvent -> moveToRight(lblMessage, 10) );

        HBox buttonBox = new HBox(20);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(btnLeft, btnRight);

        // check boxes for font style (bold, italics, bold-italics)
        CheckBox cbBold = new CheckBox("Bold");
        CheckBox cbItalics = new CheckBox("Italics");
        VBox boxForFonts = new VBox(20);
        boxForFonts.setPadding(new Insets(5, 5, 5, 5));
        boxForFonts.getChildren().addAll(cbBold, cbItalics);

        EventHandler<ActionEvent> actionHandler = actionEvent -> {
            if( cbBold.isSelected() && cbItalics.isSelected() ){
                // set font to both bold and italics
                setFontStyle(lblMessage, FontWeight.BOLD, FontPosture.ITALIC);
            }
            else {
                if( cbBold.isSelected() ){
                    // set the font to bold
                    setFontStyle(lblMessage, FontWeight.BOLD, FontPosture.REGULAR);
                }
                else {
                    if ( cbItalics.isSelected() ){
                        // set the font to italics
                        setFontStyle(lblMessage, FontWeight.NORMAL, FontPosture.ITALIC);
                    }
                    else {
                        // set the font to normal
                        setFontStyle(lblMessage, FontWeight.NORMAL, FontPosture.REGULAR);
                    }
                }
            }
        };
        cbBold.setOnAction(actionHandler);
        cbItalics.setOnAction(actionHandler);

        // Color selection
        RadioButton rdRed = new RadioButton("Red");
        RadioButton rdGreen = new RadioButton("Green");
        RadioButton rdBlue = new RadioButton("Blue");
        VBox colorBox = new VBox(20);
        colorBox.getChildren().addAll(rdRed, rdGreen, rdBlue);

        // color group
        ToggleGroup colorGroup = new ToggleGroup();
        // set the group to the radio button
        rdRed.setToggleGroup(colorGroup);
        rdGreen.setToggleGroup(colorGroup);
        rdBlue.setToggleGroup(colorGroup);

        rdRed.setOnAction(actionEvent -> lblMessage.setTextFill(Color.RED));
        rdGreen.setOnAction(actionEvent -> lblMessage.setTextFill(Color.GREEN));
        rdBlue.setOnAction(actionEvent -> lblMessage.setTextFill(Color.BLUE));


        BorderPane pane = new BorderPane();
        pane.setBottom(buttonBox);
        pane.setCenter(lblMessage);
        pane.setRight(boxForFonts);
        pane.setLeft(colorBox);

        // scene
        Scene scene =new Scene(pane, 450, 200);

        // scene to stage
        stage.setScene(scene);

        // stage properties
        stage.setTitle("Button Demo");

        // show the stage
        stage.show();

    }

    private void setFontStyle(Label lblMessage, FontWeight fontWeight, FontPosture fontPosture) {
        Font fontToUse = Font.font(lblMessage.getFont().getName(), fontWeight, fontPosture, lblMessage.getFont().getSize());
        lblMessage.setFont(fontToUse);
    }

    private void moveToRight(Label lblMessage, int position) {
        lblMessage.setTranslateX(lblMessage.getTranslateX() + position);
    }
}
