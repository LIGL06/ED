/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana8.tarea;

/**
 *
 * @author LuisIván
 */
public class list {
    public node start,end;

    public list() {                                 //Se crea la lista con los valores iniciales de nulo, en donde no existe un inicio o un fin.
        start = null;                               //Como recien se contruye la lista, el inicio o el nodo inicio no existe.
            end = null;                             //Como recien se contruye la lista, el inicio o el nodo final no existe.
    }

    public void addfirst(int number) {              //En este constructor que recibe un numero, añade el numero entero al principio de la lista.
        node newnode = new node(number,start);      //Creamos el nodo con un numero e inicio. (le damos la posición de HEAD)
          //newnode.next = start;
                start = newnode;                    //El inicio de la lista va a ser igual al nuevo nodo que quedara en cima de los demás.
                    if(end==null) end = newnode;    //Si existe un final dentro de la lista, entonces mi nuevo final es igual al nuevo nodo. estó recorre el nodo anterior enlazado.
    }

    public void addlast(int number) {               //En este constructor que recibe un numero, añade dicho numero al final de la lista.
        node newnode = new node(number);            //Creamos el nodo.
            if(start==null){                        //Si tenemo una lista creada, entonces podemos meter un numero al final, de lo contrario mi nuevo nodo seria el pricipio y fin.
                start = newnode;                    //Entonces si tenemos una lista mi principio guarda apunta al nuevo nodo. 
                    newnode.next = end;             //De manera que para tener el valor siguiente del nodo lo apuntamos al final de la lista para no perder valroes.
                        end = newnode;              //Entonces cerramos la lista con el final del nodo, quisieramos creer que todos los valores de la lista son iguales, pero el valor 
            }                                       //del nodo siguiente se guarda el final, de manera para poder coservar ua lista enlazada.
            else{
                end.next = newnode;                 //De lo contrario a que no exista una lista, nuestro final será el nuevo nodo.
                    end = newnode;                  //De igual manera el valor siguiete del final será un nulo, dando a enteder que llegó al final de la lista.
                        newnode.next = null;        
            }
    }

    public void showlist() {                        //Para mostrar la lista enlazada, se debe tener un apuntador que vaya recorriendo toda la lsita con iteraciones.
        node point;                                 //El aputador point tiene las caracteristicas del nodo, puede bricar al nodo y despues del nodo.
            point = start;                          //Empezamos el puntero en el inicio de la lista, solo se ejecuta una vez, solo existe un inicio de lista.
                while(point!=null){                 //Mientras que el puntero no sea un valor nulo, o sea que no llegue al final, el iterador recorrerá la lista.
                    System.out.print("["+ point.number + "] == >");     //Imprime la lista con el valor del puntero, que en este caso saca el valor del nodo.
                        point = point.next;         //El puntero entonces pasa a la siguiente parte de la lista, brinca al siguiente enlace.
                }
        System.out.println("[END]");                //Final de la lista.
    }
    
    public void searchnode(int n){                              //Para buscar un nodo dentro de la lista se tiene que hacer un barrido de toda la lista.
        node point;                                             //Primero creando un puntero que tiene que evaluar las posiciones siguientes de la lista.
            point = start;                                      //Se comienza con el puntero al inicio de la lista.
                while(point!=null){                             //Mientras que el puntero sea diferente de nulo (o que no llegue al final) va a permitir que continue el ciclo.
                    if(point.number == n) System.out.println("Encontrado en la dirección: " + point + "(si existe :D )");
                    point = point.next;                         //Entonces si en la posición del puntero existe un valor direfente de nulo, se imprime la dirección del nodo
                }                                               //y continua el puntero con la siguiente posición de la lista.
    }

    public void deletenode(int n) {                             // Para eliminar un nodo es mucho más complicado de lo que parece en una lista de un enlace.
      node point=start,temp=null;                               //Porque se tienen que utilizar punteros para agarrar referencia del inicio y una variable extra.
            while(point!=null){                                 //Mientras que el puntero sea diferente de nulo el ciclo va a ser vigente, demostrando que no llega al final del arreglo todavía.
                    if(point.number==n){                        //Si el valor del puntero es igual al dato que quiero eliminar, entonces el valor de la variable es el siguiente del temporal.
                        temp.next = point.next;                 //Entonces cuando el valor de la variable temporal existe cuando es igual al valor que busco, mi variable auxiliar.
                    }                                           //De ahí mi variable temporal será igual a donde mi apuntador existe con el numero, y de ahí brinco al siguiente valo de la lista (desconectado nodos.)
                temp = point;
                point = point.next;
            }
        //if(status!=true) System.out.println("No exsite el número dentro de la lista");    
    }    

    public void deletefirst() {                                     //Para eliminar el primer valor de la lista, es un procedimiento muy sencillo, se debe tener que brincar el valor inicial por siguiente.
        start = start.next;                                         //O en otras palabras llegar al segundo valor de la lista.
    }
    
    public void deletelast(){ 
        node actual = start,prev = null;                            //Para eliminar el ultimo valor de la lista, es un poco más complejo el procedimiento
        while(actual.next!=null) {                                  //Mientras que el valor del nodo actual que será el que recorra toda la lista, sea diferente de nulo, o llegue hasta el final de la lista.
            prev = actual;                                          //Encontes mi nodo auxliar es igual a mi valor actual, de manera que el valor actual siempre va delante.
                actual = actual.next;                               //Mi valor actual brincara al siguiente nodo, dejando un paso atras mi valor auxiliar.
        }
        end = prev;                                                 //Cuando lleguemos al final de la lsita, el valor auxiliar es el penultimo de la lista, podiendo así poder elminiar el valor del final.
            prev.next = null;                                       //Una vez que mi penultimo valor sea nulo, habré eliminado el ultimo valor de la lista.
    }
    
}