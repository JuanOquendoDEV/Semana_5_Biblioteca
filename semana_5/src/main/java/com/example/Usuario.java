package com.example;

import java.util.ArrayList;

public class Usuario {

    String id;
    String nombre;
    String email;
    ArrayList<Prestamo> prestamos;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.prestamos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

  
    
    // metodo para agregar prestamos a la lista de prestamos del usuario

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add (prestamo);
    }

    // metodo para eliminar prestamos de la lista de prestamos del usuario

    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove (prestamo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
