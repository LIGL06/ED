/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author LuisIván
 */
public class Dnode {
    String name;
    String number;
    Dnode anterior;
    Dnode siguiente;
    
   public Dnode(String name, String phone){
       this.name = name;
       this.number = phone;
       this.anterior = null;
       this.siguiente = null;
   }
   public Dnode(Dnode ant, String name, String phone, Dnode sig){
        this.anterior = ant;
        this.name = name;//El this me ayuda para hacer una referencia de que es parte de la clase
        this.number = phone;
        this.siguiente = sig;
    }
}
