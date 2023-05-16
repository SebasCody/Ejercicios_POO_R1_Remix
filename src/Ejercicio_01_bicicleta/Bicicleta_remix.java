/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01_bicicleta;

/**
 *
 * @author Sebas_work
 */
public class Bicicleta_remix {
    
    private int revoluciones;
    private int piñonActual;
    private String propietario;
    
    //CONSTRUCTOR
    public Bicicleta_remix(String dueño){
        
        this.piñonActual = 3;
        this.revoluciones = 0;
        this.propietario = dueño;
        
    }
    
    
    //Metodos GET and SET
    //--------------------------------------------------------------------------
    
    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    //Metodos GET and SET
    //--------------------------------------------------------------------------
    
    //OTROS METODOS
    //PEDALEAR
    public void pedalear(){
        if (this.revoluciones == 0) {
            this.revoluciones = 1;
        }
        else{
            this.revoluciones = 2*this.revoluciones;
        }        
    }
    
    //FRENAR
    public void frenar (){
        
        if (this.revoluciones == 1) {
            this.revoluciones = 0; //No puedo dividir la velocidad de 1 entre 2 infinitamente
        }
        else{
            this.revoluciones = this.revoluciones / 2 ;
        }
    }
    
    //CAMBIO DE PIÑON
    public void cambiarPiñon (int piñon){
        
        if (piñon > 5 || piñon < 1) {
            System.out.println("ERROR: EL PIÑON INTRODUCIDO NO ES VÁLIDO");
        }
        else{
            this.piñonActual = piñon;
        }
    }
    
    //MOSTRAR VELOCIDAD
    public void mostrarVelocidad(){
        
        switch (this.piñonActual) {
            case 1:
                System.out.println("Velocidad actual de la bici de "+this.propietario+": "+this.revoluciones*2);
                break;
            case 2:
                System.out.printf("Velocidad actual de la bici de %s: %.2f\n",this.propietario,this.revoluciones*1.5);
                break;
            case 3:
                System.out.printf("Velocidad actual de la bici de %s: %.2f\n",this.propietario,this.revoluciones*1.0);                
                break;
            case 4:
                System.out.printf("Velocidad actual de la bici de %s: %.2f\n",this.propietario,this.revoluciones*0.5);
                break;
            case 5:
                System.out.printf("Velocidad actual de la bici de %s: %.2f\n",this.propietario,this.revoluciones*0.3);
                break;
        }
    }
    
    //OBTENER VELOCIDAD
    public double obtenerVelocidad(){
        double velocidad = 0;
        
        switch (this.piñonActual) {
            case 1:
                velocidad = this.revoluciones*2;
                break;
            case 2:
                velocidad = this.revoluciones*1.5;
                break;
            case 3:
                velocidad = this.revoluciones*1;
                break;
            case 4:
                velocidad = this.revoluciones*0.5;
                break;
            case 5:
                velocidad = this.revoluciones*0.3;
                break;
        }
        return velocidad;
    }
    
    
    
}
