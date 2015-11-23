/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana9;

/**
 *
 * @author LuisIván
 */
public class cnode {
    public int number;
        public cnode next;

    public cnode() {
        next = null;
        number = 0;
    }
        
    public cnode(int number) {
        this.number = number;
    }

    public cnode(int number, cnode next) {
        this.number = number;
        this.next = next;
    }  
        
}
