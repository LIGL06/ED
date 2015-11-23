/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana12.examen;

/**
 *
 * @author LuisIván
 */
public class node {
    public char c;
    public node next;        
    
   public node(char s){
       this.c = s;
       this.next = null;
   }

    public node(char c, node next) {
        this.c = c;
        this.next = next;
    }
   
}
