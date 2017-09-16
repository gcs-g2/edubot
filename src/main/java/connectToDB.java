import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class connectToDB {
    static final private String username = "root";
    static final private String password = "";
    static final private String className = "com.mysql.jdbc.Driver";
    static final private String connectionString = "jdbc:mysql://localhost/edubot?user=" + username + "&password=" + password;

    private Connection connection;
    private Properties properties;

    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", username);
            properties.setProperty("password", password);
        }
        return properties;
    }

    public Connection connect() {
        if (connection == null) {
            try {
                Class.forName(className);
                connection = DriverManager.getConnection(connectionString, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}