package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.modelo.anio_escolar;
import com.mycompany.controlestudio.util.DatabaseManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class anioEscolarDAO {
    public void registrarAnioEscolar(anio_escolar anio) {
        String sql = "INSERT INTO anio_escolar (descripcion, fecha_inicio, fecha_fin) VALUES (?, ?, ?)"; // CORRECCIÓN

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, anio.getNombre_anio());
            stmt.setDate(2, anio.getFecha_inicio());
            stmt.setDate(3, anio.getFecha_fin());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
