package com.tvc.databaseconnector;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnector {
    /**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */
    private String dbPath;
    private String dbURI;


    public static void createNewDatabase(String dbPath) {

        String url = "jdbc:sqlite:" + dbPath;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public String getDbPath() {
        return this.dbPath;
    }

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

    public String getDbURI() {
        return this.dbURI;
    }

    public void setDbURI(String dbPath) {
        this.dbURI = "jdbc:sqlite:" + dbPath;
    }

    public DatabaseConnector(){

    }

    public DatabaseConnector(String dbPath){
        this.setDbPath(dbPath);
        this.setDbURI(dbPath);
    }
}