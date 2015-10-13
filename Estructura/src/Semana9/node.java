/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana9;

/**
 *
 * @author LuisIván
 */
public class node {
    public node prev;
        public int number;
            public node next;

    public node(int number) {
        this.prev = null;
            this.number = number;
                this.next = null;
    }

    public node(node prev, int number, node next) {
        this.prev = prev;
        this.number = number;
        this.next = next;
    }
            
}
