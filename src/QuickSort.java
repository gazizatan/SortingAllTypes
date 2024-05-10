import java.util.Scanner;
import java.io.*;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr, int min, int max)
    {
        int pivot = arr[max];
        int i = (min - 1);
        for (int j = min; j <= max - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, max);
        return (i + 1);
    }

    public static void quickSort(int[] arr, int min, int max){
        if (min < max) {

            int pi = partition(arr, min, max);

            quickSort(arr, min, pi - 1);
            quickSort(arr, pi + 1, max);
        }
    }

    public static void outputSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите количество людей которые хотите сортировать");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Напишите возраст этих людей");
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            arr[i]=a;
        }

        quickSort(arr, 0, N - 1);
        System.out.println("Очередь младшего к старшему:");
        outputSort(arr);
    }
}