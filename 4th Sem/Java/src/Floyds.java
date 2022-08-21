import java.util.Scanner;

public class Floyds {

    static void floyd(int D[][], int n) {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    D[i][j] = min(D[i][j], D[i][k] + D[k][j]);
                }
            }
        }
    }

    static int min(int a, int b) {
        return (a < b ? a : b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of Vertices");
        n = s.nextInt();
        int[][] cost = new int[n + 1][n + 1];
        System.out.println("Enter the cost matrix");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cost[i][j] = s.nextInt();
            }
        }
        floyd(cost, n);

        System.out.println("All pair shortest path");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(cost[i][j] + " ");
            }
            System.out.println();
        }
    }
}
