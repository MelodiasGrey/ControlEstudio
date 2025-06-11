package com.mycompany.controlestudio.modelo;

public class persona {
    
    private int id_persona;
    private String nombre_usuario;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String cedula;
    private Sexo sexo;
    private String direccion;
    private String telefono;
    private String email;
    private TipoRol tipo_rol;
    private String contrasena_hash;

    public enum Sexo {
        Masculino, Femenino
    }

    public enum TipoRol {
        Estudiante, Profesor, Administrador
    }

    // Constructor vacío
    public persona() {}

    // Constructor con todos los atributos
    public persona(int id_persona, String nombre_usuario, String primer_nombre, String segundo_nombre,
                   String primer_apellido, String segundo_apellido, String cedula, Sexo sexo,
                   String direccion, String telefono, String email, TipoRol tipo_rol, String contrasena_hash) {
        this.id_persona = id_persona;
        this.nombre_usuario = nombre_usuario;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipo_rol = tipo_rol;
        this.contrasena_hash = contrasena_hash;
    }

    // Getters y Setters
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoRol getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(TipoRol tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public String getContrasena_hash() {
        return contrasena_hash;
    }

    public void setContrasena_hash(String contrasena_hash) {
        this.contrasena_hash = contrasena_hash;
    }

    @Override
    public String toString() {
        return "persona{" +
                "id_persona=" + id_persona +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", sexo=" + sexo +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipo_rol=" + tipo_rol +
                ", contrasena_hash='" + contrasena_hash + '\'' +
                '}';
    }
}
