package com.mycompany.controlestudio.servicio;

import com.mycompany.controlestudio.dao.profesorEspecialidadDAO;
import com.mycompany.controlestudio.dao.profesorMateriaDAO;
import com.mycompany.controlestudio.modelo.profesor_especialidad;
import com.mycompany.controlestudio.modelo.profesor_materia;
import java.util.List;

public class ProfesorService {
    private profesorEspecialidadDAO profesorEspecialidadDAO;
    private profesorMateriaDAO profesorMateriaDAO;

    public ProfesorService() {
        this.profesorEspecialidadDAO = new profesorEspecialidadDAO();
        this.profesorMateriaDAO = new profesorMateriaDAO();
    }

    // Asignar especialidad al profesor
    public void asignarEspecialidad(int idProfesor, String nombreEspecialidad) {
        profesor_especialidad especialidad = new profesor_especialidad(0, idProfesor, nombreEspecialidad);
        profesorEspecialidadDAO.asignarEspecialidadAProfesor(especialidad);
    }

    // Obtener materias de un profesor
    public List<profesor_materia> obtenerMateriasPorProfesor(int idProfesor) {
        return profesorMateriaDAO.obtenerMateriasPorProfesor(idProfesor);
    }

    // Verificar si el profesor puede calificar en una materia
    public boolean profesorPuedeCalificar(int idProfesor, String nombreMateria) {
        List<profesor_materia> materias = obtenerMateriasPorProfesor(idProfesor);
        for (profesor_materia materia : materias) {
            if (materia.getNombre_materia().equalsIgnoreCase(nombreMateria)) {
                return true;
            }
        }
        return false;
    }
}

