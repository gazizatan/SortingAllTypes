import java.util.Scanner;
public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Количество игр в магазине:");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Баркод игр:");
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            arr[i]=a;
        }
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Сортированные игры");
        printArray(arr);
    }
}

