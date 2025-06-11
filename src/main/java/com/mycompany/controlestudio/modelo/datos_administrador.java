package com.mycompany.controlestudio.modelo;


public class datos_administrador {
   
private int id_administrador;
    private int id_persona;
    private NivelAcceso nivel_acceso;

    public enum NivelAcceso {
        Director, Coordinador
    }

    // Constructor vacío
    public datos_administrador() {}

    // Constructor con todos los atributos
    public datos_administrador(int id_administrador, int id_persona, NivelAcceso nivel_acceso) {
        this.id_administrador = id_administrador;
        this.id_persona = id_persona;
        this.nivel_acceso = nivel_acceso;
    }

    // Getters y Setters
    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public NivelAcceso getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(NivelAcceso nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    @Override
    public String toString() {
        return "datos_administrador{" +
                "id_administrador=" + id_administrador +
                ", id_persona=" + id_persona +
                ", nivel_acceso=" + nivel_acceso +
                '}';
    }
    
}
