/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02_cubo_agua;

/**
 *
 * @author Sebas_work
 */
public class Main_cubo_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        int longitudBase = 20;
//        int tamañoHuecoCubo = longitudBase - 2;
//        char huecoUnidad = ' ';
//        int capacidadMax = 10;
//        char baseUnidad = '#';
//
//        String hueco = "";
//        for (int i = 0; i < tamañoHuecoCubo; i++) {
//            hueco = hueco + huecoUnidad;
//        }
//
//        String pared = String.format("#%s#\n", hueco);
//        String paredes = "";
//        for (int i = 0; i < capacidadMax; i++) {
//            paredes = paredes + pared;
//
//        }
//        System.out.print(paredes);
//
//        String base = "";
//        for (int i = 0; i < longitudBase; i++) {
//
//            base = base + baseUnidad;
//        }
//        System.out.println(base);
        
        Cubo cubo1 = new Cubo(4);
        cubo1.pintarCubo(10);
        
        cubo1.rellenarCuboConLitros(3);
        cubo1.pintarCubo(10);
        
        
        
        
        
        
    }

}
