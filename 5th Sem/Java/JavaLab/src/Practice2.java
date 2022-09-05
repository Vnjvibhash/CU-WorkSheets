//Q2. WAP to implement the concept of single inheritance, multilevel inheritance in which you are using the concept of method overloading.
class Dad{
	void home(){
		System.out.println("Dad is having home");
	}  
}
class Son extends Dad{  
	void home(String name, String fname){
		System.out.println(name+" is "+fname+"'s Son");
	}
	void home(String name) {
		System.out.println(name+" is also having home");		
	}
}
class Vivek{  
	void display(){
		System.out.println("I'm vivek");
	}  
}
class Abhi extends Vivek{  
	void display(){
		System.out.println("Abhi is my friend");
	}  
}
class Amar extends Abhi{  
	void display(){
		System.out.println("Amar is our mutual friend");
	}
}
public class Practice2 {

	public static void main(String[] args) {
		System.out.println("Single level inheritance");
		Dad obj = new Son();
		obj.home();
		System.out.println("Method Overloading");
		Son obj1 = new Son();
		obj1.home("Abhi");
		obj1.home("Abhi","Amarjeet");

		System.out.println("\nMulti level inheritance");
		Vivek v = new Amar();
		v.display();
		Abhi ab = new Amar();
		ab.display();
		Amar am = new Amar();
		am.display();
	}
	
}
