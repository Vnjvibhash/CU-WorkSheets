import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println("C=" + c);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
