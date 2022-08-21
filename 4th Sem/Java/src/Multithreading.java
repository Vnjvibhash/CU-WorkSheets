import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class  Square implements Runnable
{
    Thread t;
    int x;
    public Square(int n){
        x=n;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        System.out.println("Square of " + x +" = " + (x*x));
    }
}

class  Cube implements Runnable
{
    Thread t;
    int x;
    public Cube(int n){
        x=n;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        System.out.println("Cube of " + x +" = " + (x*x*x));
    }
}

class  Generator implements Runnable
{
    Thread t;
    int num;
    public Generator(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        Random r=new Random();
        try {
            while(true){
                num=r.nextInt(100);
                System.out.println("Generated number is : "+num);
                Square s =new Square(num);
                Cube c =new Cube(num);
                Thread.sleep(1000);
                System.out.println("------------------------------");
            }
        }catch (InterruptedException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Generator g=new Generator();
    }
}
