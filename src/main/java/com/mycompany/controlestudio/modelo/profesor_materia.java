package com.mycompany.controlestudio.modelo;

public class profesor_materia {
    private int id_profesor_materia;
    private int id_profesor;
    private int id_materia;
    private int id_año_escolar;

    // Constructor vacío
    public profesor_materia() {}

    // Constructor con todos los atributos
    public profesor_materia(int id_profesor_materia, int id_profesor, int id_materia, int id_año_escolar) {
        this.id_profesor_materia = id_profesor_materia;
        this.id_profesor = id_profesor;
        this.id_materia = id_materia;
        this.id_año_escolar = id_año_escolar;
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

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_año_escolar() {
        return id_año_escolar;
    }

    public void setId_año_escolar(int id_año_escolar) {
        this.id_año_escolar = id_año_escolar;
    }

    @Override
    public String toString() {
        return "profesor_materia{" +
                "id_profesor_materia=" + id_profesor_materia +
                ", id_profesor=" + id_profesor +
                ", id_materia=" + id_materia +
                ", id_año_escolar=" + id_año_escolar +
                '}';
    }
}
