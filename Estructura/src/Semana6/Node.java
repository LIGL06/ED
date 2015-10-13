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
public class Node {
    
    public int data;
    public Node pointer;

    public Node(int d, Node p) {
        this.data = d;
            this.pointer = p;
    }

    public Node(int d) {
        this.data = d;
    }

    public Node() {
    }

}
    