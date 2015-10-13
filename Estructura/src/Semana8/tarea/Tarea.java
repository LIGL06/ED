/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna - OJO - Es un fork de la actividad en clase.
 * Se añadieron los constructores de buscar nodo, mostrarnodo, eliminar nodo.
 */
package Semana8.tarea;

import java.util.Scanner;

/**
 *
 * @author LuisIván
 */
public class Tarea {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list li = new list();               //Se crea la lista de nodos enlazados con el nombre li
        Menu(li);                           //La interfaz gráfica con el usuario en un constructor diferente.
    }

    public static void Menu(list li) {
        int opcion; Scanner in = new Scanner(System.in);
        System.out.println("(⌐■_■) Hola de nuevo, Profe (•◡•)/"); //ASCII EVERYWHERE
        do{
        System.out.println("1.- Insertar nodo al inicio de la lista");
        System.out.println("2.- Insertar nodo al final de la lista");
        System.out.println("3.- Eliminar nodo al inicio de la lista");
        System.out.println("4.- Eliminar nodo al final de la lista");
        System.out.println("5.- Eliminar nodo especiico de la lista");
        System.out.println("6.- Buscar nodo de la lista");
        System.out.println("7.- Mostrar la lista");
        System.out.println("0.- Eliminar nodo al final de la lista");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            
            switch(opcion){
                case 1: 
                    System.out.println("Intertar nodo al inicio de la lista");
                    System.out.print("Nodo a insertar: ");
                    opcion = in.nextInt();
                    li.addfirst(opcion);
                    System.out.println("");
                        break;
                case 2:
                    System.out.println("Intertar nodo al final de la lista");
                    System.out.print("Nodo a insertar: ");
                    opcion = in.nextInt();
                    li.addlast(opcion);
                    System.out.println("");
                        break;
                case 3:
                    System.out.println("Eliminar primer nodo de la lista");
                    li.deletefirst();
                        break;
                case 4:
                    System.out.println("Eliminar ultimo nodo de la lista");
                    li.deletelast();
                        break;
                case 5: 
                    System.out.println("Borrar nodo especifico de la lista");
                    System.out.print("Dato a eliminar: ");
                    opcion = in.nextInt();
                    li.deletenode(opcion);
                    System.out.println("");
                        break;
                case 6: 
                    System.out.println("Buscar nodo especifico");
                    System.out.print("Dato a buscar: ");
                    opcion = in.nextInt();
                    li.searchnode(opcion);
                    System.out.println("");
                        break;
                case 7:
                    System.out.println("Mostrar lista");
                    li.showlist();
                    System.out.println("");
                        break;
            }
            
        }while(opcion!=0);
        
       System.out.println("END - DEAL with it ( ︶︿︶)/"); //ASCII EVERYWHERE
        
    }
    
}
