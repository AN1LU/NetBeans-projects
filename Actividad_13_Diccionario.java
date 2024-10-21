/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_13_diccionario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author analu
 */
public class Actividad_13_Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*OrdenamientoMerge o = new OrdenamientoMerge();
     o.cargarInformacion();
     o.ordenamientoMergeSort(o.getData());*/
        Diccionario d = new Diccionario();
        d.cargarPalabras();
        d.cargarDefinicion();
        
        Scanner entrada = new Scanner (System.in);
        
        String busquedaPalabra = null;
        String nuevaPalabra = null;
        String nuevaDef = null;
        
        System.out.println("Ingrese la palabra de la que desea buscar su definicion.");
        busquedaPalabra=entrada.nextLine();
        d.Busqueda(busquedaPalabra);
        
        System.out.println("Ahora para ingresar una nueva palabra, teclea la palabra de la que desea agregar");
        nuevaPalabra=entrada.nextLine();
        
        System.out.println("Ingrese la definicion de su nueva palabra");
        nuevaDef=entrada.nextLine();
        
        d.insertar(nuevaPalabra,nuevaDef);
     
    }
    
}
