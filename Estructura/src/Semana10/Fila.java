/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menupld;

/**
 *
 * @author Sony
 */
public class Fila {
    public Nodo inicio;
    public Nodo fin;
    public int size;
    
    public Fila(){
        this.inicio= null;
        this.fin= null;
        this.size= 0;
    }
    
    public void insertar(String n, String c){
        Nodo nuevo = new Nodo(n,c);  
        if (filaVacia()){ 
            inicio = nuevo; 
            nuevo.siguiente = fin; 
            fin = nuevo; 
        }
        else{
            fin.siguiente = nuevo; 
            fin = nuevo; 
            nuevo.siguiente=null;  
        }
        size++;
    }
    
    public void quitar(){
        if (filaVacia()){
            System.out.println("Esta vacia");
        }
        
        else{
            inicio = inicio.siguiente;
            size--;
        }
        
    }
    
    public boolean filaVacia(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean filaLlena(){
        if(size > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void vaciarFila(){
        this.inicio = null;
        this.fin = null;
        this.size=0;
    }
    
    public Nodo frente(){
        return inicio;
    }
    
    public int tamañoPila(){
        return size;
    }
}
