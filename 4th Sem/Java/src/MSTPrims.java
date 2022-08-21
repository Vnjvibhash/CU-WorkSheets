import java.util.Scanner;

public class MSTPrims {

    static void prims(int cost[][], int n) {
        int[] visit = new int[n];
        int a = 0, b = 0, min, mincost = 0, ne = 0;
        //start from the first vertex
        visit[0] = 1;
        while (ne < n - 1) {
            //Find the nearest neighbour
            min = 999;
            for (int i = 0; i < n; i++) {
                if (visit[i] != 0) {
                    for (int j = 0; j < n; j++) {
                        if (cost[i][j] < min && visit[j] == 0) {
                            min = cost[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
            }
            //Include neares neighbour 'b' into MST
            System.out.println("Edge from vertex " + a + " to vertex " + b + " and the cost " + min);
            visit[b] = 1;
            ne++;
            mincost += min;
            cost[a][b] = cost[b][a] = 999;
        }
        System.out.println("Minimum spanning tree cost is " + mincost);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no. of vertices");
        n = s.nextInt();
        int[][] cost = new int[n][n];
        System.out.println("Enter the adjacency matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = s.nextInt();
            }
        }
        prims(cost, n);
    }
}
