/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.Random;

/**
 *
 * @author LuisIván
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
            int arr1[];
                arr1 = new int[10];
                    for(int i=0;i<arr1.length;i++){
                        int numero = r.nextInt(20);
                            arr1[i] = numero;
                                System.out.print(" | " + arr1[i] +" | ");
                    }
    }
    
    
}
