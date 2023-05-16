/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01_bicicleta;

/**
 *
 * @author Sebas_work
 */
public class Main_bicicleta_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicicleta_remix miBicicleta = new Bicicleta_remix("Sebas");
        Bicicleta_remix tuBicicleta = new Bicicleta_remix("MariToni");
        
        //Pedalea dos veces con miBici y cambia al piñón 2. 
        miBicicleta.pedalear();
        miBicicleta.pedalear();
        miBicicleta.pedalear();
        miBicicleta.pedalear();
        
        miBicicleta.cambiarPiñon(2);
//        System.out.println("Velocidad de miBici tras pedalear 2 veces y cambiar al piñon 2: ");
        miBicicleta.cambiarPiñon(1);
        miBicicleta.pedalear();        
        miBicicleta.mostrarVelocidad();
        
        //Pedalea tres veces con tuBici y cambia al piñón 6. 
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPiñon(4);
//        System.out.println("Velocidad de tuBici tras pedalear 3 veces y cambiar al piñon 6: ");                
        tuBicicleta.mostrarVelocidad();
        
        //Pedalea tres veces con tuBici y cambia al piñón 5. 
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPiñon(5);
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        
//        System.out.println("Velocidad de tuBici tras pedalear 3 veces y cambiar al piñon 5: ");                
        tuBicicleta.mostrarVelocidad();
        System.out.println("La velocidad de la bici de "+tuBicicleta.getPropietario()+" es "+tuBicicleta.obtenerVelocidad());
        
        
        
        
    }
    
}
