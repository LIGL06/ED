/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

import java.util.Scanner;

/**
 *
 * @author LuisIván
 */
public class Semana10 {
    public static String line,line2,line3;
    public static int data;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list li = new list();
        stack st = new stack();
        deque dq = new deque();
        menu(li,st,dq);
    }

    public static void menu(list li, stack st, deque dq) {
        int opcion; Scanner in = new Scanner(System.in);
        do{
        System.out.println("**__MENU__**");
        System.out.println("Filas, Pilas y Deques");
        System.out.println("1.- Filas");
        System.out.println("2.- Pilas");
        System.out.println("3.- Deques");
        System.out.println("0.- Salir");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            
            switch(opcion){
                case 1: menuLista(li);
                        break;
                case 2: menuFila(st);
                        break;
                case 3: menuDeque(dq);
                        break;
            }
            
        }while(opcion!=0);
        
    }

    public static void menuLista(list li) {
        int opcion; Scanner in = new Scanner(System.in);
        System.out.println("Filas");
        do{
        System.out.println("1.- Insertar después del último");
        System.out.println("2.- Eliminar el primero");
        System.out.println("3.- Comprobar si la fila contiene datos");
        System.out.println("4.- Vaciar la fila ");
        System.out.println("5.- Devolver el primer objeto de la fila");
        System.out.println("6.- Devolver el tamaño de la fila");
        System.out.println("0.- Salir");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            
            switch(opcion){
                case 1: li.insert();
                        break;
                case 2: li.delete();
                        break;
                case 3: li.empty();
                        break;
                case 4: li.flush();
                        break;
                case 5: li.showTop();
                        break;
                case 6: li.size();
                        break;    
            }
            
        }while(opcion!=0);
    }
    
    public static void menuFila(stack st) {
        int opcion; Scanner in = new Scanner(System.in);
        System.out.println("Pilas");
        do{
        System.out.println("1.- Push - Insertar sobre la pila");
        System.out.println("2.- Pop - Elimina de la cima");
        System.out.println("3.- Comprobar si la fila contiene datos");
        System.out.println("4.- Vaciar la pila");
        System.out.println("5.- Devolver el primer objeto de la pila");
        System.out.println("6.- Devolver el tamaño de la pila");
        System.out.println("0.- Salir");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            
            switch(opcion){
                case 1: line = text(); line2 = text(); line3 = text();
                    st.push(line, line2, line3);
                        break;
                case 2: st.pop();
                        break;
                case 3: st.empty();
                        break;
                case 4: st.flush();
                        break;
                case 5: st.showTop();
                        break;
                case 6: st.size();
                        break;    
            }
            
        }while(opcion!=0);
    }
    
    public static void menuDeque(deque dq) {
        int opcion; Scanner in = new Scanner(System.in);
        System.out.println("Deques");
        do{
        System.out.println("1.- Insertar depués del primero");
        System.out.println("2.- Insertar después del último");
        System.out.println("3.- Eliminar el primero");
        System.out.println("4.- Eliminar el ultimo");
        System.out.println("5.- Devolver el primer objeto de la fila");
        System.out.println("6.- Devolver el ultimo objeto de la fila");
        System.out.println("7.- Comprobar si la lista está vacia");
        System.out.println("8.- Vaciar la fila");
        System.out.println("5.- Devolver el tamaño de la lista");
        System.out.println("0.- Salir");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            
            switch(opcion){
                case 1: dq.addTop();
                        break;
                case 2: dq.addLast();
                        break;
                case 3: dq.flushTop();
                        break;
                case 4: dq.flushLast();
                        break;
                case 5: dq.showTop();
                        break;
                case 6: dq.showLast();
                        break;    
                case 7: dq.empty();
                        break;
                case 8: dq.size();
                        break;
            }
            
        }while(opcion!=0);
    }

    public static int input(){ 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Valor: ");
        n = sc.nextInt();
        return n;
    }
    
    public static String text(){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Valor: ");
        s = sc.nextLine();
        return s;
    }
    
}
