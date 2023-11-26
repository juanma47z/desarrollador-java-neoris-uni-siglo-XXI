
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  static ArrayList<Persona> datosPersona = new ArrayList<>();
  static ArrayList<Libros> listaLibros = new ArrayList<>();

  // Variable para almacenar el usuario actual
  static Persona usuarioActual;

  public static void main(String[] args) {

    //mostrar menu
    
    biblioteca();
    mostrarLibros();
    agregarLibro();
    eliminarLibro();
    mostrarLibros();
  }

  public static void registroUsuario() {
    Scanner read = new Scanner(System.in);

    String nombre;
    String apellido;
    String dni;
    String email;
    String telefono;
    String contrasena;

    System.out.print("Bienvenido al registro");

    System.out.print("Digite su nombre: ");
    nombre = read.next();

    System.out.print("Digite su apellido: ");
    apellido = read.next();

    System.out.print("Digite su dni: ");
    dni = read.next();

    System.out.print("Digite su email: ");
    email = read.next();

    System.out.print("Digite su telefono: ");
    telefono = read.next();

    System.out.print("Digite su contraseña: ");
    contrasena = read.next();

    Persona persona = new Persona(nombre, apellido, dni, email, telefono, contrasena);

    datosPersona.add(persona);

    // Almacena el usuario actual para usar en la función login
    usuarioActual = persona;

    System.out.println("Registro completado.");
  }

  public static void loginUsuario() {
    Scanner read = new Scanner(System.in);

    System.out.println("Iniciar sesión");

    System.out.print("Ingrese su dni: ");
    String dni = read.next();

    System.out.print("Ingrese su contraseña: ");
    String contrasena = read.next();

    // Verifica si el usuario actual coincide con las credenciales ingresadas
    if (usuarioActual != null && usuarioActual.getDni().equals(dni) && usuarioActual.getContrasena().equals(contrasena)) {
      System.out.println("Inicio de sesión exitoso.");
    } else {
      System.out.println("Credenciales incorrectas.");
    }
  }

  public static void biblioteca() {
    //Libros por defecto de la biblioteca
    listaLibros.add(new Libros("Ficciones", "Jorge Luis Borges", "Ficción"));
    listaLibros.add(new Libros("El túnel", "Ernesto Sabato", "Suspenso"));

  }

  public static void mostrarLibros() {

    System.out.println("Estos son los libros en la biblioteca");

    for (int i = 0; i < listaLibros.size(); i++) {
      Libros libro = listaLibros.get(i);
      System.out.println("Título: " + libro.getTitulo() + " Autor: " + libro.getAutor() + " Género: " + libro.getGenero());
    }
  }

  public static void agregarLibro() {

    Scanner read = new Scanner(System.in);
    String titulo;
    String autor;
    String genero;

    System.out.println("Agregar un libro.");

    //Agregar libro
    System.out.print("Ingrese el titulo del libro: ");
    titulo = read.next();

    System.out.print("Ingrese el autor del libro: ");
    autor = read.next();

    System.out.print("Ingrese el genero del libro: ");
    genero = read.next();

    Libros nuevoLibro = new Libros(titulo, autor, genero);
    listaLibros.add(nuevoLibro);

    System.out.println("Libro agregado con exito!");

    mostrarLibros();
  }

  public static void eliminarLibro() {
    Scanner read = new Scanner(System.in);

    String titulo;
    String autor;
    String genero;

    System.out.println("Desea eliminar un libro?");
    String decisionUsuario = read.next();
    //decisionUsuario.toUpperCase();

    while (decisionUsuario.equals("si")) {

      boolean encontrado = false;

      System.out.println("Eliminar libro por titulo, autor o genero");

      String opcion = read.next();
      opcion.toLowerCase();

      switch (opcion) {
        case "titulo":

          System.out.println("Digite el titulo del libro a borrar");
          titulo = read.next();

          for (Libros libro : listaLibros) {
            if (libro.getTitulo().equals(titulo)) {
              listaLibros.remove(libro);
              encontrado = true;
              System.out.println("Libro eliminado con éxito!");
              break; // Salir del bucle si se encuentra y elimina el libro
            }
          }
          if (!encontrado) {
            System.out.println("El libro con el titulo " + titulo + " no existe.");
            break;
          }
          break;
        case "autor":

          System.out.println("Digite el atuor del libro a borrar");
          autor = read.next();

          for (Libros libro : listaLibros) {
            if (libro.getTitulo().equals(autor)) {
              listaLibros.remove(libro);
              encontrado = true;
              System.out.println("Libro eliminado con éxito!");
              break; // Salir del bucle si se encuentra y elimina el libro
            }
          }
          if (!encontrado) {
            System.out.println("El libro del autor " + autor + " no existe.");
            break;
          }
          break;

        case "genero":

          System.out.println("Digite el genero del libro a borrar");
          genero = read.next();

          for (Libros libro : listaLibros) {
            if (libro.getTitulo().equals(genero)) {
              listaLibros.remove(libro);
              encontrado = true;
              System.out.println("Libro eliminado con éxito!");
              break; // Salir del bucle si se encuentra y elimina el libro
            }
          }
          if (!encontrado) {
            System.out.println("El libro del genero " + genero + " no existe.");
            break;
          }
          break;

        default:
          System.out.println("El dato no pertenece a la biblioteca");
      }

      System.out.println("Desea eliminar otro libro?");
      System.out.println("Digite Si o No");
      decisionUsuario = read.next();
    }

  }

  public static void alquilarLibro() {

  }

  public static void devolverLibro() {

  }

  public static void buscarLibro() {

  }
  
}
