/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05_Casa;

import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class Casa {
    Scanner entrada = new Scanner (System.in);
    
    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    public static int contadorCasas = 0;
    private double precioVenta;
    
    //CONSTRUCTOR
    public Casa (String owner, int sup1, int sup2, double precio){
        
        this.propietario = owner;
        this.superficiePlanta1 = sup1;
        this.superficiePlanta2 = sup2;
        this.precioVenta = precio;
        Casa.contadorCasas++;
    }
    
    //CONSTRUCTOR 2
    public Casa (String owner, int sup1, double precio){
        
        this.propietario = owner;
        this.superficiePlanta1 = sup1;
        this.precioVenta = precio;
        Casa.contadorCasas++;
    }
    
    //CONSTRUCTOR 3
    public Casa (){
        
        System.out.print("Nuevo propietario: ");
        this.propietario = entrada.nextLine();
        
        System.out.print("Superficie Planta1: ");
        this.superficiePlanta1 = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Superficie Planta2: ");
        this.superficiePlanta2 = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Precio de venta:");
        this.precioVenta = Double.parseDouble(entrada.nextLine());
        Casa.contadorCasas++;
    }
    
    //SUPERFICIE TOTAL
    private int SuperficieTotal(){
        int superficieTotal = this.superficiePlanta1 + this.superficiePlanta2;
        return superficieTotal;
    }
    
    //IMPRIMIR DATOS
    public void imprimirDatos(){
        System.out.printf("Propietario: %s\n",this.propietario);
        System.out.printf("Superficie Total: %sm\n", SuperficieTotal());
        System.out.printf("Precio de venta: %s€\n", this.precioVenta);    
    }
    
    //GETTER AND SETTER

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiePlanta1() {
        return superficiePlanta1;
    }

    public void setSuperficiePlanta1(int superficiePlanta1) {
        this.superficiePlanta1 = superficiePlanta1;
    }

    public int getSuperficiePlanta2() {
        return superficiePlanta2;
    }

    public void setSuperficiePlanta2(int superficiePlanta2) {
        this.superficiePlanta2 = superficiePlanta2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
