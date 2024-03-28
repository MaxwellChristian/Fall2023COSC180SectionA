package lo_jdbc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.sql.*;
import java.util.ArrayList;

public class TableNamesOnTabs extends Application {

    private static Connection connection;

    private static Connection connect() {

        Connection connection = null;

        try {
            // load the driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // connect to required database
            connection = DriverManager.getConnection("jdbc:ucanaccess://Students.accdb", "scott", "tiger");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // return the connection
            return connection;
        }

    }

    public static void main(String ... args) {
        connection = connect();
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        ArrayList<String> tableNames = getTableNames(connection);

        // 1. create a tab pane
        TabPane tabPane = new TabPane();

        // 2. create required tabs
//        Tab tabLine = new Tab("Line");
//        Tab tabRectangle = new Tab("Rectangle");
//        Tab tabCircle = new Tab("Circle");
        for (String tableName: tableNames){
            Tab tabToAdd = new Tab(tableName);
            tabPane.getTabs().add(tabToAdd);
        }

        // 3. add the content to the tab

        // content for tab line

        // content for tab rectangle

        // content for tab circle
//        StackPane spCircle = new StackPane();
//        spCircle.getChildren().add(new Circle(50, 50, 40));
//        // add the content to the tab circle
//        tabCircle.setContent(spCircle);

        // 4. add all the tabs to tab pane
//        tabPane.getTabs().add(tabLine);
//        tabPane.getTabs().add(tabRectangle);
//        tabPane.getTabs().add(tabCircle);

        Scene scene = new Scene(tabPane, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Tab Pane Demo");

        stage.show();
    }

    private ArrayList<String> getTableNames(Connection connection) throws SQLException {

        ArrayList<String> tableNames = new ArrayList<>();
        DatabaseMetaData dbMetaData = connection.getMetaData();

        ResultSet result = dbMetaData.getTables(null, null, null, new String[]{"TABLE"});

        System.out.println("List of tables: ");
        while (result.next()){
            tableNames.add(result.getString("TABLE_NAME"));
        }

        return tableNames;
    }
}
