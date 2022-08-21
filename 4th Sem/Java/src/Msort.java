import java.util.Random;
import java.util.Scanner;

public class Msort 
{
    public static int count = 0;
    static void merge(int arr[], int low, int mid, int high) 
    {
        int i = low, j = mid + 1, k = 0, c[];
        //Create a temporary array c to size of the input array
        c = new int[(high - low) + 1];
        while ((i <= mid) && (j <= high)) 
        {
            count++;
            //Choose the least element and store in Temporary array 'C'
            if (arr[i] < arr[j]) 
                c[k++] = arr[i++];
            else 
                c[k++] = arr[j++];
        }
        //Copy the remaining array elements from any one of sub-array
        while (i <= mid)
            c[k++] = arr[i++];
        while (j <= high) 
            c[k++] = arr[j++];
        for (i = low, j = 0; j < k; i++, j++)
            arr[i] = c[j];
    }

    static void mergeSort(int arr[], int low, int high) {
        int mid;
        if (low < high) {
            //Divide the given array into two parts
            mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        n = s.nextInt();
        int arr[] = new int[n];
        //Use random class object to generate random values
        Random r = new Random();
        System.out.println("Input numbers");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = r.nextInt(n*n);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       
        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted numbers are");
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("No. of basic operaton: " + count);
    }
}
