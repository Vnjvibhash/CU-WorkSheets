import java.util.Scanner;
import java.util.Random;

public class Qsort {

    static int count = 0;

    static int partition(int a[], int low, int high) {
        int temp, i = low + 1, j = high, pivot = a[low];
        while (true) {
            while (i <= high && a[i] <= pivot) {
                i++;
                count++;
            }
            while (a[j] > pivot) {
                j--;
                count++;
            }
            count += 2;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else {
                temp = a[low];
                a[low] = a[j];
                a[j] = temp;
                return j;

            }
        }
    }
    static void quicksort(int a[], int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(a, low, high);
            quicksort(a, low, pivot - 1);
            quicksort(a, pivot + 1, high);
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        n = sc.nextInt();
        int a[] = new int[n];
        Random r = new Random();
        System.out.println("Input Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n * n);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
        quicksort(a, 0, n - 1);
        System.out.println("Sorted elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("The no. of basic operations:" + count);
        System.out.println();
    }
}
