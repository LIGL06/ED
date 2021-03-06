/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Fila {
    public Node inicio;
    public Node fin;
    public int size;//Se declaran las 3 variables que se utilizaran en la fila
    
    public Fila(){//Constructor Fila
        this.inicio= null;
        this.fin= null;
        this.size= 0;//Se igualan todas las variables a 0 o a null
    }
    
    public void insertar(String n, String c){//Se crea el metodo insertar para insertar datos en la fila
        Node nuevo = new Node(n,c);  //Se crea una variable nodo
        if (filaVacia()){ //Si la fila esta vacia
            inicio = nuevo; //Se junta el inicio con nuevo
            nuevo.next = fin; //El siguiente de nuevo es fin
            fin = nuevo; //El fin se conecta a nuevo
        }
        else{//Si la fila esta llena
            fin.next = nuevo; //Se coloca el nuevo nodo despues del ultimo
            fin = nuevo; //Se indica el nodo nuevo ahora es el fin
            nuevo.next=null;  //El siguiente del ultimo es null
        }
        size++; //Se incrementa size para indicar que la fila crecio
    }
    
    public void quitar(){//Se crea el metodo quitar para quitar el primer nodo
        if (filaVacia()){//Si la fila esta vacia
            System.out.println("Esta vacia");//Se indica que esta vacia
        }
        
        else{//Si la fila esta llena
            inicio = inicio.next;//Entonces elimina el inicio
            size--;//Se indica que la cantidad de nodos de la fila ha dsminuido
        }
        
    }
    
    public boolean filaVacia(){ //Se crea el metodo filaVacia
        if(size == 0){//Si el tamaño es igual a cero
            return true;//Significa que la fila esta vacia
        }
        else{//Si no
            return false;//Tiene elementos
        }
    }
    
    public boolean filaLlena(){//Se crea el metodo filaLlena
        if(size > 0){//Si size es mayor que cero
            return true;//Entonces la fila tiene datos
        }
        else{//Si no
            return false;//Esta vacia
        }
    }
    
    public void vaciarFila(){//Se crea el metodo vaciarFila para eliminar todos los elementos de la lista
        this.inicio = null;
        this.fin = null;
        this.size=0;//Se transforman todas las variables a null y 0 para eliminar todos los datos
    }
    
    public Node frente(){//Se crea el metodo frente
        return inicio;//Se regresa inicio porque el del inicio es el de enfrente
    }
    
    public int tamañoFila(){//Se crea el metodo tamañoFila
        return size;//Se regresa size que indica el tamaño de la fila y que cambiando de acuerdo a los metodos quitar e insertar
    }
}
