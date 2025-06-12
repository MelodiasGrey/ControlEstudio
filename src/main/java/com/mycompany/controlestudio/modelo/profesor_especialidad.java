package com.mycompany.controlestudio.modelo;

public class profesor_especialidad {
    private int id_profesor_especialidad;
    private int id_profesor;
    private String nombre_especialidad;

    // Constructor vacío
    public profesor_especialidad() {}

    // Constructor con todos los atributos
    public profesor_especialidad(int id_profesor_especialidad, int id_profesor, String nombre_especialidad) {
        this.id_profesor_especialidad = id_profesor_especialidad;
        this.id_profesor = id_profesor;
        this.nombre_especialidad = nombre_especialidad;
    }

    // Getters y Setters
    public int getId_profesor_especialidad() {
        return id_profesor_especialidad;
    }

    public void setId_profesor_especialidad(int id_profesor_especialidad) {
        this.id_profesor_especialidad = id_profesor_especialidad;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }

    @Override
    public String toString() {
        return "ProfesorEspecialidad{" +
                "id_profesor_especialidad=" + id_profesor_especialidad +
                ", id_profesor=" + id_profesor +
                ", nombre_especialidad='" + nombre_especialidad + '\'' +
                '}';
    }
}

