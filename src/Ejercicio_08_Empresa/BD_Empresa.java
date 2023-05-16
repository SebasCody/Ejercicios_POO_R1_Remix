/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_08_Empresa;

import java.util.ArrayList;

/**
 *
 * @author Sebas_work
 */
public class BD_Empresa {
    
    private ArrayList<Empresa> bbdd;
    
    //CONSTRUCTOR
    public BD_Empresa(){
        
        this.bbdd = new ArrayList<>();
    }
    
    //AÑADIR EMPRESA
    public void addEmpresa(Empresa e){
        this.bbdd.add(e);
    }
    
    //BUSCAR CIF
    public Empresa buscarCIF(String cif){
        
        Empresa empresaDevuelta;
        
        for (Empresa unaEmpresa : bbdd) {
            if (unaEmpresa.getCIF().equals(cif)) {
                empresaDevuelta = unaEmpresa;
                return empresaDevuelta;
            }
        }
        
        return null;
    }
    
    //BUSCAR NOMBRE
    public ArrayList<Empresa> buscarNombre(String nombre){
        
        ArrayList<Empresa> listaNombres = new ArrayList<>();
        
        for (Empresa unaEmpresa : bbdd) {
            if (unaEmpresa.getNombre().toLowerCase().startsWith(nombre.toLowerCase())) {
                listaNombres.add(unaEmpresa);
            }
        }
        return listaNombres;
    }
    
    //GETTER AND SETTER
    public ArrayList<Empresa> getBbdd() {
        return bbdd;
    }

    public void setBbdd(ArrayList<Empresa> bbdd) {
        this.bbdd = bbdd;
    }
    
    
}
