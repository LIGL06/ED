/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana9;

/**
 *
 * @author LuisIván
 */
public class list {
    public node start,end;

    public list() {                                 
        start = null;
            end = null;
    }

    public boolean empty(){
        return start!=null;
    }
    
    public void addFirst(int num) {
        node n = new node(null,num,start);
            if(empty()==false) start = end = n;
            else {
                start.prev = n;
                start = n;
            }
    }
    
    public void addLast(int num){
        node n = new node(end,num,null);
        if(empty()==false) end = n;
        else {
            end.prev=end;
            end = n;
        }
    }

    public void deleteFirst(){
        start = start.next;
            start.prev = null;
    }
    
    public void deleteLast() {
        end.prev.next = null;
            end = end.prev;
        /* end = end.prev;
            end.next = null;
            */    
    }

    public void deleteNode(int num){
        node aux;
            aux = end;
        if(start.number!=num){    
            while(aux.prev!=null){
                if(aux.number==num) {
                    aux.prev.next = aux.next;
                    aux.next.prev = aux.prev;
                }
              aux = aux.prev;
            }    
        }
        else deleteFirst();
    }
    
    public void searchNode(int n) {
        node point = start;
                while(point!=null){
                    if(point.number == n) System.out.println("Encontrado en la dirección: " + point + "(si existe :D )");
                    point = point.next;
                }
    }            
    
     public void showlist() {
        node point;
            point = start;
                while(point!=null){
                    System.out.print("<==[" /*+point.prev*/+ "|"+ point.number + "|" /*+ point.next*/ + "]==>");
                        point = point.next;
                }
        System.out.println("[END]");
    }
}
