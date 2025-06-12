package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.modelo.especialidad;
import com.mycompany.controlestudio.util.DatabaseManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class especialidadDAO {

    public void agregarEspecialidad(especialidad especialidad) {
        String sql = "INSERT INTO especialidad (nombre_especialidad) VALUES (?)";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, especialidad.getNombre_especialidad());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<especialidad> obtenerEspecialidades() {
        String sql = "SELECT * FROM especialidad";
        List<especialidad> lista = new ArrayList<>();

        try (Connection conn = DatabaseManager.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new especialidad(rs.getInt("id_especialidad"), rs.getString("nombre_especialidad")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void eliminarEspecialidad(int idEspecialidad) {
        String sql = "DELETE FROM especialidad WHERE id_especialidad = ?";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEspecialidad);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

