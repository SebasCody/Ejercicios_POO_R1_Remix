/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author Sebas_work
 */
public class Utilidades_remix {
    
    
    
    public static boolean checkEmail(String email){
        
        boolean tieneArroba;
        if (email.contains("@") && 
            email.contains(".") && 
            email.indexOf("@") < email.indexOf(".") ) {
            
            return true;
        }
        
        else{
            return false;
        }
        
    }
    
    
    
    public static String generadorCodigoAleatorio(){
        
        String letras = "abcdefghijklmnopqrstuvwxyz";
        
        int posicionLetra1 = (int)(Math.random()*10+1);
        int posicionLetra2 = (int)(Math.random()*10+1);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int num3 = (int) (Math.random()*10);
        
        String letra1 = ("" + letras.charAt(posicionLetra1)).toUpperCase();
        String letra2 = ("" + letras.charAt(posicionLetra2)).toUpperCase();
        String numeroString1 = String.valueOf(num1);
        String numeroString2 = String.valueOf(num2);
        String numeroString3 = String.valueOf(num3);
        
        String codigo = letra1 + letra2 + numeroString1 + numeroString2 + numeroString3;
        return codigo;
        
        
        
    }
    
}
