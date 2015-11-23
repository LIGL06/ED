/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4.Examen;

import java.util.Scanner;

/**
 *
 * @author LuisIván
 */
public class Menu {
    int caso=0;
    Scanner sc = new Scanner(System.in);

    public Menu() {
        System.out.println("**__EXAMEN DE ESTRUCTURA DE DATOS__**");
        System.out.println("1.- Problema X");
        System.out.println("2.- Problema X2");
        System.out.println("3.- Problema X3");
    }
    public void Show(){
        System.out.print("Opción ==> ");
        caso = sc.nextInt();
        setCaso(caso);
    }

    public int getCaso() {
        System.out.println("Problema: " + caso);
        return caso;
    }

    public void setCaso(int caso) {
        this.caso = caso;
    }
   

}
