package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.modelo.inscripcion;
import com.mycompany.controlestudio.util.DatabaseManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class inscripcionDAO {

    public void registrarInscripcion(inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion (id_estudiante, fecha_inscripcion, id_anio_escolar, status) VALUES (?, ?, ?, ?)"; // 🔹 Corrección

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, inscripcion.getId_estudiante());
            stmt.setDate(2, inscripcion.getFecha_inscripcion());
            stmt.setInt(3, inscripcion.getId_anio_escolar()); // 🔹 Corrección
            stmt.setString(4, inscripcion.getStatus());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<inscripcion> obtenerInscripcionesPorEstudiante(int idEstudiante) {
        String sql = "SELECT * FROM inscripcion WHERE id_estudiante = ?";
        List<inscripcion> lista = new ArrayList<>();

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEstudiante);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                inscripcion insc = new inscripcion();
                insc.setId_inscripcion(rs.getInt("id_inscripcion"));
                insc.setId_estudiante(rs.getInt("id_estudiante"));
                insc.setFecha_inscripcion(rs.getDate("fecha_inscripcion"));
                insc.setId_anio_escolar(rs.getInt("id_anio_escolar")); // 🔹 Corrección
                insc.setStatus(rs.getString("status"));
                
                lista.add(insc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void eliminarInscripcion(int idInscripcion) {
        String sql = "DELETE FROM inscripcion WHERE id_inscripcion = ?";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idInscripcion);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

