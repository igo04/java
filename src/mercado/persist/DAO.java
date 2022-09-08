package mercado.persist;

import java.sql.*;

public class DAO {
    public DAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) {
cnfe.printStackTrace();
System.err.println("Class not found. Error: " + cnfe.getMessage());
        }
    }
protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/mercado", "root", "");
}
}
