/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

/**
 *
 * @author LuisIván
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Node start = new Node(-4);
            Node end = new Node(0);
                Node nodejs = new Node(10);
        
        start.pointer=nodejs;
            nodejs.pointer=end;
                end.pointer=null;
                
        System.out.println("Dato: " + start.data + ", Posición: " + start);
            System.out.println("Dato: " + nodejs.data + ", Posición: " + nodejs);
                System.out.println("Dato: " + end.data + ", Posición: " + end);
                
        
        
    }
    
}
