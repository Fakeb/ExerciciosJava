package controller;

public class DBConfig {
    
    private static String address;
    private static String port;
    private static String database;
    private static String user;
    private static String pass;
    
    public static void setValues(String address, String port, String database, String user, String pass){
        DBConfig.address = address;
        DBConfig.port = port;
        DBConfig.database = database;
        DBConfig.user = user;
        DBConfig.pass = pass;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        DBConfig.address = address;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        DBConfig.port = port;
    }

    public static String getDatabase() {
        return database;
    }

    public static void setDatabase(String database) {
        DBConfig.database = database;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        DBConfig.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        DBConfig.pass = pass;
    }
    
}
