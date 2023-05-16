/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_08_Empresa;

import java.util.ArrayList;

/**
 *
 * @author Sebas_work
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BD_Empresa bbdd_empresas = new BD_Empresa();
        
        Empresa empresa1 = new Empresa("B12345678", "Nike Inc.", "Oregon (USA)");
        Empresa empresa2 = new Empresa("B00044562", "Apple Inc.", "California (USA)");
        Empresa empresa3 = new Empresa("B11111111", "Nitro S.L.", "Murcia (ESP)");
        
        
        bbdd_empresas.addEmpresa(empresa1);
        bbdd_empresas.addEmpresa(empresa2);
        bbdd_empresas.addEmpresa(empresa3);
        
        Empresa empresa=bbdd_empresas.buscarCIF("B00044562");
        if (empresa == null) {
            System.out.println("");
            System.out.println("La empresa no existe");
        }
        else{
            empresa.imprimirDatos();
        }
        
        String cif = "B00000001";
        empresa = bbdd_empresas.buscarCIF(cif);
        if (empresa == null) {
            System.out.println("");
            System.out.println(">> {La empresa con CIF "+cif+" no existe.} <<");
        }
        else{
            empresa.imprimirDatos();
        }
        
        
        
        ArrayList<Empresa> listaEmpresas = bbdd_empresas.buscarNombre("ni");
        for (Empresa nombres : listaEmpresas) {
            nombres.imprimirDatos();
        }
    }
    
}
