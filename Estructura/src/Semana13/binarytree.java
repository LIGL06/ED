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
package Semana13;

/**
 *
 * @author ligl
 */
public class binarytree {
    node root;

    public binarytree() {
        this.root = null;
    }
    
    public binarytree(int key) {
        this.root = new node(key);
    }
    
    public binarytree(node root) {
        this.root = root;
    }
    
    public boolean empty(){
        return root!=null;
    }
    
    public void addNode(int key){
        //Se crea el nuevo nodo y se inicializa
        node newnode = new node(key);
        //Si no existe una raiz, esta se convierte en raiz
        if(root==null) root = newnode;
        else{
            /* Se establece la raiz como el nodo con el cual se va a comenzar
            Conforme se recorre el Ã¡rbol*/
            node focusnode = root;
            //Futuro padre del nuevo nodo
            node parent;
            while(true){
                // La raiz es el padre maximo cuando comienza aquÃ­
                parent = focusnode;
                /*Checar si el nuevo nuevo nodo deberÃ­a continuar
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
                }else{ //Si se llega hacÃ­a aqui, ponemos el nodo en la derecha
                    focusnode = focusnode.right;
                    //If el nodo de la derecha no contiene mÃ¡s datos.
                if(focusnode==null){
                    parent.right = newnode;
                    return; //Salimos del ciclo
                }
                }
            }
        }
    }
    /*Todos los nodos son visitados de orden acendente de manera recursiva
    Usando de nodo a nodo, de ahÃ­ hacia los hijos de los nodos padres hasta terminar*/

    public void inOrder(node focusnode) {
        if(focusnode!=null){
            //Insertamos al lado izquiero del Ã¡rbol
            inOrder(focusnode.left);
            //Mostramos el nodo enfocado y lo imprimimos
            System.out.println(focusnode);
            //Insertamos del lado derecho del Ã¡rbol
            inOrder(focusnode.right);
        }
    }
    
    public void postOrder(node focusnode){
        if(focusnode!=null){
            //Insertamos al lado izquiero del Ã¡rbol
            postOrder(focusnode.left);
            //Insertamos del lado derecho del Ã¡rbol
            postOrder(focusnode.right);
            //Mostramos el nodo enfocado y lo imprimimos
            System.out.println(focusnode);
        }
    }
    
    public void preOrder(node focusnode){
        if(focusnode!=null){
            //Mostramos el nodo enfocado y lo imprimimos
            System.out.println(focusnode);
            //Insertamos del lado izquierdo del Ã¡rbol
            preOrder(focusnode.left);
            //Insertamos del lado derecho del Ã¡rbol
            preOrder(focusnode.right);
        }
    }
    
    public node findNode(int d){
        if(!this.empty()){
            node aux = this.root;
            while(aux.key!=d){
                if(aux.key>d){
                    aux = aux.left;
                }else{
                    aux=aux.right;
                }if(aux==null){
                      return null;  
                    }
            }
           return aux;
        }
      return null;  
    }
    
    public boolean flushNode(int d){
        node aux,parent;     
        aux = parent = root;
        boolean sonL=true;
        if(!empty()){
            while(aux.key!=d){
                parent = aux;
                if(aux.key>d) aux = aux.left;
                else{
                    aux = aux.right; 
                    sonL = false;
                }if(aux==null) return false;
            }
            if(isLeaf(aux)){//Case1
                if(root==aux)root = null;    
                else if(sonL) parent.left = null;
                else parent.right = null;
            }//End Case1
            else if(aux.left==null){//Case2
                if(aux==root) root = aux.right;
                else if(sonL) parent.left = aux.right;
                else parent.right = aux.right; 
            }
            else {
                if(aux==root) root = aux.left;
                else if(sonL) parent.left = aux.left;
                else parent.right = aux.left;
            }//Case2 END
        }
      return false;  
    }
    
    public boolean flushNode(node n){
        boolean hasR = (n.right != null);
        boolean hasL = (n.left != null);
        if(!hasR && !hasL) return flushCase1(n);
        if(hasR && !hasL) return flushCase2(n);
        if(!hasR && hasL) return flushCase2(n);
        if(hasR && hasL) return flushCase3(n);
      return false;
    }
    
    public boolean flushCase1(node n){
        node sonL = this.root.left, sonR = this.root.right;
        if(sonL == n){
            this.root.left = null;
            return true;
        }
        if(sonR == n){
            this.root.right = null;
            return true;
        }
      return false;
    }
    
    public boolean flushCase2(node n){
        node sonL = this.root.left, sonR = this.root.right;
        node actualSon = n.left != null ? n.left : n.right;
        if(sonL == n){
            n.parent.left = actualSon;
            actualSon.parent = n.parent;
            n.right = null;
            n.left = null;
            return true;
        }
        if(sonR == n){
            n.parent.right = actualSon;
            actualSon.parent = n.parent;
            n.right = null;
            n.left = null;
            return true;
        }
      return false;  
    }
    
    public boolean flushCase3(node n){
        node topLeft = swipeL(n.right);
        if(topLeft!=null){
            n.key = topLeft.key;
            flushNode(topLeft.key);
            return true;
        }
      return false;  
    }
    
    private node swipeL(node n){
        if(n.left!=null) return swipeL(n.left);
        return n;
    }

    public boolean isLeaf(node n) {
        return n.left == null && n.right == null;
    }

}
