package com.mycompany.controlestudio.modelo;
import java.sql.Date;

public class anio_escolar {
    private int id_anio_escolar;
    private String nombre_anio;
    private Date fecha_inicio;
    private Date fecha_fin;

    // Constructor vacío
    public anio_escolar() {}

    // Constructor con todos los atributos
    public anio_escolar(int id_anio_escolar, String nombre_anio, Date fecha_inicio, Date fecha_fin) {
        this.id_anio_escolar = id_anio_escolar;
        this.nombre_anio = nombre_anio;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    // Getters y Setters
    public int getId_anio_escolar() {
        return id_anio_escolar;
    }

    public void setId_anio_escolar(int id_anio_escolar) {
        this.id_anio_escolar = id_anio_escolar;
    }

    public String getNombre_anio() {
        return nombre_anio;
    }

    public void setNombre_anio(String nombre_anio) {
        this.nombre_anio = nombre_anio;
    }

    public Date getFecha_inicio() { // ✅ Agregado
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) { // ✅ Agregado
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() { // ✅ Agregado
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) { // ✅ Agregado
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "anio_escolar{" +
                "id_anio_escolar=" + id_anio_escolar +
                ", nombre_anio='" + nombre_anio + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                '}';
    }
}


