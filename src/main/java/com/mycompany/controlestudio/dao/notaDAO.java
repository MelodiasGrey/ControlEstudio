package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.modelo.notas;
import com.mycompany.controlestudio.util.DatabaseManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class notaDAO {

    // Cargar una nueva nota
    public void cargarNota(notas nota) {
        String sql = "INSERT INTO nota (id_estudiante, id_materia, id_año_escolar, id_inscripcion, lapso1, lapso2, lapso3, nota_final, fecha_registro, observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, nota.getId_estudiante());
            stmt.setInt(2, nota.getId_materia());
            stmt.setInt(3, nota.getId_año_escolar());
            stmt.setInt(4, nota.getId_inscripcion());
            stmt.setBigDecimal(5, nota.getLapso1());
            stmt.setBigDecimal(6, nota.getLapso2());
            stmt.setBigDecimal(7, nota.getLapso3());
            stmt.setBigDecimal(8, nota.getNota_final());
            stmt.setDate(9, nota.getFecha_registro());
            stmt.setString(10, nota.getObservaciones());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Modificar una nota existente
    public void actualizarNota(notas nota) {
        String sql = "UPDATE nota SET lapso1 = ?, lapso2 = ?, lapso3 = ?, nota_final = ?, fecha_registro = ?, observaciones = ? WHERE id_nota = ?";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setBigDecimal(1, nota.getLapso1());
            stmt.setBigDecimal(2, nota.getLapso2());
            stmt.setBigDecimal(3, nota.getLapso3());
            stmt.setBigDecimal(4, nota.getNota_final());
            stmt.setDate(5, nota.getFecha_registro());
            stmt.setString(6, nota.getObservaciones());
            stmt.setInt(7, nota.getId_nota());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener las notas de un estudiante específico
    public List<notas> obtenerNotasPorEstudiante(int idEstudiante) {
        String sql = "SELECT * FROM nota WHERE id_estudiante = ?";
        List<notas> lista = new ArrayList<>();

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEstudiante);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                notas nota = new notas();
                nota.setId_nota(rs.getInt("id_nota"));
                nota.setId_estudiante(rs.getInt("id_estudiante"));
                nota.setId_materia(rs.getInt("id_materia"));
                nota.setId_año_escolar(rs.getInt("id_año_escolar"));
                nota.setId_inscripcion(rs.getInt("id_inscripcion"));
                nota.setLapso1(rs.getBigDecimal("lapso1"));
                nota.setLapso2(rs.getBigDecimal("lapso2"));
                nota.setLapso3(rs.getBigDecimal("lapso3"));
                nota.setNota_final(rs.getBigDecimal("nota_final"));
                nota.setFecha_registro(rs.getDate("fecha_registro"));
                nota.setObservaciones(rs.getString("observaciones"));
                
                lista.add(nota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Eliminar una nota específica
    public void eliminarNota(int idNota) {
        String sql = "DELETE FROM nota WHERE id_nota = ?";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idNota);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
