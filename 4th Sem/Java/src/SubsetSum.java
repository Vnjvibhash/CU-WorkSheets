import java.util.Scanner;

public class SubsetSum {
    static int x[], w[], count, d;
    static void sum_of_subsets(int s, int k, int rem){
        x[k] = 1;
        if (s + w[k] == d) {
            //if sub set found 
            System.out.println("Subset = " + (++count));
            for(int i=0; i <= k; i++)
                if(x[i] == 1)
                    System.out.print(" "+w[i]);
            System.out.println();
        }
        else if(s + w[k] + w[k+1] <= d) //left tree evaluation
            sum_of_subsets(s+w[k], k+1, rem-w[k]);
        if((s+rem-w[k] >= d) && (s+w[k+1]) <= d) //right tree evaluation
        {
            x[k] = 0;
            sum_of_subsets(s, k+1, rem-w[k]);
        }    
    }
    public static void main(String[] args) {
        int sum=0, n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of elements");
        n=s.nextInt();
        w=new int[n];
        x=new int[n];
        System.out.println("Enter the elements in increasing order");
        for (int i = 0; i < n; i++) {
            w[i]=s.nextInt();
            sum=sum+w[i];
        }
        System.out.println("Enter the sum");
        d=s.nextInt();
        
        if((sum < d) || (w[0] > d))
            System.out.println("No subset possible\n");
        else
            sum_of_subsets(0, 0, sum);
    }
}
