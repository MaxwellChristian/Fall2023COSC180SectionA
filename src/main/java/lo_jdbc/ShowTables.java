package lo_jdbc;

import java.sql.*;

public class ShowTables {

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

        try {
            // connect to database
            Connection connection = connect();

            DatabaseMetaData dbMetaData = connection.getMetaData();

            ResultSet result = dbMetaData.getTables(null, null, null, new String[]{"TABLE"});

            System.out.println("List of tables: ");
            while (result.next()){
                System.out.println(result.getString("TABLE_NAME"));
            }

            // close the connection
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
