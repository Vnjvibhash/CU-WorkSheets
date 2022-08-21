import java.util.Scanner;

public class KnapsackGreedy {
    
    static int n, m, p[], w[];
    
    public static void greedy(){
        float max, profit=0;
        int k = 0, i;
        System.out.println("Item included is :");
        for (i = 0; i < n; i++) {
            max = 0;
            //choose the item which has highest price to weight ratio
            for (int j = 0; j < n; j++) {
                if ((float)p[j]/w[j] > max) {
                    k = j;
                    max = ((float)p[j])/w[j];
                }
            }
            //Kth element has highest price to weight ratio
            if(w[k] <= m){
                System.out.println(k + ", ");
                m = m - w[k];
                profit = profit + p[k];
                p[k] = 0;
            }
            else
                break; //unable fit item k into knapsack
        }
        System.out.println(k + " with portion: " + ((float)m)/w[k]);
        profit = profit + ((float)m)/w[k] * p[k];
        System.out.println("Knapsack profit = " + profit);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of items");
        n = s.nextInt();
        p = new int[n];
        w = new int[n];
        System.out.println("Enter the weights of n items");
        for (int i = 0; i < n; i++) {
            w[i] = s.nextInt();
        }
        System.out.println("Enter the prices of n items");
        for (int i = 0; i < n; i++) {
            p[i] = s.nextInt();
        }
        System.out.println("Enter the capacity of Knapsack");
        m = s.nextInt();
        greedy();
    }
}
