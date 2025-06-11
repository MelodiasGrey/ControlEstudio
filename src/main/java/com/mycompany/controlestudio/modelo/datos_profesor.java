package com.mycompany.controlestudio.modelo;


public class datos_profesor {
     private int id_profesor;
    private int id_persona;
    private Especialidad especialidad;

    public enum Especialidad {
        Matematica, Ingles, Lenguaje, Biologia, Ciencias_Sociales, Educacion_Fisica
    }

    // Constructor vacío
    public datos_profesor() {}

    // Constructor con todos los atributos
    public datos_profesor(int id_profesor, int id_persona, Especialidad especialidad) {
        this.id_profesor = id_profesor;
        this.id_persona = id_persona;
        this.especialidad = especialidad;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "datos_profesor{" +
                "id_profesor=" + id_profesor +
                ", id_persona=" + id_persona +
                ", especialidad=" + especialidad +
                '}';
    }
}
