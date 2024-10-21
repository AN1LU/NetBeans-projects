/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author analu
 */
public class Nodo {
    private int valor;
    private Nodo padre;
    private Nodo hijoDerecho;
    private Nodo hijoIzquierdo;
    
    public Nodo(int valor)
    {
    this.valor=valor;
    }

    public int getValor(){
    return valor;
}
public void setValor(int valor)
{
this.valor = valor;
}
public Nodo getPadre(){
return padre;
}

public void setPadre (Nodo padre ){
this.padre = padre;
}

public Nodo getHijoDerecho(){
return hijoDerecho;
}
public void setHijoDerecho (Nodo hijoDerecho){
this.hijoDerecho = hijoDerecho;
}

public Nodo getHijoIzquierdo(){
return hijoIzquierdo;
}
public void setHijoIzquierdo (Nodo hijoIzquierdo){
this.hijoIzquierdo = hijoIzquierdo;
}

}
