package com.mycompany.controlestudio.modelo;
import java.math.BigDecimal;
import java.sql.Date;


public class notas {
    private int id_nota;
    private int id_estudiante;
    private int id_materia;
    private int id_año_escolar;
    private int id_inscripcion;
    private BigDecimal lapso1;
    private BigDecimal lapso2;
    private BigDecimal lapso3;
    private BigDecimal nota_final;
    private Date fecha_registro;
    private String observaciones;

    // Constructor vacío
    public notas() {}

    // Constructor con todos los atributos
    public notas(int id_nota, int id_estudiante, int id_materia, int id_año_escolar, int id_inscripcion,
                 BigDecimal lapso1, BigDecimal lapso2, BigDecimal lapso3, BigDecimal nota_final,
                 Date fecha_registro, String observaciones) {
        this.id_nota = id_nota;
        this.id_estudiante = id_estudiante;
        this.id_materia = id_materia;
        this.id_año_escolar = id_año_escolar;
        this.id_inscripcion = id_inscripcion;
        this.lapso1 = lapso1;
        this.lapso2 = lapso2;
        this.lapso3 = lapso3;
        this.nota_final = nota_final;
        this.fecha_registro = fecha_registro;
        this.observaciones = observaciones;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
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

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public BigDecimal getLapso1() {
        return lapso1;
    }

    public void setLapso1(BigDecimal lapso1) {
        this.lapso1 = lapso1;
    }

    public BigDecimal getLapso2() {
        return lapso2;
    }

    public void setLapso2(BigDecimal lapso2) {
        this.lapso2 = lapso2;
    }

    public BigDecimal getLapso3() {
        return lapso3;
    }

    public void setLapso3(BigDecimal lapso3) {
        this.lapso3 = lapso3;
    }

    public BigDecimal getNota_final() {
        return nota_final;
    }

    public void setNota_final(BigDecimal nota_final) {
        this.nota_final = nota_final;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "notas{" +
                "id_nota=" + id_nota +
                ", id_estudiante=" + id_estudiante +
                ", id_materia=" + id_materia +
                ", id_año_escolar=" + id_año_escolar +
                ", id_inscripcion=" + id_inscripcion +
                ", lapso1=" + lapso1 +
                ", lapso2=" + lapso2 +
                ", lapso3=" + lapso3 +
                ", nota_final=" + nota_final +
                ", fecha_registro=" + fecha_registro +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
