package com.mycompany.controlestudio.servicio;

import com.mycompany.controlestudio.dao.personaDAO;
import com.mycompany.controlestudio.modelo.persona;
import com.mycompany.controlestudio.util.PasswordUtil;

public class AutenticationService {
    private personaDAO personaDao;

    public AutenticationService() {
        personaDao = new personaDAO();
    }

    public persona autenticar (String nombreUsuario, String contrasena) {
        try {
            persona p = personaDao.obtenerPersonaPorNombreUsuario(nombreUsuario);
            if (p != null && PasswordUtil.verificarContrasena(contrasena, p.getContrasena_hash())) {
                return p; // autenticación exitosa
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // autenticación fallida
    }
}