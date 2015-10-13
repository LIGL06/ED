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
public class List {
    protected Node start,end;
    
    public List(){
        start.pointer=null;
            end.pointer=null;
    }
    
    public void insertStart(Node n){
        n.pointer=start.pointer;
            start.pointer=n;
    }
    
    public void insertEnd(Node n){
        Node swift = new Node();
            swift.pointer=start;
                while(swift!=null){
                    System.out.println("[" + swift.data + "] ----> ");
                        swift=swift.pointer;
                }
    }

    @Override
    public String toString() {
        return "List{" + "start=" + start + ", end=" + end + '}';
    }

    
    
}
