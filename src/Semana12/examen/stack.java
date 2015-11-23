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
public class stack {
    public node top;
    public int size;

    public stack() {
        top = null;
        size = 0; 
    }

    public boolean empty(){
        return top!=null;
    }
            
    public void push(char s){
        node n = new node(s);
        if(empty()) top = n;
        else {
            n.next = top;
            top = n;
        }
      size++;
    }
    
    public void showAZ(){
        node point = top;
            while(point!=null){
                System.out.print("[|"+point.c+"|]");
                point = point.next;
            } 
    }
    
    public node showTop(){
        return top;
    }

    public int size(){
        return size;
    }
}
