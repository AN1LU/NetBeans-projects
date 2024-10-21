/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author analu
 */
public class Arbol {
    private Nodo raiz;
    //constructor para crear la clase
    public Arbol(){
        
    }
    public Arbol(int valor){
        this.raiz = new Nodo(valor);
    }

    public Arbol(Nodo nodo){
        raiz = nodo;
    }
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public boolean esVacio(){
        if(raiz == null)
            return true;
        return false;
    }
    
    public void agregarNodo(Nodo nodo, Nodo raiz){
        if(raiz == null)
            this.setRaiz(nodo);
        else
        {
            if(nodo.getValor()<= raiz.getValor()){
                if(raiz.getHijoIzquierdo()== null){
                    System.out.println("Agrego nodo a la hoja izquierda");
                    raiz.setHijoIzquierdo(nodo);                 
                }
                else
                {
                    System.out.println("Se invoca la funcion recursiva para el hijo izquierdo");
                    agregarNodo(nodo, raiz.getHijoIzquierdo());
                }
                
            }
            else {
                if(raiz.getHijoDerecho()==null){
                    System.out.println("Agrego nodo a la hoja derecho");
                    raiz.setHijoDerecho(nodo);
                }
                else
                {
                    System.out.println("Se invoca la funcion recursiva para el hijo derecho");
                    agregarNodo(nodo, raiz.getHijoDerecho());
                }
                
            }
            
        }
    }


public void recorridoPreOrden(){
    ayudantePreorden(raiz);
}

public void ayudantePreorden(Nodo nodo){
    if(nodo== null){
        
        return ;
    }else
    {
        System.out.print(nodo.getValor()+", ");
        ayudantePreorden(nodo.getHijoIzquierdo());
        ayudantePreorden(nodo.getHijoDerecho());
    }
}
}
