import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    //Creación de método para mostar Array

    public static void mostarArray(int[] arrayNumeros) {
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Cantidad de números a ordenar " + arrayNumeros.length);
        }
        System.out.println(Arrays.toString(arrayNumeros));
    }

    public static void main(String[] args) {
        //Qué es Bubble sort?
        /*
        * Es un algoritmo que nos permite ordenar Arrays, como por ejemplo
        */

        int[] arrayNums = {8,7,1,2,5,6,10,3};

        mostarArray(arrayNums);
        mostarArray(bubbleSort(arrayNums));

    }
}