package overridetech.jdbc.jpa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASS = "123456";

    private Connection connection;

    public Connection connectToDB() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        return null;
    }


}


