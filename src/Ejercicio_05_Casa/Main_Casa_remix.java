/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_05_Casa;

import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class Main_Casa_remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre_1 = "Sebas";
        Casa[] listaCasas = new Casa[50];

        int planta1_1 = 30;
        int planta2_1 = 45;
        double precio_1 = 120000;

        String nombre_2 = "Julian";
        int planta1_2 = 120;
        double precio_2 = 100000;

        String nombre_3 = "Mari";
        int planta1_3 = 70;
        int planta2_3 = 70;
        double precio_3 = 150000;

        Casa casaSebas = new Casa(nombre_1, planta1_1, planta2_1, precio_1);
        Casa casaJulian = new Casa(nombre_2, planta1_2, precio_2);
        Casa casaMari = new Casa(nombre_3, planta1_3, planta2_3, precio_3);

        listaCasas[0] = casaSebas;
        listaCasas[1] = casaJulian;
        listaCasas[2] = casaMari;

//        for (int i = 0; i < 3; i++) {
//            listaCasas[i].imprimirDatos();
//            System.out.println("");
//        }
        System.out.println("Contador de casas: " + Casa.contadorCasas);
        System.out.println("=".repeat(30));
        System.out.println(" ".repeat(10) + "MENU CASAS" + " ".repeat(10));
        System.out.println("=".repeat(30));
        int opcion;

        do {
            System.out.println("1. Añadir casas");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propietario");
            System.out.println("4. Salir");
            System.out.println("Elige opcion:");
            int numeroCasa;
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1://AÑADIR CASAS
                    System.out.println("=== ALTA DE NUEVA CASA ===");
                    Casa unaCasa = new Casa();
                    listaCasas[Casa.contadorCasas - 1] = unaCasa;

                    for (int i = 0; i < Casa.contadorCasas; i++) {
                        System.out.printf("CASA %d--> %s    %d m2    %.0f€\n", i + 1,
                                listaCasas[i].getPropietario(),
                                listaCasas[i].getSuperficiePlanta1() + listaCasas[i].getSuperficiePlanta2(),
                                listaCasas[i].getPrecioVenta());
                    }
                    break;
                case 2:
                    System.out.println("=== LISTADO DE CASAS ===");
                    for (int i = 0; i < Casa.contadorCasas; i++) {
                        System.out.printf("CASA %d--> %s    %d m2    %.0f€\n", i + 1,
                                listaCasas[i].getPropietario(),
                                listaCasas[i].getSuperficiePlanta1() + listaCasas[i].getSuperficiePlanta2(),
                                listaCasas[i].getPrecioVenta());
                    }
                    break;
                case 3:
                    System.out.println("=== CAMBIANDO PROPIETARIO ===");
                    for (int i = 0; i < Casa.contadorCasas; i++) {
                        System.out.printf("CASA %d--> %s    %d m2    %.0f€\n", i + 1,
                                listaCasas[i].getPropietario(),
                                listaCasas[i].getSuperficiePlanta1() + listaCasas[i].getSuperficiePlanta2(),
                                listaCasas[i].getPrecioVenta());
                    }
                    System.out.println("¿De qué casa quieres modificar el propietario?\n Introduce el número de la casa:");
                    numeroCasa = Integer.parseInt(entrada.nextLine());
                    numeroCasa = numeroCasa - 1;

                    System.out.println("Propietario actual:");
                    System.out.println(listaCasas[numeroCasa].getPropietario());
                    System.out.println("Nuevo propietario:");
                    String newOwner = entrada.nextLine();
                    listaCasas[numeroCasa].setPropietario(newOwner);
                    System.out.println("Propietario modificado: " + listaCasas[numeroCasa].getPropietario());
                    for (int i = 0; i < Casa.contadorCasas; i++) {
                        System.out.printf("CASA %d--> %s    %d m2    %.0f€\n", i + 1,
                                listaCasas[i].getPropietario(),
                                listaCasas[i].getSuperficiePlanta1() + listaCasas[i].getSuperficiePlanta2(),
                                listaCasas[i].getPrecioVenta());
                    }
                    break;
                case 4:
                    System.out.println("***SALIENDO DEL PROGRAMA***");
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("");
        } while (opcion != 4);

    }

}
