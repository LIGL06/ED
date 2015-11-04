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
public class deque {
    //Los Deques estan compuestos de un conjunto de nodos con doble apuntantador, una para siguiente y otro para anterior
    protected Dnode inicio;//Apuntador inicio
    protected Dnode fin;//Apuntador de fin
    int size;//tamaño del deque
    
    public deque(){//Constructor del deque
        /*
        Los apuntadores inicio y fin se encuentran señalando a nulo, representando que el deque
        esta vació, es decir no tiene elementos. 
        Debido a que el deque no tiene elementos el "contador" size, que representa el tamaño 
        del se inicializa con 0
        */
        inicio = null;
        fin = null;
        size = 0;
    }
    
    public boolean empty(){/*
        Método que comprueba si el deque esta lleno o vacío. Para realizar esta comprobación se 
        hace un análisis en el apuntador de inicio, si el inicio apunta a nulo
        significa que no hay elementos para que el apuntador señale
        */
        if (inicio == null){//si el apuntador incio esta apuntando a nulo, entonces la lista esta vacía
            return true;
        }
        else{//Si el apuntador no señala a nulo, entonces esta llena y se devuelve un falso
            return false;
        }
    }
    
    public void addTop(String name, String phone){//Método para insertar un nodo al inicio
        Dnode node = new Dnode(null, name, phone, inicio);/*Creación de un nuevo nodo en el
        que el puntero anterior señala a nulo(ya que es el inicio de la lista), 
        se establecen los datos de nombre y telefono y el puntero siguiente señala a inicio
        */
        
        if (empty()){//Se realiza una comprobación para saber si elm deque esta vacio o no
            inicio = fin = node;/*
            En caso de que el deque este vacio, entonces se establece que los apuntadores de 
            inicio y fin son iguales al nuevo nodo, es decir los dos apuntadores señalan a este nuevo nodo
            */
        }
        else{//En caso de que el deque no esste vacio entonces
            inicio.anterior = node;/*el apuntador anterior del nodo al que apunta inicio, cambia y ahora señala
            al nuevo nodo
            */
            inicio = node;//Se coloca al apuntador inicio en el nuevo nodo
        }
        size++;//El tamaño del deque se incrementa en 1, ya que se insertan nodos
    }// Fin de insertaInicio
    
    public void addLast(String name, String phone){//Método para insertar un nodo al final del deque 
        Dnode node = new Dnode(fin, name, phone, null);/*Creación de un nuevo nodo en el
        que el puntero anterior señala al nodo a donde apunta fin(pues lo insertaremos al final de la lista), 
        se establecen los datos de nombre y telefono y el puntero siguiente señala a nulo
        */
        if (empty()){//Validar si el deque esta vacio
            inicio = fin = node;//Si esta vacio entonces los punteros inicio y fin señalan al nuevo nodo
        }
        else{//si el deque no esta vacio
            fin.siguiente = node;//El apuntador siguiente del nodo señalado por fin apuntará al nuevo nodo
            fin = node; //El apuntador fin señala al nuevo nodo
        }
        size++;//El tamaño del deque se incrementa en 1
    }//inserta Final
    
    public void flushTop(){//Método para quitar un elemento del frente
        if(empty()){//Validar si el deque esta vacio
            System.out.println("El Deque ya esta Vacio");//En caso que lo este se muestra un mensaje indicando que el deque ya esta vacio
        }
        else{//En caso de que si haya elementos
        inicio = inicio.siguiente;/*
        El apuntador inicio cambia su posición al nodo al que señala el apuntador siguiente del nodo donde apunta
        inicio
        */
        
        inicio.anterior = null;//El apuntador anterior del inicio señalará a nulo, pues es el inicio de la lista
        size --;//El tamaño del deque decrece en una unidad 
        }
    }
    
    public void flushLast(){//Método para quitar un elemento de Atras
        
        if(empty()){//Validación del deque, Determina si esta vacio o lleno
            System.out.println("El Deque ya está Vacio");//Si esta vacio se despliega un mensaje para indicar que el deque ya esta vacia
        }
        else{//Si el deque no esta vacio 
        fin = fin.anterior;//El apuntador fin cambia su posición hacia donde señala el puntero anterior de fin
        fin.siguiente = null;//El apuntador siguiente del nodo en donde se encuentra fin señalará a nulo
        size --;//El tamaño del deque decrece 1 unidad
        }
    }
    
    public Dnode showTop(){//Obtener los datos del nodo del frente
        /*
        Se utiliza un método de tipo nodoDeque pues se devolverá un objeto tipo nodo con la 
        finalidad de obtener los 2 datos contenidos en el nodo
        */
       return inicio;//SE regresa el nodo hacia donde señala inicio
    }
    
    public Dnode showLast(){//Método para obtener los datos del nodo de Atrás
        /*
        Se usa un método tipo nodoDeque ya que devolverá un objeto tipo nodo, el cual contiene
        los dos datos solicitados al usuario
        */
        return fin;//Se regresa el nodo hacia donde apunta fin
    }
    
    public void flush(){//Método para vaciar el deque
        inicio = null;//El apuntador inicio señalará hacia nulo, para mostrar que no hay elementos al inicio
        fin = null;//El apuntador fin señala a nulo
        size = 0;//El tamaño del deque se iguala a  cero, para simbolizar que el deque no tiene elementos 
    }
    
    public int size(){//Métod para obtener el tamaño del deque
        return size;//Se regresa la variable entera Size la cual contiene el número de nodos dentro del deque
    }
}
