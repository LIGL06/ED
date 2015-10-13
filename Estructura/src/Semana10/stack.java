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
public class stack {
    
    public Node top;
    public int size;
    
    public stack() {
        top = null;
        size = 0;
    }

    public boolean empty() {
        return top==null;
    }

    public void push(String n, String e, String p) {
        Node node = new Node(n,e,p);
        if(empty()) top = node;
        else{
            node.next = top;
            top = node;
        }
        size++;
    }

    public void deleteTop() {
        top = top.next;
    }

    public void showStack() {
        Node node;
            node = top;
            do{
                System.out.println("["+"|Nombre:"+node.nombre+"|Email:"+node.email+"|Número:"+node.number+"|"+"]");
                        node = node.next;
            }while(node!=null);
    }
    
    
}
