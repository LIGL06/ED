/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author josuealexis96
 */
public class listaPila {
    
    public Dnode top;
    public String n;
    public String c;
    public int size;
    
    public listaPila(){
        this.size = 0;
        this.n = "aaaaa";
        this.c = "0000000000";
        this.top = null;

    }
    
    public void Push(String n, String c){
        Dnode nuevo = new Dnode(n,c);
        if(estaVacia()) top = nuevo;
        else{
            nuevo.siguiente = top;
            top = nuevo;
        }
        size++;
    }
    
    public void Pop(){
        top = top.siguiente;
        size--;
    }
    
    public boolean estaVacia(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean estaLlena(){
        if(size > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void vaciarPila(){
        top = null;
        size = 0;
        System.out.println("La pila se ha vaciado");
    }
    
    public Dnode cimaPila(){
        return top;
    }
    
    public int tamañoPila(){
        int d;
        d = 0;
        if(top.siguiente != null){
            d++;
        }
        System.out.println("El tamaño de la pila es" + d);
        return d;
    }
    
    
}