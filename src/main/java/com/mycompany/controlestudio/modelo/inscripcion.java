package com.mycompany.controlestudio.modelo;
import java.sql.Date;

public class inscripcion {
    private int id_inscripcion;
    private int id_estudiante;
    private Date fecha_inscripcion;
    private int id_año_escolar;
    private String status;

    // Constructor vacío
    public inscripcion() {}

    // Constructor con todos los atributos
    public inscripcion(int id_inscripcion, int id_estudiante, Date fecha_inscripcion, int id_año_escolar, String status) {
        this.id_inscripcion = id_inscripcion;
        this.id_estudiante = id_estudiante;
        this.fecha_inscripcion = fecha_inscripcion;
        this.id_año_escolar = id_año_escolar;
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

    public int getId_año_escolar() {
        return id_año_escolar;
    }

    public void setId_año_escolar(int id_año_escolar) {
        this.id_año_escolar = id_año_escolar;
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
                ", id_año_escolar=" + id_año_escolar +
                ", status='" + status + '\'' +
                '}';
    }
}
