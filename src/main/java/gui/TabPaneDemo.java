package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TabPaneDemo extends Application {

    public static void main(String ... args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // 1. create a tab pane
        TabPane tabPane = new TabPane();

        // 2. create required tabs
        Tab tabLine = new Tab("Line");
        Tab tabRectangle = new Tab("Rectangle");
        Tab tabCircle = new Tab("Circle");

        // 3. add the content to the tab

        // content for tab line
        StackPane spLine = new StackPane();
        spLine.getChildren().add(new Line(10, 10, 80, 80));
        // add the content to the tab line
        tabLine.setContent(spLine);

        // content for tab rectangle
        StackPane spRectangle = new StackPane();
        spRectangle.getChildren().add(new Rectangle(10, 10, 200, 200));
        // add the content to the tab rectangle
        tabRectangle.setContent(spRectangle);

        // content for tab circle
        StackPane spCircle = new StackPane();
        spCircle.getChildren().add(new Circle(50, 50, 40));
        // add the content to the tab circle
        tabCircle.setContent(spCircle);

        // 4. add all the tabs to tab pane
        tabPane.getTabs().add(tabLine);
        tabPane.getTabs().add(tabRectangle);
        tabPane.getTabs().add(tabCircle);

        Scene scene = new Scene(tabPane, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Tab Pane Demo");

        stage.show();
    }
}
