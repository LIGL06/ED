/*
The MIT License (MIT)

Copyright (c) Jumpstarters

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package Semana10;
/**
 *Jumpstarters
 *"Vamos a brincar hasta la cima"
 * Ana Teresa Ramírez Morones 512873
 * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García 1410530
 * 3er Semestre ITIC
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

    public void push(String n, String p) {
        Node node = new Node(n,p);
        if(empty()) top = node;
        else{
            node.next = top;
            top = node;
        }
        size++;
    }

    public void pop() {
        top = top.next;
    }

    public void showStack() {
        Node node;
            node = top;
            do{
                System.out.println("["+"|Nombre:"+node.name+"|Número:"+node.number+"|"+"]");
                        node = node.next;
            }while(node!=null);
    }
    
    public void flush(){
        top = null;
        size = 0;
        System.out.println("La pila se ha vaciado");
    }
    
    public Node showTop(){
        return top;
    }
    
    public int size(){
        int d;
        d = 0;
        if(top.next != null){
            d++;
        }
        System.out.println("El tamaño de la pila es" + d);
        return d;
    }
}
