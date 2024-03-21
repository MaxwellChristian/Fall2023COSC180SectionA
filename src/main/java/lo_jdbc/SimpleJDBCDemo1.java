package lo_jdbc;

import java.sql.*;

public class SimpleJDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the JDBC driver
        //Class.forName("com.mysql.jdbc.Driver");

        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); /* often not required for Java 6 and later (JDBC 4.x) */
        System.out.println("Driver loaded");

        // Connect to a database

//        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\christianm\\IdeaProjects\\JAVAFXPrograms\\src\\main\\java\\com\\maxwell\\javafxprograms\\db_demos\\Students.accdb" , "scott", "tiger");
//        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://db_files/Students.accdb" , "scott", "tiger");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://Students.accdb", "scott", "tiger");

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook" , "scott", "tiger");

        System.out.println("Database connected");

        // Create a statement
        Statement statement = connection.createStatement();

        System.out.println("Fetching Data");
        // Execute a statement
        ResultSet resultSet = statement.executeQuery("select Room, Level from Students");

        // Iterate through the result and print the student names
        while (resultSet.next()) {

            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
        }

        // Close the connection
        connection.close();
    }

}
