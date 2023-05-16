/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_06_contactos;

/**
 *
 * @author Sebas_work
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contadorID = 0;
    
    public Contacto (String name, String mail, String tfno){
        
        Contacto.contadorID++;
        this.id = Contacto.contadorID;
        this.nombre = name;
        this.email = mail;
        this.telefono = tfno;
        
    }
    
    public void imprimirContacto(){
        
        System.out.printf("%-4d %10s %20s %10s\n",id,nombre,email,telefono);
//        System.out.println("Contacto:"+getId());
//        System.out.println("Nombre:"+getNombre());
//        System.out.println("Email:"+getEmail());
//        System.out.println("Telefono:"+getTelefono()+"\n");
     
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Contacto.contadorID = contadorID;
    }

    
    
    
    
    
    
}
