package com.example;

public class Libro {

String titulo;
String autor; 
String isbn;
String añoPublicacion; 
boolean disponible;

public Libro(String titulo, String autor, String isbn, String añoPublicacion, boolean disponible) {
 
    this.titulo = titulo;
    this.autor = autor; 
    this.isbn = isbn;
    this.añoPublicacion = añoPublicacion; 
    this.disponible = disponible;

    
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

 // metodo para marcar como prestado

 public void marcarComoPrestado(){
        this.disponible = false; 
 }

 // metodo para marcar como disponible 

 public void marcarComoDisponible(){
        this.disponible = true;
 }

     @Override 
        public String toString(){
            return "Libro(titulo: " + titulo + ", autor: " + autor + ", isbn: " + isbn + ", año de publicación: " + añoPublicacion + ", disponible: " + disponible + ")";
        }

}
