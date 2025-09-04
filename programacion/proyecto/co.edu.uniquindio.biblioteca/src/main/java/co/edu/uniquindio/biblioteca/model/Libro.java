package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String nombre;
    private String genero;
    private String autor;
    private String editorial;
    private String isbn;

    public Libro() {
    }

    public Libro(String nombre, String genero, String autor, String editorial, String isbn) {
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}