package com.mycompany.controlestudio.modelo;
import java.sql.Date;

public class inscripcion {
    private int id_inscripcion;
    private int id_estudiante;
    private Date fecha_inscripcion;
    private int id_anio_escolar; // 🔹 Corrección del nombre
    private String status;

    // Constructor vacío
    public inscripcion() {}

    // Constructor con todos los atributos
    public inscripcion(int id_inscripcion, int id_estudiante, Date fecha_inscripcion, int id_anio_escolar, String status) {
        this.id_inscripcion = id_inscripcion;
        this.id_estudiante = id_estudiante;
        this.fecha_inscripcion = fecha_inscripcion;
        this.id_anio_escolar = id_anio_escolar; // 🔹 Corrección del nombre
        this.status = status;
    }

    // Getters y Setters
    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public int getId_anio_escolar() { // 🔹 Corrección del nombre
        return id_anio_escolar;
    }

    public void setId_anio_escolar(int id_anio_escolar) { // 🔹 Corrección del nombre
        this.id_anio_escolar = id_anio_escolar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "inscripcion{" +
                "id_inscripcion=" + id_inscripcion +
                ", id_estudiante=" + id_estudiante +
                ", fecha_inscripcion=" + fecha_inscripcion +
                ", id_anio_escolar=" + id_anio_escolar + // 🔹 Corrección en `toString()`
                ", status='" + status + '\'' +
                '}';
    }
}

