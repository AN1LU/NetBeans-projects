/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_11;
import static java.lang.Math.random;
/**
 *
 * @author analu
 */
public class Ordenamiento {
 int arreglo[];
    
    public Ordenamiento(){
    arreglo = new int[1000];
    }
    
    public int[] getArreglo(){
        return arreglo;
    }
    public void setArreglo(int[]arreglo){
        this.arreglo = arreglo;
    }
    
    public void cargarInformacion(){
        double dato;
        for(int i=0; i<1000; i++){
            dato = Math.random()*1000;
            arreglo [i]= (int) dato;
        }
    }
    public void mostrarArreglo(){
        for(int i=0; i<arreglo.length; i++){
            System.out.println("Intercambio "+arreglo[i]+", ");
        }
    }      
}
