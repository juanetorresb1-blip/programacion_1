package co.edu.uniquindio.biblioteca.model;
import java.util.ArrayList;

public class Biblioteca {

    private String nombre;

    private final ArrayList<Cliente> listaClientes = new ArrayList();
    private final ArrayList<Empleado> listaEmpleados = new ArrayList();
    private final ArrayList<Libro> listaLibros = new ArrayList();

    public Biblioteca(String nombre) {

        this.nombre = nombre;

    }
    public String getNombre() {

        return this.nombre;
    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}


