package org.example.arrayChallenges;

/*
    Given an array nums.
    We define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i])

    Example:
    Input: nums = [3,1,2,10,1]
    Output: [3,4,6,16,17]
 */
public class RunningSum {

    public static void main(String[] args) {

        int [] array = {3,1,2,10,1};
        int suma = 0;


        for (int i = 0; i < array.length; i++){
            int element = array[i];
            suma = suma + element;

            System.out.print(suma + ", ");
        }
    }


}

class Solution {

    //Recibimos un array por parametro llamado -nums-
    public int[] runningSum(int[] nums) {

        //Creamos un entero que copie el tamaño del array -nums-
        int largoArray = nums.length;
        //Creamos una nueva Lista que tendra el tamaño del anterior array -largoArray-
        int [] nuevoArray = new int [largoArray];

        //Declaramos la var suma = 0;
        int suma = 0;

        //Recorremos el array -nums- en indice por indice
        for(int i = 0; i < nums.length; i++){
            suma = suma + nums[i]; //Sumamos cada -elemento- de cada indice a la var -suma-
            nuevoArray[i] = suma; //Asignamos cada sumatoria obtenida por ciclo a cada indice del nuevo array - nuevoArray-

        }

        //Finalmente retornamos el nuevo Array con su contenido que es igual a la suma seguida de los elementos
        return nuevoArray;
    }

    /*
        Example:
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]
     */

}

/*
    class Solution {
    public int[] runningSum(int[] nums) {

        int length = nums.length;
        int[] sum = new int[length];
        int temp = 0;

        for(int i = 0; i < nums.length;i++){
            temp += nums[i];
            sum[i] = temp;
        }
        return sum;
    }
}
 */