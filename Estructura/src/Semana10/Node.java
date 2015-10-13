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
public class Node {
    String nombre;
    String email;
    String number;
    Node next;

    public Node(String nombre, String email, String number) {
        this.nombre = nombre;
        this.email = email;
        this.number = number;
        this.next = null;
    }
    
    
}
