import java.util.Scanner;

public class Stackdemo {

    int max, top;
    int stk[];

    Stackdemo(int n) {
        max = n;
        stk = new int[max];
        top = -1;
    }

    void push(int ele) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stk[++top] = ele;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Poped element is " + stk[top--]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Stack elements are");
        for (int i = 0; i <= top; i++) {
            System.out.println(stk[i] + " ");
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stack size: ");
        int n = sc.nextInt();
        Stackdemo obj = new Stackdemo(n);
        
        while (true) {
            System.out.print("1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element:");
                    int ele = sc.nextInt();
                    obj.push(ele);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
