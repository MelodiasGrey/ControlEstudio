package com.mycompany.controlestudio.servicio;

import com.mycompany.controlestudio.dao.personaDAO;
import com.mycompany.controlestudio.modelo.persona;

import com.mycompany.controlestudio.dao.especialidadDAO;
import com.mycompany.controlestudio.dao.profesorMateriaDAO;
import com.mycompany.controlestudio.modelo.especialidad;
import com.mycompany.controlestudio.modelo.profesor_materia;
import java.util.List;

public class AdminService {
    private personaDAO personaDao;

    public AdminService() {
        this.personaDao = new personaDAO();
        this.especialidadDAO = new especialidadDAO();
        this.profesorMateriaDAO = new profesorMateriaDAO();
    }

    // Crear un nuevo usuario (Admin)
    public void registrarUsuario(persona nuevoUsuario) {
        if (nuevoUsuario.getTipo_rol() == null) {
            throw new IllegalArgumentException("El usuario debe tener un rol asignado.");
        }
        personaDao.crearPersona(nuevoUsuario);
    }

    // Obtener todos los usuarios
    public List<persona> listarUsuarios() {
        return personaDao.obtenerListaPersonas();
    }

    // Actualizar información de un usuario
    public void actualizarUsuario(persona usuarioActualizado) {
        personaDao.actualizarPersona(usuarioActualizado);
    }

    // Eliminar usuario
    public void eliminarUsuario(String nombreUsuario) {
        personaDao.eliminarPersona(nombreUsuario);
    }
    private especialidadDAO especialidadDAO;
    private profesorMateriaDAO profesorMateriaDAO;

    // Crear una nueva especialidad
    public void agregarEspecialidad(String nombreEspecialidad) {
        especialidad especialidad = new especialidad(0, nombreEspecialidad);
        especialidadDAO.agregarEspecialidad(especialidad);
    }

    // Eliminar una especialidad
    public void eliminarEspecialidad(int idEspecialidad) {
        especialidadDAO.eliminarEspecialidad(idEspecialidad);
    }

    // Asignar una materia a un profesor
    public void asignarMateriaAProfesor(int idProfesor, String nombreMateria, int anioEscolar) {
        profesor_materia profesorMateria = new profesor_materia(0, idProfesor, nombreMateria, anioEscolar);
        profesorMateriaDAO.asignarMateriaAProfesor(profesorMateria);
    }

    // Obtener todas las especialidades
    public List<especialidad> obtenerEspecialidades() {
        return especialidadDAO.obtenerEspecialidades();
    }
}
