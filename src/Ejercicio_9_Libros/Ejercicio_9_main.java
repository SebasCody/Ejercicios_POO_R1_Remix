/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_9_Libros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class Ejercicio_9_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Autor> listaAutores = new ArrayList<>();

        Autor unAutor = new Autor("Jorge Javier", "Vázquez", "Aledo");
        listaAutores.add(unAutor);
        Libro unLibro = new Libro("El Hobbiton", unAutor, 2020);
        listaLibros.add(unLibro);

        unAutor = new Autor("Alicia", "Cano", "Medina");
        listaAutores.add(unAutor);
        unLibro = new Libro("Mi vida es bella", unAutor, 2021);
        listaLibros.add(unLibro);

//        System.out.println(listaAutores.get(0).getNombreCita());
//        System.out.println(listaAutores.get(1).getNombreCita());
//        System.out.println(listaLibros.get(0).citaBibliograficaNoEstandar());
//        System.out.println(listaLibros.get(1).citaBibliograficaNoEstandar());
        boolean variableSalida = false;

        do {
            System.out.println(">>> ¿Qué quieres hacer hoy? <<<");
            System.out.println("1. Listar autores");
            System.out.println("2. Listar libros");
            System.out.println("3. Añadir autor");
            System.out.println("4. Añadir libro");
            System.out.println("5. Eliminar autor");
            System.out.println("6. Eliminar libro");
            System.out.println("7. Salir del programa");
            System.out.println("Elige una opción: ");
            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("LISTA AUTORES" + " [" + listaAutores.size() + "]");
                    System.out.println("===================");
                    for (Autor algunAutor : listaAutores) {
                        System.out.println(algunAutor.getNombreCita());
                    }
                    break;
                case 2:
                    System.out.println("LISTA LIBROS" + " [" + listaLibros.size() + "]");
                    System.out.println("===================");
                    for (Libro algunLibro : listaLibros) {
                        System.out.println(algunLibro.citaBibliograficaNoEstandar());
                    }
                    break;
                case 3:
                    System.out.println("Introducir nuevo autor".toUpperCase());
                    System.out.println("======================");
                    System.out.print("Nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.println("");

                    System.out.print("Apellido1: ");
                    String apellido1 = entrada.nextLine();
                    System.out.println("");

                    System.out.print("Apellido2: ");
                    String apellido2 = entrada.nextLine();
                    System.out.println("");

                    unAutor = new Autor(nombre, apellido1, apellido2);
                    listaAutores.add(unAutor);

                    break;
                case 4:
                    System.out.println("Introducir nuevo libro".toUpperCase());
                    System.out.println("======================");
                    System.out.print("Nombre: ");
                    String nombreLibro = entrada.nextLine();
                    System.out.println("");

                    boolean existeAutor = false;
                    Autor algunAutor = null;
                    do {
                        System.out.print("Apellido del autor: ");
                        String apellidoAutor = entrada.nextLine();
                        for (Autor autorcito : listaAutores) {
                            String name = autorcito.getApellido1();
                            if (apellidoAutor.equals(name)) {
                                algunAutor = autorcito;
                                existeAutor = true;
                                continue;
                            } else {
                                System.out.println("No existe dicho autor.");
                            }
                        }
                    } while (existeAutor == false);

                    System.out.println("Año de salida: ");
                    int yearSalida = Integer.parseInt(entrada.nextLine());
                    unLibro = new Libro(nombreLibro, algunAutor, yearSalida);
                    listaLibros.add(unLibro);
                    System.out.println("");

                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    variableSalida = true;
                    System.out.println("¡Hasta pronto! :D");
                    break;
                default:
                    System.out.println("Por favor, selecciona una opción válida. Gracias.");
            }
        } while (variableSalida == false);

    }

}
