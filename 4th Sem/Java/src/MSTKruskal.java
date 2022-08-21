import java.util.Scanner;

public class MSTKruskal {

    static int n;
    static int[][] cost;

    static void kruskal() {
        int[] par = new int[n];
        int a = 0, b = 0, u = 0, v = 0, min, mincost = 0, ne = 0;

        System.out.println("THe minimum spanning tree edges are...");
        while (ne < n - 1) {
            //Find the least cost edge
            min = 999;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cost[i][j] < min) {
                        min = cost[i][j];
                        a = u = i;
                        b = v = j;
                    }
                }
            }

            //Check if edge select cause cyclicity?
            while (par[u] != 0) {
                u = par[u];
            }

            while (par[v] != 0) {
                v = par[v];
            }

            if (u != v) {
                System.out.println("From vertex " + a + " to vertx " + b + " and the cost = " + min);
                mincost += min;
                par[u] = v;
                ne++;
            }

            //Edge included in MST should not be considered for next iteration 
            cost[a][b] = cost[b][a] = 999;
        }
        System.out.println("Cost of MST =" + mincost);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no. of vertices");
        n = s.nextInt();
        cost = new int[n][n];
        System.out.println("Enter the cost matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = s.nextInt();
            }
        }
        kruskal();
    }
}

/*
OUTPUT:
--------
Enter the no. of vertices
4
Enter the cost matrix
999 2 3 4
2 999 1 999
3 1 999 2
4 999 2 999
THe minimum spanning tree edges are...
From vertex 1 to vertx 2 and the cost = 1
From vertex 0 to vertx 1 and the cost = 2
From vertex 2 to vertx 3 and the cost = 2
Cost of MST =5
*/



/*
package daa;

import java.util.Scanner;

public class MSTKruskal {

    static void kruskal(int cost[][], int n){
        int[] par = new int[n];
        int a=0, b=0, u=0, v=0, min, mincost=0, ne=0;
        
        System.out.println("THe minimum spanning tree edges are...");
        while(ne < n-1){
            //Find the least cost edge
            min = 999;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cost[i][j] < min) {
                        min = cost[i][j];
                        a=u=i;
                        b=v=j;
                    }
                }
            }
            
            //Check if edge select cause cyclicity?
            while(par[u] != 0){
                u=par[u];
            }
            
            while(par[v] != 0){
                v=par[v];
            }
            
            if(u != v){
                System.out.println("From vertex " + a + " to vertx " + b + " and the cost = " + min);
                mincost += min;
                par[u]=v;
                ne++;
            }
            
            //Edge included in MST should not be considered for next iteration 
            cost[a][b] = cost[b][a] = 999;
        }
        System.out.println("Cost of MST =" + mincost);
    }
    
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the no. of vertices");
        n = s.nextInt();
        int[][] c = new int[n][n];
        System.out.println("Enter the cost matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = s.nextInt();
            }
        }
        kruskal(c, n);
    }
}
*/
