package lo_jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShowMetaData {

    public static void main(String ... args) {

        try {

            // connect to database
            Connection connection = connect();

            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println("database URL: " + dbMetaData.getURL());
            System.out.println("database username: " +
                    dbMetaData.getUserName());
            System.out.println("database product name: " +
                    dbMetaData.getDatabaseProductName());
            System.out.println("database product version: " +
                    dbMetaData.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " +
                    dbMetaData.getDriverName());
            System.out.println("JDBC driver version: " +
                    dbMetaData.getDriverVersion());
            System.out.println("JDBC driver major version: " +
                    dbMetaData.getDriverMajorVersion());
            System.out.println("JDBC driver minor version: " +
                    dbMetaData.getDriverMinorVersion());
            System.out.println("Max number of connections: " +
                    dbMetaData.getMaxConnections());
            System.out.println("MaxTableNameLength: " +
                    dbMetaData.getMaxTableNameLength());
            System.out.println("MaxColumnsInTable: " +
                    dbMetaData.getMaxColumnsInTable());

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

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

}
