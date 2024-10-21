/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_13_diccionario;

import java.util.ArrayList;

/**
 *
 * @author analu
 */


public class Diccionario {
    
        ArrayList<String> palabra;
        ArrayList<String> definicion;
        
        public Diccionario(){
            palabra = new ArrayList<String>();
            definicion = new ArrayList<String>();
        }
        
        public ArrayList<String> getPalabra(){
            return palabra;
        }
        
        public void setPalabra (ArrayList<String> palabra){
            this.palabra=palabra;
        }
        
        public ArrayList<String> getDefinicion(){
            return definicion;
        }
        
        public void setDefinicion(ArrayList<String> definicion){
            this.definicion=definicion;
        }
        
        public void cargarPalabras(){
            
            palabra.add("Rover");   
            palabra.add("Promesa");   
            palabra.add("Horquilla");   
            palabra.add("Pañoleta");   
            palabra.add("Proyecto");   
            palabra.add("Competencia");   
            palabra.add("VAL");   
            palabra.add("Camisola");
            
        }
        
        public void cargarDefinicion(){
            definicion.add("Exploradores Vagabundos");
            definicion.add("Yo prometo por mi honor, hacer cuanto de mi dependa para cumplir mis deberes hacia con Dios y la patria, ayudar al projimo en toda circunstancia y cumplir firmemente la ley scout");
            definicion.add("Rama con forma de Y que simboliza las decisiones de la vida los caminos de la verdad y la mentira, lo bueno y lo malo, el si y el no");
            definicion.add("Es un chal con forma de triangulo que se enrolla y se coloca al rededor del cuello se coloca el nudo cabeza de turco de su eleccion y en la punta se hace el nudo de la buena accion. Simboliza el distitivo de grupo");
            definicion.add("Un proyecto en el clan es una actividad que dura entre 5 meses y 1 año que cumple con los objetivos de la agenda rover y es referente a uno de los campos de accion del clan, Viajes y experiencias interculturales, Aventura en la naturaleza, Servicio a la comunidad e Integracion social y economica");
            definicion.add("Es una habilidad o destreza necesaria que en un futuro te puede sacar de un momento de crisis, varias competencias conforman un proyecto");
            definicion.add("Es la abreviatura de Vida al aire libre que es el conjunto de minimos tecnicos y destrezas de las areas de cabuyeria, campismo y exploracion. Es una insginia que de acuerdo a la seccion del scout son los minimos tecnicos que debera presentar y el formato.");
            definicion.add("Es una camisa de botones cuyo color depende de la seccion, amarrillo para manada (7 a 11 años), verde para tropa (11 a 15 años), azul para comunidad (15 a 18 años) y rojo para clan(18 a 22 años) en la camisola se cosen los parches de las insgnias que el muchacho o muchacha adquiera durante su estadia en la seccion cada insignia debe estar en una posicion especifica.");   
        }
        public void insertar(String nuevaPalabra, String nuevaDef){
            palabra.add(nuevaPalabra);
            definicion.add(nuevaDef);
            System.out.println(nuevaPalabra + "fue agregado al diccionario exitosamente.");
        }
        
        public void Busqueda(String busquedaPalabra){
            
            String aux = null;
            boolean comparador;
            for(int i=0; i<8; i++){
                
                aux= palabra.get(i);
                comparador=busquedaPalabra.contentEquals(aux);
                
                if(comparador==true)
                    System.out.print(palabra.get(i)+": "+definicion.get(i));
            }
            System.out.println("------------------------------");
        }
    }
