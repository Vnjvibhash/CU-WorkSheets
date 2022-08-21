import java.util.Scanner;

public class DijkstraSSSP {

    static int[][] cost;
    static int dist[], n;

    static int min(int m, int n) {
        return ((m < n) ? m : n);
    }
    
    static void dijkstra(int source){
        int[] s = new int[n];
        int min, w=0;
        System.arraycopy(cost[source], 0, dist, 0, n);
        //Initialize dist from source to source as 0
        //mark source vertex - estimated for its shortest path
        s[source] = 1; dist[source] = 0;
        for (int i = 0; i < n-1; i++) {
            //Find the nearest neighbour vertex
            min = 999;
            for (int j = 0; j < n; j++) {
                if ((s[j] == 0) && (min > dist[j])) {
                    min = dist[j];
                    w = j;
                }                
            }
            s[w] = 1;
            //Update the shortest path of neighbour of w
            for (int v = 0; v < n; v++) {
                if (s[v] == 0 && cost[w][v] != 999) {
                    dist[v] = min(dist[v], dist[w] + cost[w][v]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int source;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the no. of vertices");
        n = s.nextInt();
        cost = new int[n][n];
        dist = new int[n];
        
        //Enter the cost matrix, 0 for principle diagnol axix
        //999 for no direct edge from i to j
        System.out.println("Enter the cost matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the source vertex");
        source = s.nextInt();
        dijkstra(source);
        
        System.out.println("the shortest distance is ...");
        for (int i = 0; i < n; i++) {
            System.out.println("Cost from " + source + " to " + i + " is " + dist[i]);
        }
    }
}

//public class DijkstraSSSP {
//
//	final static int MAX = 20;
//	final static int infinity = 9999;
//	static int n;		// No. of vertices of G
//	static int a[][];	// Cost matrix
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		ReadMatrix();
//		int s = 0; 		// starting vertex
//		System.out.println("Enter starting vertex: ");
//		s = scan.nextInt();
//		Dijkstras(s);  	// find shortest path
//	}
//
//	static void ReadMatrix() {
//		a = new int[MAX][MAX];
//		System.out.println("Enter the number of vertices:");
//		n = scan.nextInt();
//		System.out.println("Enter the cost adjacency matrix:");
//		for (int i = 1; i <= n; i++)
//			for (int j = 1; j <= n; j++)
//				a[i][j] = scan.nextInt();
//	}
//
//	static void Dijkstras(int s) {
//		int S[] = new int[MAX];
//		int d[] = new int[MAX];
//		int u, v;
//		int i;
//		for (i = 1; i <= n; i++) {
//			S[i] = 0;
//			d[i] = a[s][i];
//		}
//		S[s] = 1;
//		d[s] = 1;
//		i = 2;
//		while (i <= n) {
//			u = Extract_Min(S, d);
//			S[u] = 1;
//			i++;
//			for (v = 1; v <= n; v++) {
//				if (((d[u] + a[u][v] < d[v]) && (S[v] == 0)))
//					d[v] = d[u] + a[u][v];
//			}
//		}
//		for (i = 1; i <= n; i++)
//			if (i != s)
//				System.out.println(i + ":" + d[i]);
//	}
//
//	static int Extract_Min(int S[], int d[]) {
//		int i, j = 1, min;
//		min = infinity;
//		for (i = 1; i <= n; i++) {
//			if ((d[i] < min) && (S[i] == 0)) {
//				min = d[i];
//				j = i;
//			}
//		}
//		return (j);
//	}
//}
