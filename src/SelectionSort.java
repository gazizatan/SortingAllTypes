import java.util.Scanner;
public class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        Scanner sc= new Scanner(System.in);
        System.out.println("Количество игр в магазине:");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Баркод игр:");
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            arr[i]=a;
        }
        ob.sort(arr);
        System.out.println("Сортированные игры");
        ob.printArray(arr);
    }
}