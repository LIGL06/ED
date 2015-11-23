/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana9;

import java.util.Scanner;

/**
 *
 * @author LuisIván
 */
public class CircledLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       clist li = new clist();
        Menu(li);
    }
    
    public static void Menu(clist li) {
        int opcion; Scanner in = new Scanner(System.in);
        System.out.println("(⌐■_■) Hola de nuevo, Profe (•◡•)/ - Lista Circular"); //ASCII EVERYWHERE
        do{
        System.out.println("1.- Insertar nodo al inicio de la lista");
        System.out.println("2.- Insertar nodo al final de la lista");
        System.out.println("3.- Insertar nodo en posición especifica");
        System.out.println("4.- Eliminar nodo posición especifica");
        /*System.out.println("5.- Buscar un nodo en la lista");*/
        System.out.println("6.- Mostrar la lista");
        System.out.println("0.- Salir");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            
            switch(opcion){
                case 1: 
                    System.out.println("Intertar nodo al inicio de la lista");
                    System.out.print("Dato a insertar: ");
                    opcion = in.nextInt();
                    li.addNode(opcion);
                    System.out.println("");
                        break;
                case 2:
                    System.out.println("Insertar al final de la lista");
                    System.out.print("Dato a insertar: ");
                    opcion = in.nextInt();
                    li.addLast(opcion);
                        break;
                case 3: 
                    System.out.println("Insertar nodo en posición especifica");
                    System.out.print("Dato a insertar: ");
                    opcion = in.nextInt();
                    System.out.print("Posición en la cual insertar: ");
                    int opcion2 = in.nextInt();
                    li.addNode(opcion, opcion2);
                    System.out.println("");
                        break;
                case 4: 
                    System.out.println("Eliminar nodo posición especifica");
                    System.out.print("Dato a eliminar: ");
                    opcion = in.nextInt();
                    li.deletePos(opcion);
                    System.out.println("");
                        break;
                /*case 5:
                    System.out.println("Buscar un nodo en la lista");
                    System.out.print("Dato a buscar: ");
                    opcion = in.nextInt();
                    li.searchNode(opcion);
                    System.out.println("");
                        break;*/
                case 6:
                    System.out.println("Mostrar la lista");
                    li.showList();
                    System.out.println("");
                        break;
            }
            
        }while(opcion!=0);
        
       System.out.println("END - DEAL with it ( ︶︿︶)/"); //ASCII EVERYWHERE
        
    }
}
