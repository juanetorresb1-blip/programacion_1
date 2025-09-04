package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Cliente;
import co.edu.uniquindio.biblioteca.model.Empleado;
import co.edu.uniquindio.biblioteca.model.Libro;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Biblioteca biblioteca = inicializarDatos();
        int opcion = 0;


        do {
            mostrarMenu();
            opcion = leerInt("Ingrese la opción del menú: ");
            switch (opcion) {
                case 1:

                    String resultadoCliente = crearCliente(biblioteca);
                    System.out.println(" Se creó el cliente: " + resultadoCliente );
                    break;

                case 2:
                    for (int i = 0; i < biblioteca.getListaClientes().size(); i++) {
                        System.out.println(biblioteca.getListaClientes().get(i));
                    }

                case 3:
                    String resultadoEmpleado =crearEmpleado(biblioteca);
                    System.out.println("Se creó el  empleado: " + resultadoEmpleado);

                    break;

                case 4:
                    String resultadoLibro =crearLibro(biblioteca);
                    System.out.println("Se creó el libro: " + resultadoLibro);
                    break;
                case 5:
                    System.out.println(validarEdadCliente(biblioteca));
                    break;
                case 6:
                    System.out.println(validarLibroBiblioteca(biblioteca));
                    break;
                case 7:
                    System.out.println(" Saliendo del sistema ");
                    break;
                default:
                    System.out.println(" Esta opción no es valida ");
                    break;
            }
        } while (opcion != 7);
    }



    public static void mostrarMenu() {
        System.out.println("\n MENÚ DE BIBLIOTECA ");
        System.out.println("1. Crear Cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Crear Empleado");
        System.out.println("4. Crear Libro");
        System.out.println("5. Validar edad");
        System.out.println("6. Validar libro");
        System.out.println("7. Salir");
    }

    public static String validarEdadCliente(Biblioteca biblioteca) {
        String mensaje = "";
        String documento = leerStringConsola("Ingrese el documento: ");
        String edad = leerStringConsola("Ingrese la edad: ");
        if (documento != null) {
            for (Cliente c: biblioteca.getListaClientes()) {
                if (c.getDocumento().equals(documento)) {
                    if(c.getEdad().equals(edad)) {
                        mensaje = "La edad ingresada si coincide con la del usuario";

                    }else{
                        mensaje = "La edad no coincide con la del usuario";

                    }
                }else{
                    mensaje = "el documento ingresado no existe";

                }
            }
        }else{
            mensaje = "Ingrese un documento";
        }
        return mensaje;
    }


    public static  String validarLibroBiblioteca(Biblioteca biblioteca){
        String mensaje = "";
        String nombreLibro = leerStringConsola("Ingrese el nombre del libro: ");

        if (nombreLibro != null) {
            for(Libro l: biblioteca.getListaLibros()){
                if (l.getNombre().equals(nombreLibro)) {
                    mensaje=" El libro escogido si existe dentro de la biblioteca";
                } else{
                    mensaje= "El libro escogido no existe dentro de la biblioteca";
                }
            }
        }
        return mensaje;
    }
    /*public static String validarEdadCliente(String documento, String edad) {
        Cliente cliente;
        String mensaje = "No hay ningun usuario con ese documento"; // valor por defecto

        for (int i = 0; i < biblioteca.getListaClientes().size(); i++) {
            cliente = biblioteca.getListaClientes().get(i);

            if (cliente.getDocumento().equals(documento)) {
                System.out.println("Se validó el cliente: " + cliente.getNombre());

                if (cliente.getEdad().equals(edad)) {
                    mensaje = "La edad es correcta";
                } else {
                    mensaje = "La edad no coincide";
                }
                break; // ya encontraste al cliente, no sigas buscando
            }
        }
        return mensaje;
    }*/

    /*public static String validarNombreLibro(){

    }*/


   /* public static Cliente obtenerCliente(Biblioteca biblioteca) {
        System.out.println("Ingrese el documento del cliente que busca:");
        //String idCliente = leerString();
        Cliente clienteEncontrado = null;
        for (Cliente c : biblioteca.getListaClientes()) {
            if (c.getDocumento().equals(idCliente)) {
                clienteEncontrado = c;
                break;
            }
        }
        return clienteEncontrado;
    }*/

    private static Biblioteca inicializarDatos() {
        Biblioteca biblioteca = new Biblioteca("CRAI");
        Cliente cliente = new Cliente("Juan", "1094", "87676768", "user@example.com", "15");
        cliente.setEdad("30");
        cliente.setEmail("juan@email.com");
        Libro libro = new Libro("Orgullo y prejuicio", "romantico", "Jane Kingston", "Editorial", "2323");
        biblioteca.getListaClientes().add(cliente);
        biblioteca.getListaLibros().add(libro);
        return biblioteca;
    }

    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }


    //Metodo para leer los enteros
    public static int leerInt(String mensaje) {
        System.out.print(mensaje);
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    //Metodo para leer los decimales
    public static double leerDouble() {
        double num = sc.nextDouble();
        sc.nextLine();
        return num;
    }

    // Métodos para la creacion de clientes, biblioteca, empleado, libro
    public static String crearCliente(Biblioteca biblioteca) {
        //1.Capturar los datos del cliente
        String nombre = leerStringConsola("Ingrese el nombre del cliente");
        String id = leerStringConsola("Ingrese el Id de cliente");
        String telefono = leerStringConsola("Ingrese el telefono de cliente");
        //2. Crear la instancia del cliente
        Cliente cliente = new Cliente();
        //3. Agregar los datos capturados al cliente
        cliente.setNombre(nombre);
        cliente.setDocumento(id);
        cliente.setTelefono(telefono);
        biblioteca.getListaClientes().add(cliente);
        //4. retornar respuesta
        return cliente.toString();
    }

    public static Biblioteca crearBiblioteca(String nombre) {
        return new Biblioteca(nombre);
    }

    public static String crearEmpleado(Biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del Empleado");
        String cargo  = leerStringConsola("Ingrese el cargo del Empleado");
        String salario = leerStringConsola("Ingrese el salario del Empleado");
        String edad = leerStringConsola("Ingrese el edad del Empleado");
        String genero = leerStringConsola("Ingrese el genero del Empleado");

        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setCargo(cargo);
        empleado.setSalario(salario);
        empleado.setEdad(edad);
        empleado.setGenero(genero);

        biblioteca.getListaEmpleados().add(empleado);
        return empleado.toString();

    }

    public static String crearLibro(Biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del Libro");
        String genero  = leerStringConsola("Ingrese el  genero del Libro");
        String autor = leerStringConsola("Ingrese el autor del libro");
        String editorial = leerStringConsola("Ingrese la editorial del libro");
        String isbn = leerStringConsola("Ingrese el isbn del libro");

        Libro libro = new Libro();
        libro.setNombre(nombre);
        libro.setGenero(genero);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setIsbn(genero);

        biblioteca.getListaLibros().add(libro);
        return libro.toString();

    }

    public static Libro crearLibro(String nombre, String genero, String autor, String editorial, String isbn) {
        return new Libro(nombre, genero, autor, editorial, isbn );
    }
}