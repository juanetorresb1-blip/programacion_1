package co.edu.uniquindio.biblioteca.model;

public class Cliente {

    private String nombre;
    private String documento;
    private String telefono;
    private String email;
    private String edad;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, String telefono, String email, String edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getDocumento() {

        return documento;
    }

    public void setDocumento(String documento) {

        this.documento = documento;
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


    public String getEdad() {

        return edad;
    }

    public void setEdad(String edad) {

        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }


}
