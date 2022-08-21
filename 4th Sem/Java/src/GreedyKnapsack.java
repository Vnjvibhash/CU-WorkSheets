import java.util.*;
public class GreedyKnapsack {
    static int n,m,p[],w[];//n = no. of items,m = size of knapsack,p for price,w for weight
    static void greedy()
    {
        double max,profit=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            max=0;
            for(int j=0;j<n;j++)
            {
                if((float)p[j]/w[j]>max)
                {
                    k=j;
                    max=(float)p[j]/w[j];
                }
            }
            if(w[k]<=m)
            {
                System.out.println(k+", ");
                m=m-w[k];
                profit+=p[k];
                p[k]=0;//so that kth item will not be selected again
            }
            else 
                break;
        }
        //System.out.println(k+" with portion: "+(float)m/w[k]);//for fractional knapsack
        //profit+=(float)m/w[k]*p[k];
        System.out.println("Knapsack profit = "+profit);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of items");
        n=sc.nextInt();
        p=new int[n];
        w=new int[n];
        System.out.println("Enter the weights of "+n+" items");
        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();
        System.out.println("Enter the prices of "+n+" items");
        for(int i=0;i<n;i++)
            p[i]=sc.nextInt();
        System.out.println("Enter the capacity of knapsack");
        m=sc.nextInt();
        greedy();
    }
}
