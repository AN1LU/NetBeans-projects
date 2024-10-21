/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_11;

/**
 *
 * @author analu
 */
public class OrdenamientoBurbuja extends Ordenamiento {
    
    public int[]ordenamientoBurbuja(){
        int aux = 0;
        for(int i =2; i<arreglo.length; i++){
            System.out.println("Vuelta: "+ i);
            for(int j=0; j<arreglo.length-(i-1); j++){
                if(arreglo[j]>arreglo[j+1]){
                 aux=arreglo[j];
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=aux;   
                System.out.println("Intercambio: "+arreglo[j]+ " -> "+arreglo[j+1]);
                }
            }
        }
        return arreglo;
    }
    
}