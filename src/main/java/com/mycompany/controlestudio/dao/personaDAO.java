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
    
    // Crear una nueva persona (Administrador puede usarlo para registrar nuevos usuarios)
    public void crearPersona(persona nuevaPersona) {
        String sql = "INSERT INTO  persona (nombre_usuario, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula, sexo, direccion, telefono, email, tipo_rol, contrasena_hash) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nuevaPersona.getNombre_usuario());
            stmt.setString(2, nuevaPersona.getPrimer_nombre());
            stmt.setString(3, nuevaPersona.getSegundo_nombre());
            stmt.setString(4, nuevaPersona.getPrimer_apellido());
            stmt.setString(5, nuevaPersona.getSegundo_apellido());
            stmt.setString(6, nuevaPersona.getCedula());
            stmt.setString(7, nuevaPersona.getSexo().name()); // Convertimos Enum a String
            stmt.setString(8, nuevaPersona.getDireccion());
            stmt.setString(9, nuevaPersona.getTelefono());
            stmt.setString(10, nuevaPersona.getEmail());
            stmt.setString(11, nuevaPersona.getTipo_rol().name()); // Convertimos Enum a String
            stmt.setString(12, nuevaPersona.getContrasena_hash());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Actualizar datos de una persona (Administrador y usuario pueden modificar información)
    public void actualizarPersona(persona personaActualizada) {
        String sql = "UPDATE persona SET primer_nombre = ?, segundo_nombre = ?, primer_apellido = ?, segundo_apellido = ?, cedula = ?, sexo = ?, direccion = ?, telefono = ?, email = ?, tipo_rol = ?, contrasena_hash = ? WHERE nombre_usuario = ?";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, personaActualizada.getPrimer_nombre());
            stmt.setString(2, personaActualizada.getSegundo_nombre());
            stmt.setString(3, personaActualizada.getPrimer_apellido());
            stmt.setString(4, personaActualizada.getSegundo_apellido());
            stmt.setString(5, personaActualizada.getCedula());
            stmt.setString(6, personaActualizada.getSexo().name());
            stmt.setString(7, personaActualizada.getDireccion());
            stmt.setString(8, personaActualizada.getTelefono());
            stmt.setString(9, personaActualizada.getEmail());
            stmt.setString(10, personaActualizada.getTipo_rol().name());
            stmt.setString(11, personaActualizada.getContrasena_hash());
            stmt.setString(12, personaActualizada.getNombre_usuario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar persona (Solo el administrador debería poder hacer esto)
    public void eliminarPersona(String nombreUsuario) {
        String sql = "DELETE FROM persona WHERE nombre_usuario = ?";

        try (Connection conn = DatabaseManager.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombreUsuario);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener lista completa de personas (Útil para mostrar en el dashboard)
    public List<persona> obtenerListaPersonas() {
        String sql = "SELECT * FROM persona";
        List<persona> lista = new ArrayList<>();

        try (Connection conn = DatabaseManager.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                persona per = new persona();
                per.setId_persona(rs.getInt("id_persona"));
                per.setNombre_usuario(rs.getString("nombre_usuario"));
                per.setPrimer_nombre(rs.getString("primer_nombre"));
                per.setSegundo_nombre(rs.getString("segundo_nombre"));
                per.setPrimer_apellido(rs.getString("primer_apellido"));
                per.setSegundo_apellido(rs.getString("segundo_apellido"));
                per.setCedula(rs.getString("cedula"));

                String sexoStr = rs.getString("sexo");
                if (sexoStr != null) {
                    per.setSexo(persona.Sexo.valueOf(sexoStr));
                }

                per.setDireccion(rs.getString("direccion"));
                per.setTelefono(rs.getString("telefono"));
                per.setEmail(rs.getString("email"));

                String rolStr = rs.getString("tipo_rol");
                if (rolStr != null) {
                    per.setTipo_rol(persona.TipoRol.valueOf(rolStr));
                }
                
                per.setContrasena_hash(rs.getString("contrasena_hash"));
                lista.add(per);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
