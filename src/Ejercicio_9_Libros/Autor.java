/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9_Libros;

/**
 *
 * @author Sebas_work
 */
public class Autor {
    
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    
    //CONSTRUCTOR
    public Autor(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        
    }
    
    public String getNombreCita(){        
        String inicial1 = "" + this.nombre.charAt(0);
        String inicial2;
        if (this.nombre.contains(" ")) {
            int posicionEspacio = this.nombre.indexOf(" ");
            String nombreSegundo = this.nombre.substring(posicionEspacio +1);
            inicial2 = "" + nombreSegundo.charAt(0);
            String referenciaAutor = String.format("%s, %s. %s.", this.apellido1, inicial1, inicial2);
            return referenciaAutor;
        }else{
            String referenciaAutor = String.format("%s, %s.", this.apellido1, inicial1);
            return referenciaAutor;
            
        }
    }
    
    
    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
