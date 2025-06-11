package com.mycompany.controlestudio.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    // Información de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/sce";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    // Método para obtener una nueva conexión a la base de datos
    public static Connection obtenerConexion() throws SQLException {
        try {
            // Cargar el driver JDBC de MySQL (opcional en JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        }
        // ¡Siempre devuelve una nueva conexión!
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}