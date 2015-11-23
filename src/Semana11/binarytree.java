/*
 * The MIT License
 *
 * Copyright 2015 ligl.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Semana11;

/**
 *
 * @author ligl
 */
public class binarytree {
    node root;
    
    public void addNode(int key, String name){
        //Se crea el nuevo nodo y se inicializa
        node newnode = new node(key,name);
        //Si no existe una raiz, esta se convierte en raiz
        if(root==null) root = newnode;
        else{
            /* Se establece la raiz como el nodo con el cual se va a comenzar
            Conforme se recorre el árbol*/
            node focusnode = root;
            //Futuro padre del nuevo nodo
            node parent;
            while(true){
                // La raiz es el padre maximo cuando comienza aquí
                parent = focusnode;
                /*Checar si el nuevo nuevo nodo debería continuar
                del lado izquiero del padre*/
                if(key<focusnode.key){
                    //Cambia el enfoque al lado izquierdo
                    focusnode = focusnode.left;
                    //Si el lado izquierdo no tiene siguientes.
                    if(focusnode == null){
                        //Entonces se coloca el nuevo nodo a la izquierda del anterior.
                        parent.left = newnode;
                        return; //Salimos del ciclo
                    }
                }else{ //Si se llega hacía aqui, ponemos el nodo en la derecha
                    focusnode = focusnode.right;
                    //If el nodo de la derecha no contiene más datos.
                if(focusnode==null){
                    parent.right = newnode;
                    return; //Salimos del ciclo
                }
                }
            }
        }
    }
    /*Todos los nodos son visitados de orden acendente de manera recursiva
    Usando de nodo a nodo, de ahí hacia los hijos de los nodos padres hasta terminar*/

    public void inOrder(node focusnode) {
        if(focusnode!=null){
            //Insertamos al lado izquiero del árbol
            inOrder(focusnode.left);
            //Mostramos el nodo enfocado y lo imprimimos
            System.out.println(focusnode);
            //Insertamos del lado derecho del árbol
            inOrder(focusnode.right);
        }
    }
    
    public void postOrder(node focusnode){
        if(focusnode!=null){
            //Insertamos al lado izquiero del árbol
            postOrder(focusnode.left);
            //Insertamos del lado derecho del árbol
            postOrder(focusnode.right);
            //Mostramos el nodo enfocado y lo imprimimos
            System.out.println(focusnode);
        }
    }
    
    public void preOrder(node focusnode){
        if(focusnode!=null){
            //Mostramos el nodo enfocado y lo imprimimos
            System.out.println(focusnode);
            //Insertamos del lado izquierdo del árbol
            preOrder(focusnode.left);
            //Insertamos del lado derecho del árbol
            preOrder(focusnode.right);
        }
    }
}
