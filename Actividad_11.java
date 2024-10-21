/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_11;

/**
 *
 * @author analu
 */
public class Actividad_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("PRIMERO OBSERVARAS EL ORDENAMIENTO DE TIPO BURBUJA");
        OrdenamientoBurbuja o = new OrdenamientoBurbuja();
        System.out.println("CARGAMOS LOS DATOS...");
        o.cargarInformacion();
        o.mostrarArreglo();
        System.out.println("ORDENAMOS LOS DATOS...");
        o.ordenamientoBurbuja();
        System.out.println("RESULTADO FINAL-------------------------------------------");
        o.mostrarArreglo();
        System.out.println("AHORA OBSERVARAS EL ORDENAMIENTO DE TIPO SELECCION");
        OrdenamientoSeleccion s = new OrdenamientoSeleccion();
        System.out.println("CARGAMOS LOS DATOS...");
        s.cargarInformacion();
        s.mostrarArreglo();
        System.out.println("ORDENAMOS LOS DATOS...");
        s.ordenamientoSeleccion();
         System.out.println("RESULTADO FINAL-------------------------------------------");
        s.mostrarArreglo();
    }
    
}
