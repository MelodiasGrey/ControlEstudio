package com.mycompany.controlestudio.modelo;


public class datos_representante {
    private int id_representante;
    private int id_persona;
    private Parentesco parentesco;

    public enum Parentesco {
        Madre, Padre, Tutor_Legal
    }

    // Constructor vacío
    public datos_representante() {}

    // Constructor con todos los atributos
    public datos_representante(int id_representante, int id_persona, Parentesco parentesco) {
        this.id_representante = id_representante;
        this.id_persona = id_persona;
        this.parentesco = parentesco;
    }

    public int getId_representante() {
        return id_representante;
    }

    public void setId_representante(int id_representante) {
        this.id_representante = id_representante;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "datos_representante{" +
                "id_representante=" + id_representante +
                ", id_persona=" + id_persona +
                ", parentesco=" + parentesco +
                '}';
    }
}
