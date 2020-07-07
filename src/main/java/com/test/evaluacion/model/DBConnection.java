package com.test.evaluacion.model;

import lombok.Setter;


public class DBConnection
{
    @Setter
    private static String host;
    @Setter
    private static String port;
    @Setter
    private static String name;
    @Setter
    private static String user;
    @Setter
    private static String password;

    public static String getURL() throws ClassNotFoundException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return String.format("jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s", host, port, name, user, password);
    }
}