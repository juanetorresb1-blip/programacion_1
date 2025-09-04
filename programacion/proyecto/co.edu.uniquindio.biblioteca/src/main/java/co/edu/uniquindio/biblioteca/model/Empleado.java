package co.edu.uniquindio.biblioteca.model;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String cargo;
    private String salario;
    private String edad;
    private String genero;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, String salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getEdad() { return edad;}
    public void setEdad(String edad) { this.edad = edad;}
    public String getGenero() { return genero;}
    public void setGenero(String genero) { this.genero = genero;}

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario='" + salario + '\'' +
                ", edad='" + edad + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

