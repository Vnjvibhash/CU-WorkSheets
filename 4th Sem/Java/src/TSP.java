import java.util.Scanner;

public class TSP 
{
    static int cost[][],n;
    static int g(int i,int[] s)
    {
        int[] temp = new int[n], temp_r = new int[n];
        int val,flag=0;
        
        int minval=999;
	//starting from vertex i
        s[i]=1;
        for(int j=0;j<n;j++)
        {
            if(i!=j && s[j]==0)
            {
                flag=1;
         	//find the minimum cost branch of the the vertex i
	        System.arraycopy(s, 0, temp, 0, n);
                if((val=(cost[i][j]+g(j,temp)))<minval)
                {
                    minval=val;
                    System.arraycopy(temp, 0, temp_r, 0, n);
                    temp_r[i]=j;
                }
            }
        }
	//update changes to the original array.
        System.arraycopy(temp_r, 0, s, 0, n);
        if(flag==0)
            minval=cost[i][0];
        return(minval);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Vertices");
        n = in.nextInt();
        cost = new int[n][n];
        int[] s = new int[n];
        System.out.println("Enter cost matrix");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                cost[i][j]=in.nextInt();
        System.out.println("Minimum cost = "+g(0,s));
        System.out.print("Minimum cost path is 1->");
        for(int i=s[0];i!=0;i=s[i])
            System.out.print(i+1+"->");
        System.out.println("1");
    }
}