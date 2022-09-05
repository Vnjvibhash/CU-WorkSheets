import java.util.Scanner;
class MyExceptionDemo {
	 static int flag=0;
	 static Scanner in = new Scanner(System.in);
	 public static void main(String args[]){
		 try {
			 int age=in.nextInt();
			 if(age>18)
				 throw new MyException();
			 else
				 System.out.println("Age is less than 18");
		 }
		 catch(MyException e) {
			 System.out.println(e);
		 }
	 }
}
class MyException extends Exception{
	
}