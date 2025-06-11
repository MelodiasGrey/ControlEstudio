package com.mycompany.controlestudio.modelo;
import java.sql.Date;

public class año_escolar {
    private int id_año_escolar;
    private String nombre_año;
    private Date fecha_inicio;
    private Date fecha_fin;

    // Constructor vacío
    public año_escolar() {}

    // Constructor con todos los atributos
    public año_escolar(int id_año_escolar, String nombre_año, Date fecha_inicio, Date fecha_fin) {
        this.id_año_escolar = id_año_escolar;
        this.nombre_año = nombre_año;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    // Getters y Setters
    public int getId_año_escolar() {
        return id_año_escolar;
    }

    public void setId_año_escolar(int id_año_escolar) {
        this.id_año_escolar = id_año_escolar;
    }

    public String getNombre_año() {
        return nombre_año;
    }

    public void setNombre_año(String nombre_año) {
        this.nombre_año = nombre_año;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "año_escolar{" +
                "id_año_escolar=" + id_año_escolar +
                ", nombre_año='" + nombre_año + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                '}';
    }
}
