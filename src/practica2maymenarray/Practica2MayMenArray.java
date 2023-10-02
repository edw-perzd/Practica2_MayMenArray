package practica2maymenarray;

import java.util.Scanner;

public class Practica2MayMenArray {
    
    public static int numMayor(int[] ent){
        int mayor = ent[0];
        for(int i = 0; i < ent.length; i++){
            if(ent[i] > mayor){
                mayor = ent[i];
            }
        }
        return mayor;
    }
    
    public static int numMin(int[] ent){
        int menor = ent[0];
        for(int i = 0; i < ent.length; i++){
            if(ent[i] < menor){
                menor = ent[i];
            }
        }
        return menor;
    }
    
    public static String parEimpar(int[] ent){
        int imp = 0, par = 0;
        for(int i = 0; i < ent.length; i++){
            if((ent[i]%2) == 0){
                par++;
            }
            else{
                imp++;
            }
        }
        return "Total de valores impares: " + imp + "\nTotal de valores pares: " + par;
    }

    public static void main(String[] args) {
        Scanner en=new Scanner(System.in);
        int t = 0;
        System.out.println("Introduce el tamaño del arreglo");
        t = en.nextInt();
        
        int[] enteros=new int[t];
        System.out.println("");
        for(int i=0; i<enteros.length; i++){
            System.out.println("Introduce el valor de la posición [" + i + "] del arreglo");
            enteros[i] = en.nextInt();
        }
        
        System.out.println("El número mayor del arreglo de enteros es: " + numMayor(enteros));
        System.out.println("El número menor del arreglo de enteros es: " + numMin(enteros));
        System.out.println(parEimpar(enteros));
    }
  
}
