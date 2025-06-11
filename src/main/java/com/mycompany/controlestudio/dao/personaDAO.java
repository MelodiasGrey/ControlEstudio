package com.mycompany.controlestudio.dao;

import com.mycompany.controlestudio.util.DatabaseManager;
import com.mycompany.controlestudio.modelo.persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class personaDAO {
    
    // Obtiene una persona por nombre de usuario
    public persona obtenerPersonaPorNombreUsuario(String nombreUsuario) throws SQLException {
        String sql = "SELECT * FROM persona WHERE nombre_usuario = ?";
        persona per = null;

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    per = new persona();
                    per.setId_persona(rs.getInt("id_persona"));
                    per.setNombre_usuario(rs.getString("nombre_usuario"));
                    per.setPrimer_nombre(rs.getString("primer_nombre"));
                    per.setSegundo_nombre(rs.getString("segundo_nombre"));
                    per.setPrimer_apellido(rs.getString("primer_apellido"));
                    per.setSegundo_apellido(rs.getString("segundo_apellido"));
                    per.setCedula(rs.getString("cedula"));

                    // Enum Sexo
                    String sexoStr = rs.getString("sexo");
                    if (sexoStr != null) {
                        per.setSexo(persona.Sexo.valueOf(sexoStr));
                    }
                    per.setDireccion(rs.getString("direccion"));
                    per.setTelefono(rs.getString("telefono"));
                    per.setEmail(rs.getString("email"));

                    // Enum TipoRol
                    String rolStr = rs.getString("tipo_rol");
                    if (rolStr != null) {
                        per.setTipo_rol(persona.TipoRol.valueOf(rolStr));
                    }
                    per.setContrasena_hash(rs.getString("contrasena_hash"));
                }
            }
        }
        return per;
    }

    // Obtiene el hash de la contraseña y el rol (tipo_rol) por nombre de usuario
    public String[] obtenerHashYRol(String nombreUsuario) {
        String sql = "SELECT contrasena_hash, tipo_rol FROM persona WHERE nombre_usuario = ?";
        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String hash = rs.getString("contrasena_hash");
                    String rol = rs.getString("tipo_rol");
                    return new String[]{hash, rol};
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // usuario no encontrado
    }
  
}
