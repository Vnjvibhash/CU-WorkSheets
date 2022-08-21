import java.util.Scanner;

class Staff
{
    String staffid, name, phone, salary;
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("Enter staffid, name, phone, salary");
        staffid=sc.nextLine();
        name=sc.nextLine();
        phone=sc.nextLine();
        salary=sc.nextLine();
    }
    void display(){
        System.out.println("Staffid="+staffid);
        System.out.println("Name="+name);
        System.out.println("Phone="+phone);
        System.out.println("Salary="+salary);
    }
}

class Teaching extends Staff
{
    String domain, publication;
    @Override
    void read(){
        super.read();
        System.out.println("Enter domain and publication");
        domain=sc.nextLine();
        publication=sc.nextLine();
    }
    @Override
    void display(){
        super.display();
        System.out.println("Domain="+domain);
        System.out.println("Publication="+publication);
    }  
}

class Technical extends Staff
{
    String skill;
    @Override
    void read(){
        super.read();
        System.out.println("Enter skill");
        skill=sc.nextLine();
    }
    @Override
    void display(){
        super.display();
        System.out.println("Skill="+skill);
    }
}

class Contract extends Staff
{
    String period;
    @Override
    void read()
    {
        super.read();
        System.out.println("Enter period");
        period=sc.nextLine();
    }
    @Override
    void display(){
        super.display();
        System.out.println("Period="+period);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of staffs: ");
        n = sc.nextInt();
        
        Teaching ts[]=new Teaching[n];
        Technical th[]=new Technical[n];
        Contract cs[]=new Contract[n];
        
        System.out.println("Enter the Teaching staff details");
        for (int i = 0; i < n; i++) {
            ts[i]=new Teaching();
            ts[i].read();
        }
        
        System.out.println("Enter the Technical staff details");
        for (int i = 0; i < n; i++) {
            th[i]=new Technical();
            th[i].read();
        }
        
        System.out.println("Enter the Contract staff details");
        for (int i = 0; i < n; i++) {
            cs[i]=new Contract();
            cs[i].read();
        }
        
        System.out.println("Staff Details");
        
        System.out.println("---------Teaching Staffs---------");
        for (int i = 0; i < n; i++) {
            ts[i].display();
        }
        
        System.out.println("---------Technical Staffs---------");
        for (int i = 0; i < n; i++) {
            th[i].display();
        }
        
        System.out.println("---------Contract Staffs----------");
        for (int i = 0; i < n; i++) {
            th[i].display();
        }
    }
}