package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.modelo.profesor_especialidad;
import com.mycompany.controlestudio.util.DatabaseManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class profesorEspecialidadDAO {

    public void asignarEspecialidadAProfesor(profesor_especialidad profesorEspecialidad) {
        String sql = "INSERT INTO profesor_especialidad (id_profesor, nombre_especialidad) VALUES (?, ?)";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, profesorEspecialidad.getId_profesor());
            stmt.setString(2, profesorEspecialidad.getNombre_especialidad());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<profesor_especialidad> obtenerEspecialidadesPorProfesor(int idProfesor) {
        String sql = "SELECT * FROM profesor_especialidad WHERE id_profesor = ?";
        List<profesor_especialidad> lista = new ArrayList<>();

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idProfesor);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                lista.add(new profesor_especialidad(rs.getInt("id_profesor_especialidad"),
                                                   rs.getInt("id_profesor"),
                                                   rs.getString("nombre_especialidad")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

