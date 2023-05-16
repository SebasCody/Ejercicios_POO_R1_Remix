/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02_cubo_agua;

import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class Cubo {
    
    private final int capacidadMax;
    private int contenido;
    
    //CONSTRUCTOR
    public Cubo(int capacidadMaxima){
        this.capacidadMax = capacidadMaxima;
        this.contenido = 0;
    }
    
    //METODOS GET AND SET
    //--------------------------------------------------------------------------

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    //--------------------------------------------------------------------------
    
    //METODO PARA LLENAR EL CUBO
    public void llenarCuboAlMax(){
        this.contenido = this.capacidadMax;
    }
    
    //METODO PARA VACIAR EL CUBO
    public void vaciarCubo(){
        if (this.contenido > 0) {
            System.out.println("EL CUBO YA ESTÁ VACÍO. NO HACE FALTA VACIARLO");
        }
        else{
            this.contenido = 0;
        }
    }
    
    //METODO PARA RELLENAR EL CUBO CON LOS LITROS QUE DESEAMOS
    public void rellenarCuboConLitros(int rellenoLitros){
        
        if ( (this.contenido + rellenoLitros) > this.capacidadMax) {
            System.out.printf("NO SE PUEDE RELLENAR CON %d LITROS, EL AGUA SE DESBORDA",rellenoLitros);
        }
        else{
            this.contenido = this.contenido + rellenoLitros;
        }
    }
    
    //METODO PARA PINTAR EL CUBO
    public void pintarCubo(int longitudBase){
        
        int longitudHuecoCubo = longitudBase - 2;
        
        
        char huecoCuboUnidad = ' ';
        String huecoCubo = "";
        for (int i = 0; i < longitudHuecoCubo; i++) {
            huecoCubo = huecoCubo + huecoCuboUnidad;
        }
        
        
        
        char rellenoUnidad = '~';
        String relleno = "";
        for (int i = 0; i < longitudHuecoCubo; i++) {
            relleno = relleno + rellenoUnidad;
        }
        
        
        String lineaPared = String.format("#%s#",huecoCubo);
        String lineaRelleno = String.format("#%s#",relleno);
        
//        for (int i = this.capacidadMax; i > 0; i--) {
//            
//            if (i <= this.contenido) {
//                System.out.println(lineaRelleno);
//            }
//            else{
//                System.out.println(lineaPared);
//            }
//            
//        }
        
        
            
            if (this.contenido == 0) {
                for (int i = 0; i < this.capacidadMax; i++) {
                    System.out.println(lineaPared);
                    
                }
           }
            
            
            if(this.contenido > 0){
                
                if (this.contenido == this.capacidadMax) {
                    for (int i = 0; i < this.contenido; i++) {
                    System.out.println(lineaRelleno);
                    }
                }
                else{
                    for (int i = this.capacidadMax; i > 0; i--) {
                        if (i > this.contenido) {
                            System.out.println(lineaPared);
                            
                        }else{
                            System.out.println(lineaRelleno);
                        }
                    }
                    
                }
                
                
            }
            
        
        char baseUnidad = '#';
        String base = "";
        for (int i = 0; i < longitudBase; i++) {
            base = base + baseUnidad;
        }
        System.out.println(base+"\n");
        
        
        
    }
    
    
}
