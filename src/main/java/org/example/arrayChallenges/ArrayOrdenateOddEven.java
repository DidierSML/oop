package org.example.arrayChallenges;


import java.util.Arrays;

public class ArrayOrdenateOddEven {  //Ordene la lista colocando los pares de derecha a iz, y los impares de iz a der
    public static void main(String[] args) {
            int[] arr= {-7,-6,-5,-4,0,1,2,3,4,5};       //arreglo de números varios
            System.out.println("Before sorting the arrays are: ");      //texto
            System.out.println(Arrays.toString(arr));                   //lista en texto del arreglo sin ordenar

            System.out.println("\n\nAfter sorting the arrays are: "); // texto
            sortOddEven(arr);                                         // desarrolle el método sorOddEven(arr)

    }
    public static void sortOddEven(int[] arr) {                  //Método a desarrollar
        for(int i=0;i<arr.length;i++) {                          //recorra el arreglo completo
                if(arr[i]%2!=0)                                      //si el # del arr es -impar guardelo en un arreglo
                    System.out.print(arr[i]+" ");                    //imprima el arreglo de impares y un espacio
        }
        for(int i=0;i<arr.length;i++) {                         //recorra
                if(arr[i]%2==0)
                    System.out.print(arr[i]+" ");                   //si el # del arr es - par imprima
        }

    }
}
