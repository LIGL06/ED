/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana8;

/**
 *
 * @author LuisIván
 */
public class node {
    public int number;          //Se crea el valor entero que puede recibir el nodo. Dato que se almacena en el nodo.
        public node next;       //Dentro del nodo tenemos el enlaze al siguiente enlace, en éste caso un apuntador al siguiente nodo.

    public node(int number) {           //Constructor del nodo con parametros enteros
        this.number = number;           //El entero del constructor es igual al entero global de la clase nodo.
            this.next = null;           //Al crear un nodo, el primer valor con el que se crea el apuntador es nulo.
    }

    public node(int number, node n) {   //Constructor del nodo con parametros enteros y el nodo anterior (sobrecarga)
        this.number = number;           //El entero del constructor es igual al entero que se inserta dentro del nodo que se crea.
            this.next = n;              //En éste caso como está sobrecargado el constructor, puedo recibir el puntero del siguiente nodo en la lista.
    }

    
}

