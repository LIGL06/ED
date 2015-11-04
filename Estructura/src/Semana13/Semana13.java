/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13;

/**
 *
 * @author LuisIván
 */
public class Semana13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binarytree bt = new binarytree();
        
        bt.addNode(10);
        bt.addNode(8);
        bt.addNode(12);
        bt.addNode(24);
        bt.addNode(11);
        bt.addNode(2);
        bt.addNode(4);
        bt.addNode(9);
        
        bt.flushNode(bt.root);
        bt.inOrder(bt.root);
    }
    
}
