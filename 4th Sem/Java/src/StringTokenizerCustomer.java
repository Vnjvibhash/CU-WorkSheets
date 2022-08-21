import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerCustomer {
    String data;
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data name, dd/mm/yyyy");
        data=sc.nextLine();
    }
    void display(){
        StringTokenizer st=new StringTokenizer(data, ",/");
        System.out.println("No. of tokens: "+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken()+", ");
        }        
    }
    
    public static void main(String[] args) {
        StringTokenizerCustomer ct=new StringTokenizerCustomer();
        ct.read();
        ct.display();
        
        System.out.println();
    }
}
