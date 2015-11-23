package Semana12.examen;

import java.util.Scanner;

/**
 *
 * @author LuisIván
 */
public class examenparcialdos {
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack st = new stack();
        menu(st);
    }
    public static void menu(stack st){
        int opcion; Scanner in = new Scanner(System.in);
        do{ //MENU - Layout
        System.out.println("** Examen 2° Parcial **");
        System.out.println("1.- Voltear una cadena");
        System.out.println("2.- Palindromos");
        System.out.println("0.- Salir");
            System.out.print("OPCION == >: "); opcion = in.nextInt();
                System.out.println("");
            switch(opcion){ //Ciclo hasta que el usuario teclee 0
                case 1: parte1(st);//Recibe un stack
                        break;
                case 2: parte2(st);// Para el palindromo
                        break;
            }
        }while(opcion!=0);
    }
    
    public static void parte1(stack st){
        StringBuilder sb = new StringBuilder();         //Se usa crear un string apartir de caracteres
            System.out.print("Cadena: ");               
        String s = sc.nextLine();                       
            char[] chars = s.toCharArray();             //Creamos un arreglo de caracteres
                for(int i=0;i<chars.length;i++){        //Recorremos el arreglo desde la posición 0 hasta el tamaño del String
                    st.push(chars[i]);                  //Insertamos en la pila el valor de la posición del arreglo i.e. H = pos 0, h[0] = null
                    st.showAZ();                        //Toda la pila se muestra desde el primero en entrar hasta el ultimo
                }
            System.out.println("");                     
                for(int k=chars.length-1;k>-1;k--){             //Recorremos el arreglo desde la ultima posicion del texto hasta la posición 0                   
                        System.out.print("[|"+chars[k]+"|]");   //Se imprime el ultimo valor hacia la posición 0
                        sb.append(chars[k]);                    //Se anexa en el menu cada caracter del arreglo de caracteres
                }
                    System.out.println("");
                String text = new String(sb);                   //Todo el anexo se convierte en string
            System.out.println("cadena volteada:" + text);      //Se imprime el string
        System.out.println("");        
    }
    
    public static void parte2(stack st){
        boolean bandera = false;                                //Booleano para saber si es binario o no delante.
        StringBuilder sb1 = new StringBuilder();                //Se hace un strng nuevo en blanco para los caracteres
        StringBuilder sb2 = new StringBuilder();
            System.out.print("Palabra: ");                      //Lee la palabra
                String s = sc.nextLine();
            char[] chars = s.toCharArray();                     //convertir y recorrer cada parte de la palabra
                for(int i=0;i<chars.length;i++){
                    sb1.append(chars[i]);
                }
                for(int l=chars.length-1;l>-1;l--){             //Anexamos entonces cada uno de los caracteres de la palabra
                    sb2.append(chars[l]);
                }                                                //Imprimirmos la palabra palindromo
            if(bandera==true) {
                System.out.println(bandera);
                    System.out.println(sb1);
            }                        
    }
    
}
