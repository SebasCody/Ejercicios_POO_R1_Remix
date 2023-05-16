/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03_claseLibro;

/**
 *
 * @author Sebas_work
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    
    //CONSTRUCTOR---------------------------------------------------------------
    public Libro (String isbN, String title, String escritor, int year){
        
        //Compruebo el booleano
        if (this.checkISBN(isbN)) {
            isbN = isbN.toUpperCase(); //lo paso a mayúsculas
            this.isbn = isbN;
        }
        else{
            System.out.println("ERROR: ISBN incorrecto");
        }
        
        //this.isbn = isbN;
        this.titulo = title;
        this.autor = escritor;
        this.año = year;
    }
    
    //CONSTRUCTOR 2 POR SI NO DISPONEMOS DEL ISBN
    
    public Libro(String title, String escritor, int year){
        this.isbn = null;
        this.titulo = title;
        this.autor = escritor;
        this.año = year;
    }
    
    //METODOS GET AND SET
    //--------------------------------------------------------------------------

    public String getIsbn() {
        String isbnNulo;
        if (this.isbn == null) {
            isbnNulo = String.format("***[%s] no tiene ISBN***",this.titulo);
            return isbnNulo;
        }
        else{
            isbn = String.format("***ISBN de [%s]: [%s]***",this.titulo,this.isbn);
            
        }
            return isbn;
        
    }

    public void setIsbn(String isbn) {
        
        if (this.checkISBN(isbn)) {
            isbn = isbn.toUpperCase(); //lo paso a mayúsculas
            this.isbn = isbn;
        }
        else{
            System.out.println("ERROR: ISBN incorrecto");
            
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //METODOS GET AND SET
    //--------------------------------------------------------------------------
    
    
    //METODO PARA OBTENER LA CITA BIBLIOGRÁFICA EN FORMATO APA------------------
    public String citaBibliografica(){
        
       String cita = String.format("%s, (%d), \033[32m%s\033[30m",this.autor,this.año,this.titulo);
       
       
       return cita;
    }
    //--------------------------------------------------------------------------
    
    
    //METODO PARA COMPROBAR QUE EL ISBN INTRODUCIDO TENGA UN FORMATO VÁLIDO
    
    private boolean checkISBN(String isbn) {
        
        isbn = isbn.toUpperCase(); //paso a mayusculas
        
        boolean isbnCorrecto = true;
        
        //Comprobación 1: La LONGITUD
        if (isbn.length() > 4) {
            isbnCorrecto = false;
        }
        
        //Comprobación 2: Que el primer caracter sea una letra entre la A y la Z
        char letra = isbn.charAt(0);
        if (letra < 'A' || letra > 'Z') {
            isbnCorrecto = false;
        }
        
        //Comprobación  3, 4 y 5: Que los siguientes caracteres sean números
        
        char digito1 = isbn.charAt(1);
        if (digito1 <'0' || digito1 > '9') {
            isbnCorrecto = false;
        }
        
        char digito2 = isbn.charAt(2);
        if (digito2 <'0' || digito2 > '9') {
            isbnCorrecto = false;
        }
        
        char digito3 = isbn.charAt(3);
        if (digito3 <'0' || digito3 > '9') {
            isbnCorrecto = false;
        }
        
        
        if (isbnCorrecto == false) {
            return false;
        }
        else{
            return true;
        }
    }
    
}
