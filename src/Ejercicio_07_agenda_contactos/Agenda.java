/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_07_agenda_contactos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class Agenda {

    private ArrayList<Contacto> listaContactos;
    private int contadorID;

    //CONSTRUCTOR
    public Agenda() {

        this.listaContactos = new ArrayList();
        this.contadorID = 1;
    }

    public void addContacto(String nombre, String email, String telefono) {

        Contacto unContacto = new Contacto(contadorID, nombre, email, telefono);
        listaContactos.add(unContacto);
        this.contadorID++;
    }

    public void listarAgenda() {
        for (Contacto algunContacto : listaContactos) {
            System.out.println(algunContacto.aCadena());
        }

    }

    public void modificarContacto(int id) {

        Contacto contactoSeleccionado = null;

        for (Contacto unContacto : listaContactos) {
            if (unContacto.getId() == id) {
                contactoSeleccionado = unContacto;
            }
        }

        if (contactoSeleccionado != null) {

            modificarContacto(contactoSeleccionado);
        } else {
            System.out.println("ERROR: Contacto seleccionado no existente");
        }

    }

    public void modificarContacto(String nombre) {

        Contacto contactoSeleccionado = null;

        for (Contacto unContacto : listaContactos) {
            if (unContacto.getNombre().equals(nombre)) {
                contactoSeleccionado = unContacto;
            }
        }

        if (contactoSeleccionado != null) {

            modificarContacto(contactoSeleccionado);
        } else {
            System.out.println("ERROR: Contacto seleccionado no existente");
        }

    }

    private void modificarContacto(Contacto contactoElegido) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Qué deseas modificar del contacto?");
        System.out.println("1. Para modificar NOMBRE pulsa 1\n"
                + "2. Para modificar EMAIL pulsa 2\n"
                + "3. Para modificar TELÉFONO pulsa 3");

        int opcionElegida = Integer.parseInt(entrada.nextLine());

        switch (opcionElegida) {
            case 1:
                System.out.println("Nuevo nombre:");
                String newName = entrada.nextLine();
                contactoElegido.setNombre(newName);

                break;
            case 2:
                System.out.println("Introduce email:");
                String newEmail = entrada.nextLine();

                do {
                    System.out.println("Email introducido NO VÁLIDO. Introduce un email válido.");
                    newEmail = entrada.nextLine();

                } while (utilidades.Utilidades_remix.checkEmail(newEmail) == false);

                contactoElegido.setEmail(newEmail);
                break;

            case 3:
                System.out.println("Nuevo número de teléfono:");
                String newPhoneNumber = entrada.nextLine();
                contactoElegido.setTelefono(newPhoneNumber);
                break;
            default:
                System.out.println("ERROR: Opción no elegida. Introduce una opción válida.");
        }

    }
    
    
    public ArrayList<Contacto> buscarContacto(String expresion){
        
        ArrayList<Contacto> posibleContacto = new ArrayList<>();
        
        for (Contacto unContacto : listaContactos) {
            if (unContacto.getNombre().startsWith(expresion)) {
                posibleContacto.add(unContacto);
                
            }
        }
        
        for (int i = 0; i < posibleContacto.size(); i++) {
            
            if (i == posibleContacto.size() -1) {
                System.out.print(posibleContacto.get(i).getNombre());
                
            }
            else{
                System.out.print(posibleContacto.get(i).getNombre() + "/");
                
            }
        }
        
        return posibleContacto;
    }

//GETTER AND SETTER
    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public int getContadorID() {
        return contadorID;
    }

    public void setContadorID(int contadorID) {
        this.contadorID = contadorID;
    }

}
