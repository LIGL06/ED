/*
 * MIT LICENCE - La licencia MIT siempre se usa para software ya hecho. 
 * Luis Iván García Luna
 */
package Semana9;

/**
 *
 * @author LuisIván
 */
public class clist {
    public cnode pivot;
    public cnode end;
    public int size;

    public clist() {
        pivot = null;
        end = null; 
        size = 0;
    }

    public boolean empty(){
        return pivot == null;
    }
    
    public void addNode(int num) {
        cnode cn = new cnode(num,null);
            cn.next = pivot;
        if(pivot==null){
            pivot = cn;
            cn.next = pivot;
            end = pivot;
        } else {
            end.next = cn;
            pivot = cn;
        }
      size ++;  
    }

    public void addLast(int num) {
        cnode cn = new cnode(num,null);
        cn.next = pivot;
        if(pivot == null){
            pivot = cn;
            cn.next = pivot;
            end = pivot;
        } else {
            end.next = cn;
            end = cn;
        }
      size++;
    }

    public void addNode(int num, int pos) {
        cnode cn = new cnode(num,null);
        cnode cnn = pivot;
        pos = pos - 1 ;
            for(int i=1;i<size-1;i++){
                if(i==pos){
                    cnode tmp = cnn.next;
                    cnn.next = cn;
                    cn.next = tmp;
                }
              cnn = cnn.next;
            }
        size ++;    
    }

    public void deletePos(int pos) {
        if(size==1&&pos==1){
            pivot = null;
            end = null;
            size = 0;
        }
        if(pos==1){
            pivot = pivot.next;
            end.next = pivot;
            size--;
        }
        if(pos==size){
            cnode cn = pivot;
            cnode cnn = pivot;
            while(cn!=end){
                cnn = cn;
                cn = cn.next;
            }
           end = cnn;
           end.next = pivot;
           size--;
        }
       cnode c = pivot;
       pos = pos - 1;
       for (int i=1;i<size-1;i++){
           if(i==pos){
               cnode aux = c.next;
               aux = aux.next;
               c.next = aux;
           }
          c = c.next;
       }
      size--; 
    }

    /*public void searchNode(int n) {
        cnode point = pivot;
                while(point!=null){
                    if(point.number == n) System.out.println("Encontrado en la dirección: " + point + "(si existe :D )");
                    point = point.next;
                } 
    }*/
    
    public void showList() {                        
        cnode point = pivot;
                if(size==0)System.out.println("¡Lista vacia!");
                if(pivot.next==pivot) System.out.println(pivot.number+"==>"+point.number);
                System.out.println(pivot.number+"==>");
            while(point.next!=pivot){
                System.out.print(point.number+"==>");
                point = point.next;
            }    
         System.out.print(point.number+"==>");
         point = point.next;
         System.out.println(point.number);
    }
    
    
}
