package com.mycompany.controlestudio.servicio;

import com.mycompany.controlestudio.dao.personaDAO;
import com.mycompany.controlestudio.dao.notaDAO;
import com.mycompany.controlestudio.modelo.persona;
import com.mycompany.controlestudio.modelo.notas;
import java.util.List;

public class EstudianteService {
    private personaDAO personaDao;
    private notaDAO notaDao;
    
    public EstudianteService() {
        this.personaDao = new personaDAO();
        this.notaDao = new notaDAO();
    }

    // Ver notas del estudiante
    public List<notas> verMisNotas(int idEstudiante) {
        return notaDao.obtenerNotasPorEstudiante(idEstudiante);
    }

    // Actualizar información personal del estudiante (excepto rol y permisos)
    public void actualizarMiPerfil(persona estudianteActualizado) {
        personaDao.actualizarPersona(estudianteActualizado);
    }
}

