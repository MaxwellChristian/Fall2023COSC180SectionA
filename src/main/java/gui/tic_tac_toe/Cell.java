package gui.tic_tac_toe;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Cell extends Pane {

    private char displaySymbol = ' ';

    public Cell() {
        setStyle("-fx-border-color: BLACK;");
        setPrefSize(2000, 2000);
        this.setOnMouseClicked(mouseEvent -> handleMouseClick());
    }

    public void handleMouseClick() {
        if( displaySymbol == ' ' ){
            setDisplaySymbol(this.displaySymbol);
        }
    }

    public char getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(char displaySymbol) {
        this.displaySymbol = displaySymbol;

//        StackPane stackPane = new StackPane();
//        stackPane.setAlignment(Pos.CENTER);
//        stackPane.getChildren().add(new Button(""+this.displaySymbol));
//        this.getChildren().add(stackPane);

        Button lbl = new Button(""+this.displaySymbol);
        lbl.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        this.getChildren().add(lbl);
    }
}
