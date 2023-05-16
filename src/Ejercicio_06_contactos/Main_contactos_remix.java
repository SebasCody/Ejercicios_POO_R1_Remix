/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_06_contactos;

import java.util.Scanner;
import utilidades.Utilidades_remix;

/**
 *
 * @author Sebas_work
 */
public class Main_contactos_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Contacto[] listaContactos = new Contacto[100];
        
        Contacto sebasContacto = new Contacto ("Sebastian", "sebas@gmail.com", "606060606");
        Contacto mariContacto = new Contacto ("Maria Antonia", "maritoni@gmail.com", "696969696");
        Contacto julianContacto = new Contacto ("Julian", "mvp@gmail.com", "654321234");
        Contacto brandonContacto = new Contacto ("Brandon", "sanderson@gmail.com", "616171819");
        
        listaContactos[0] = sebasContacto;
        listaContactos[1] = mariContacto;
        listaContactos[2] = julianContacto;
        listaContactos[3] = brandonContacto;
        
        System.out.println("==============================");
        System.out.println("          CONTACTOS           ");
        System.out.println("==============================");
        System.out.println("1. NUEVO CONTACTO");
        System.out.println("2. LISTAR CONTACTOS");
        System.out.println("3. MODIFICAR CONTACTO");
        System.out.println("4. SALIR DEL MENÚ");
        
        
        
        boolean salir = false;
        do {
            System.out.println("Elige una opción: "); int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    añadirContacto(listaContactos);
                    break;
                    
                case 2:
                    imprimirListaContactos(listaContactos);
                    break;
                case 3:
                    modificarContacto(listaContactos);
                    break;
                case 4:
                    System.out.println("***Saliendo del programa***");
                    salir = true;
                    break;
                    
                default:
                    throw new AssertionError();
            }
            
        } while (salir == false);
        
    }
    
    private static void añadirContacto(Contacto[] listaContactos){
        Scanner entrada = new Scanner(System.in);
        String email, nombre, tlf;
        
        System.out.println("Introduce el nombre: ");
        nombre = entrada.nextLine();
        
        do {
            System.out.println("Introduce el email: ");
            email = entrada.nextLine();
            
            if (Utilidades_remix.checkEmail(email) == false) {
                System.out.println("EMAIL ERRÓNEO. INTRODUCE UN EMAIL VÁLIDO");
                
            }
            
            
        } while (Utilidades_remix.checkEmail(email) == false);
        
        System.out.println("Introduce el número de teléfono: ");
        tlf = entrada.nextLine();
        
        
        listaContactos[Contacto.getContadorID()] = new Contacto (nombre, email, tlf);
        
    }
    
    private static void imprimirListaContactos(Contacto[] listaContactos){
        
        System.out.println("========== LISTA DE CONTACTOS ==========");
        
        System.out.println("ID     NOMBRE     EMAIL     TELEFONO");
        for (int i = 0; i < Contacto.getContadorID(); i++) {
            listaContactos[i].imprimirContacto();
        }
    }
    
    private static void modificarContacto (Contacto[] listaContactos){
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < Contacto.getContadorID(); i++) {
            System.out.printf("ID: %d    NOMBRE: %s\n", listaContactos[i].getId(), listaContactos[i].getNombre());
            
        }
        
        System.out.println("Introduce el ID del contacto que quieres modificar:");
        int id = Integer.parseInt(entrada.nextLine());
        System.out.println("¿Qué campo deseas modificar?\n A)NOMBRE\n B)EMAIL\n C)TELEFONO");
        System.out.print("Escribe A, B o C:");
        String campo = entrada.nextLine().toUpperCase();
        System.out.println("");
        
        switch (campo) {
            case "A":
                System.out.print("Nuevo nombre:");
                String name = entrada.nextLine();
                listaContactos[id -1].setNombre(name);
                
                break;
                
            case "B":
                System.out.println("Nuevo email:");
                String email = entrada.nextLine();
                listaContactos[id -1].setEmail(email);
                break;
                
            case "C":
                System.out.println("Nuevo telefono:");
                String telefono = entrada.nextLine();
                listaContactos[id -1].setTelefono(telefono);
                break;
                
            default:
                throw new AssertionError();
        }
        
    }
}
