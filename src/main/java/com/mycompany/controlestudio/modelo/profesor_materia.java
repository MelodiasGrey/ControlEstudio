package com.mycompany.controlestudio.modelo;

public class profesor_materia {
    private int id_profesor_materia;
    private int id_profesor;
    private String nombre_materia;
    private int anio_escolar;

    // Constructor vacío
    public profesor_materia() {}

    // Constructor con todos los atributos
    public profesor_materia(int id_profesor_materia, int id_profesor, String nombre_materia, int anio_escolar) {
        this.id_profesor_materia = id_profesor_materia;
        this.id_profesor = id_profesor;
        this.nombre_materia = nombre_materia;
        this.anio_escolar = anio_escolar;
    }

    // Getters y Setters
    public int getId_profesor_materia() {
        return id_profesor_materia;
    }

    public void setId_profesor_materia(int id_profesor_materia) {
        this.id_profesor_materia = id_profesor_materia;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public int getAnio_escolar() {
        return anio_escolar;
    }

    public void setAnio_escolar(int anio_escolar) {
        this.anio_escolar = anio_escolar;
    }

    @Override
    public String toString() {
        return "ProfesorMateria{" +
                "id_profesor_materia=" + id_profesor_materia +
                ", id_profesor=" + id_profesor +
                ", nombre_materia='" + nombre_materia + '\'' +
                ", anio_escolar=" + anio_escolar +
                '}';
    }
}
