/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04_email;



/**
 *
 * @author Sebas_work
 */
public class Persona {
    
    private String nombre;
    private String email;
    public static int contadorPersonas = 0;
    
    //CONSTRUCTOR
    public Persona (String name, String mail){
        
        this.nombre = name;
        this.email = mail;      
        Persona.contadorPersonas++;
    }
    
    
    //DATOS A STRING
    public String DatosToCadena(){
        
        String linea = String.format("%10s - %-1s", this.nombre, this.email);
        return linea;
    }
    
    //IMPRIMIR DATOS
    public void ImprimirDatos(){
        System.out.println(DatosToCadena());
    }
    
    
    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    
    
}
