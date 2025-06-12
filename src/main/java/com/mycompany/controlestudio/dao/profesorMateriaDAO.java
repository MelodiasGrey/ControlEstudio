package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.modelo.profesor_materia;
import com.mycompany.controlestudio.util.DatabaseManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class profesorMateriaDAO {

    public void asignarMateriaAProfesor(profesor_materia profesorMateria) {
        String sql = "INSERT INTO profesor_materia (id_profesor, nombre_materia, anio_escolar) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, profesorMateria.getId_profesor());
            stmt.setString(2, profesorMateria.getNombre_materia());
            stmt.setInt(3, profesorMateria.getAnio_escolar());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<profesor_materia> obtenerMateriasPorProfesor(int idProfesor) {
        String sql = "SELECT * FROM profesor_materia WHERE id_profesor = ?";
        List<profesor_materia> lista = new ArrayList<>();

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idProfesor);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                lista.add(new profesor_materia(rs.getInt("id_profesor_materia"),
                                              rs.getInt("id_profesor"),
                                              rs.getString("nombre_materia"),
                                              rs.getInt("anio_escolar")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

