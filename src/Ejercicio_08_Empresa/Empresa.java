/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_08_Empresa;

/**
 *
 * @author Sebas_work
 */
public class Empresa {
    
    private String CIF;
    private String nombre;
    private String localidad;
    
    //CONSTRUCTOR
    public Empresa(String CIF, String nombre, String localidad) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.localidad = localidad;
    }
    
    //METODO IMPRIMIR
    public void imprimirDatos(){
        
        System.out.println("*".repeat(20) + "DATOS" + "*".repeat(20));
        System.out.printf("%-15s %-15s %-15s", "CIF", "Nombre", "Localidad");
        System.out.println("");
        System.out.printf("\033[31m%-15s\033[35m %-15s %-15s", this.CIF, this.nombre, this.localidad);
        System.out.println("");
    }
    
    
    //GETTER AND SETTER
    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    
    
}
