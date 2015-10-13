/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana8;

/**
 *
 * @author LuisIván
 */
public class Semana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list li = new list();   //Se crea la lista de nodos enlazados con el nombre li
        
            System.out.println("(⌐■_■) Hola Profe (•◡•)/"); //ASCII EVERYWHERE
        
        li.addfirst(10);            //Añado a la cima de la lista el numero 10
            li.addfirst(40);        //El 10 anterior baja, porque entra el 40
                li.addfirst(-6);    //La cima de la lista ahora es -6 en lugar de 40 ==> (-6,40,10)
        li.showlist();              //Mostramos la lista enlazada con todos los datos
            li.addlast(24);         //Añadimos el 24 en el final de la lista ==> (-6,40,10,24)
        li.showlist();              //Mostramos la lista enlazada con todos los datos con los nuevos datos
            li.deletelast();        //Eliminamos el ultimo dato de la lista (24)
        li.showlist();              //Mostramos la lista enlazada con los datos eliminados
                       
        System.out.println("END - DEAL with it ( ︶︿︶)"); //ASCII EVERYWHERE
    }
    
}
