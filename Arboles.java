/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;

/**
 *
 * @author analu
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Arbol a = new Arbol();
      /* Arbol a = new Arbol(5);
        boolean result =a.esVacio();
        System.out.println(result);*/
      Arbol a = new Arbol(8);
      Nodo n1 = new Nodo(16);
      a.agregarNodo(n1,a.getRaiz());
      Nodo n2 = new Nodo(20);
      a.agregarNodo(n2,a.getRaiz());
      Nodo n3 = new Nodo(15);
      a.agregarNodo(n3,a.getRaiz());
      Nodo n4 = new Nodo(4);
      a.agregarNodo(n4,a.getRaiz());
      Nodo n5 = new Nodo(7);
      a.agregarNodo(n5,a.getRaiz());
      Nodo n6 = new Nodo(2);
      a.agregarNodo(n6,a.getRaiz());
      
      System.out.println("Inicia recorrido");
      a.recorridoPreOrden();
      
    }
    
}
