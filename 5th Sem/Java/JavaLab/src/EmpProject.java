import java.util.Scanner;
public class EmpProject {
	
	static int key;

	int EmpValue;

	static int sal;
	 
	 //Declaring the arrays
	 static int[]    Empno =   new int[7];
	 static String[] Empname=  new String[7];
	 static String[] Dates =   new String[7];
	 static String[] Desig =   new String[7];
	 static String[] Dept =    new String[7];
	 static int[]    Basic =   new int[7];
	 static int[]    HRA =     new int[7];
	 static int[]    IT =      new int[7];
	 
	 //Propagating the values 
	 static{
	 Empno[0] = 1001;
	 Empno[1] = 1002;
	 Empno[2] = 1003;
	 Empno[3] = 1004;
	 Empno[4] = 1005;
	 Empno[5] = 1006;
	 Empno[6] = 1007;
	 
	 Empname[0] = "Ashish";
	 Empname[1] = "Sushma";
	 Empname[2] = "Rahul";
	 Empname[3] = "Chahat";
	 Empname[4] = "Ranjan";
	 Empname[5] = "Suman";
	 Empname[6] = "Tanmay";
	 
	 Dates[0] = "01/04/2009";
	 Dates[1] = "23/08/2012";
	 Dates[2] = "12/11/2008";
	 Dates[3] = "29/01/2013";
	 Dates[4] = "16/07/2005";
	 Dates[5] = "1/1/2000";
	 Dates[6] = "12/06/2006";
	 
	 Desig[0] ="e";
	 Desig[1] ="c";
	 Desig[2] ="k";
	 Desig[3] ="r";
	 Desig[4] ="m";
	 Desig[5] ="e";
	 Desig[6] ="c";
	 
	 Dept[0] = "R&D";
	 Dept[1] = "PM";
	 Dept[2] = "Acct";
	 Dept[3] = "Front Desk";
	 Dept[4] = "Engg";
	 Dept[5] = "Menu Facturing";
	 Dept[6] = "PM";
	 
	 Basic[0] = 20000;
	 Basic[1] = 30000;
	 Basic[2] = 10000;
	 Basic[3] = 12000;
	 Basic[4] = 50000;
	 Basic[5] = 23000;
	 Basic[6] = 23000;
	 
	 HRA[0] = 8000;
	 HRA[1] = 12000;
	 HRA[2] = 8000;
	 HRA[3] = 6000;
	 HRA[4] = 20000;
	 HRA[5] = 9000;
	 HRA[6] = 12000;
	 
	 IT[0] = 3000;
	 IT[1] = 9000;
	 IT[2] = 1000;
	 IT[3] = 2000;
	 IT[4] = 20000;
	 IT[5] = 4400;
	 IT[6] = 10000;
	 
	 } 
	 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the empid : ");	
		Scanner in = new Scanner(System.in);
        String givenvalue = in.next();
        
        int EmpValue = Integer.parseInt(givenvalue);
		
		key = (EmpValue % 10) - 1;
		
		//Checking outside values
		if(EmpValue < 1001 || EmpValue > 1007){
			System.out.println("There is no employee with empid : " +EmpValue);	

		}else{
			//printing the details
			System.out.println("Emp No. : " +Empno[key]);
			System.out.println("Emp Name : " +Empname[key]);
			System.out.println("Department : " +Dept[key]);
			
			String Designation = Desig[key];
			
			//Getting DA values and calculating the salary
			switch(Designation) {
				case "e" :
					System.out.println("Designation : Clerk");
					sal = Basic[key] + HRA[key] + 20000 - IT[key];
					System.out.println("Salary :" +sal);	
					break;
				case "c" :
					System.out.println("Designation : Clerk");
					sal = Basic[key] + HRA[key] + 32000 - IT[key];
					System.out.println("Salary :" +sal);	
					break;
				case "k" :
					System.out.println("Designation : Clerk");
					sal = Basic[key] + HRA[key] + 12000 - IT[key];
					System.out.println("Salary :" +sal);	
					break;
				case "r" :
					System.out.println("Designation : Clerk");
					sal = Basic[key] + HRA[key] + 15000 - IT[key];
					System.out.println("Salary :" +sal);	
					break;
				case "m" :
					System.out.println("Designation : Clerk");
					sal = Basic[key] + HRA[key] + 40000 - IT[key];
					System.out.println("Salary :" +sal);	
					break;
			}
		}
		}

	}
