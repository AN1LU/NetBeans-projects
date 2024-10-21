/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_11;

/**
 *
 * @author analu
 */
public class OrdenamientoSeleccion extends Ordenamiento{
    
    public int[] ordenamientoSeleccion(){
        int aux = 0;
        for(int i =0; i<arreglo.length; i++){
            System.out.println("Vuelta: "+ i);
            for(int j=i+1; j<arreglo.length; j++){
                if(arreglo[i]>arreglo[j]){
                 aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;   
                System.out.println("Intercambio: "+arreglo[i]+ " -> "+arreglo[j]);
                }
            }
        }
        return arreglo;
    }
}
