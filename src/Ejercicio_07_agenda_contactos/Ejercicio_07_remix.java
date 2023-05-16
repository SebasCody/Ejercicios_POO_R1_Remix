/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_07_agenda_contactos;

import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class Ejercicio_07_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Agenda miAgenda = new Agenda();
        
        System.out.println("Agenda de contactos");
        System.out.println("********************");
        System.out.println("1. Añadir\n"
                         + "2. Lista Completa\n"
                         + "3. Modificar\n"
                         + "4. Buscar\n"
                         + "5. Salir\n");
        
        
        boolean salirPrograma = false;
        
        do{
             System.out.print("Elige una opcion: ");
             int opcionElegida = Integer.parseInt(entrada.nextLine());
        
            switch (opcionElegida) {
                case 1:
                    System.out.print("Escribe el nombre del contacto: ");
                    String nameContacto = entrada.nextLine();
                    System.out.print("Escribe el correo electrónico del contacto: ");
                    String email = entrada.nextLine();
                    System.out.print("Escribe el teléfono del contacto: ");
                    String telefono = entrada.nextLine();
                    miAgenda.addContacto(nameContacto, email, telefono);

                    break;

                case 2:
                    miAgenda.listarAgenda();
                    break;

                case 3:
                    System.out.println("¿Qué contacto quieres modificar? \nIntroduce (1) para NOMBRE o (2) para ID");
                    int opcion = Integer.parseInt(entrada.nextLine());

                    if (opcion == 2) {
                        int ID = Integer.parseInt(entrada.nextLine());
                        miAgenda.modificarContacto(ID);
                    }else{
                        String nombre = entrada.nextLine();
                        miAgenda.modificarContacto(nombre);
                    }
                    break;
                case 4:
                    System.out.println("Introduce un conjunto de caracteres para buscar un contacto");
                    String conjuntoCaracteres = entrada.nextLine();
                    miAgenda.buscarContacto(conjuntoCaracteres);
                    break;
                    
                case 5:
                    salirPrograma = true;
                default:
                    System.out.println("ERROR: No has puesto una opcion válida.");
            }
        }while( salirPrograma == false);
        
        
    }
    
}
