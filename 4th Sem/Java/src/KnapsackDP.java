import java.util.Scanner;

public class KnapsackDP {
    
    static int n, m, p[], w[];
    
    static void DP(){
        int[][] v = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) 
                    v[i][j] = 0;
                else if (j < w[i]) //
                    v[i][j] = v[i-1][j];
                else
                    v[i][j] = max(v[i-1][j], p[i]+v[i-1][j-w[i]]); //maximization
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }
        //tracking back the optimal solution vector
        System.out.print("Items included are: ");
        while(n > 0){
            if (v[n][m] != v[n-1][m]) {
                System.out.print(n + " ");
                m = m - w[n];
            }
            n--;
        }
    }
    
    static int max(int a, int b){
        return (a>b?a:b);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of items");
        n = s.nextInt();
        p = new int[n+1];
        w = new int[n+1];
        System.out.println("Enter the weights of n items");
        for (int i = 1; i <= n; i++) {
            w[i] = s.nextInt();
        }
        System.out.println("Enter the prices of n items");
        for (int i = 1; i <= n; i++) {
            p[i] = s.nextInt();
        }
        System.out.println("Enter the capacity of Knapsack");
        m = s.nextInt();
        DP();
    }
}
