/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03_claseLibro;

/**
 *
 * @author Sebas_work
 */
public class Main_claseLibro_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro("El Imperio Final","B.Sanderson",2006);
        Libro libro2 = new Libro("El Pozo de la Ascensión","B.Sanderson",2007);
        Libro libro3 = new Libro("H767","El Héroe de las Eras","B.Sanderson",2008);
        
        libro1.setIsbn("H765");
        
        System.out.println(libro1.citaBibliografica());
        System.out.println(libro2.citaBibliografica());
        System.out.println(libro3.citaBibliografica());
        
        System.out.println(libro1.getIsbn());
        System.out.println(libro2.getIsbn());
        System.out.println(libro3.getIsbn());
        
        
        
        
    }
    
}
