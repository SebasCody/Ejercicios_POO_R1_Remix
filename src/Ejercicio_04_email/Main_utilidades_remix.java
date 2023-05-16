/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04_email;

import java.util.ArrayList;
import java.util.Scanner;
import utilidades.Utilidades_remix;

/**
 *
 * @author Sebas_work
 */
public class Main_utilidades_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Persona[] listaDePersonas = new Persona[10];
        String unEmail;
        String unNombre;
        
        
        for (int i = 0; i < listaDePersonas.length; i++) {
            System.out.println("Introduce un nombre:");
            unNombre = entrada.nextLine();
            
                
            do {
                
                System.out.println("Introduce un Email:");
                unEmail = entrada.nextLine();
                
                if (!Utilidades_remix.checkEmail(unEmail)) {
                    System.out.println("ERROR: INTRODUCE UN EMAIL VÁLIDO");
                    
                }
                    
            } while (Utilidades_remix.checkEmail(unEmail) == false);
            
            Persona unaPersona = new Persona(unNombre, unEmail);
            listaDePersonas[i] = unaPersona;
            System.out.println("#persona introducida correctamente");
        }
        
        System.out.println("=========================================");
        for (int i = 0; i < Persona.contadorPersonas; i++) {
            
            listaDePersonas[i].ImprimirDatos();
            
        }
        System.out.println("=========================================");
        
    }
}
        
        
        
        
        
        
//        ArrayList<Persona> listaPersonas = new ArrayList<>();

//        for (int k = 0; k<3; k++) {
//            boolean tieneArroba = false;
//            boolean tienePunto = false;
//            boolean puntoPosteriorArroba = false;
//            String ponerEmail;
//            String ponerNombre;
//            
//            boolean formatoEmailCorrecto = false;
//            do {
//
//                System.out.println("Dime el nombre:");
//                ponerNombre = entrada.nextLine();
//                //unaPersona.setNombre(ponerNombre);
//
//                do {
//
//                    System.out.println("Dime el email:");
//                    ponerEmail = entrada.nextLine();
//
//                    if (ponerEmail.contains("@")) {
//                        tieneArroba = true;
//                    } else {
//                        System.out.println("DEBES PONER ARROBA");
//                    }
//
//                    if (ponerEmail.contains(".")) {
//                        tienePunto = true;
//                    } else {
//                        System.out.println("DEBES PONER PUNTO");
//                    }
//
//                } while (tieneArroba == false && tienePunto == false);
//
//                for (int i = 0; i < ponerEmail.length(); i++) {
//
//                    int posicionArroba = -1;
//                    if (ponerEmail.charAt(i) == '@') {
//                        posicionArroba = i;
//                    }
//
//                    int posicionPunto = -1;
//                    if (ponerEmail.charAt(i) == '.') {
//                        posicionPunto = i;
//                    }
//
//                    try {
//
//                        if (posicionArroba > posicionPunto) {
//                            puntoPosteriorArroba = true;
//                        }
//
//                    } catch (Exception e) {
//                        System.out.println("ERROR: TE FALTA '@' y/o '.' ");
//                    }
//                }
//
//                if (tieneArroba && tienePunto && puntoPosteriorArroba) {
//                    formatoEmailCorrecto = true;
//
//                }
//            } while (formatoEmailCorrecto = false);
//            
//            //unaPersona.setEmail(ponerEmail);
//              Persona person = new Persona(ponerNombre, ponerEmail);
//              listaPersonas.add(person);
//              System.out.println("---------------------- añadida. "+Persona.contadorPersonas+" en la lista");
//        }
//        
//        System.out.println("====================================");
//        for (Persona listaPersona : listaPersonas) {
//            listaPersona.ImprimirDatos();
//            
//        }
//        System.out.println("====================================");
        
        
//    }
//
//}

