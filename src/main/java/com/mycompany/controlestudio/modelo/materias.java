package com.mycompany.controlestudio.modelo;

public class materias {
    private int id_materia;
    private String nombre_materia;

    // Constructor vacío
    public materias() {}

    // Constructor con todos los atributos
    public materias(int id_materia, String nombre_materia) {
        this.id_materia = id_materia;
        this.nombre_materia = nombre_materia;
    }

    // Getters y Setters
    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    @Override
    public String toString() {
        return "materias{" +
                "id_materia=" + id_materia +
                ", nombre_materia='" + nombre_materia + '\'' +
                '}';
    }
}
