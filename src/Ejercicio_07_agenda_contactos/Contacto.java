/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_07_agenda_contactos;

/**
 *
 * @author Sebas_work
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    
    
//CONSTRUCTOR
    public Contacto (int identificador, String name, String correo, String tfno){
        
        this.id = identificador;
        this.nombre = name;
        this.email = correo;
        this.telefono = tfno;
        
        
    }
    
//METODO DEVOLVER CADENA
    public String aCadena (){
        String devolverCadena = String.format("ID:%-10d nombre:%10s email:%10s telefono:%10s", id, nombre, email, telefono);
        return devolverCadena;
    }
    


//GETTER AND SETTER
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
    
    
    
    
}
