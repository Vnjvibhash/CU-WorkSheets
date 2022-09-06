//Q2. WAP to implement the concept of single inheritance, multilevel inheritance in which you are using the concept of method overloading.
abstract class GrandPa{  
  abstract void home();  
}
class Parent extends GrandPa{
	@Override
	void home(){
		System.out.println("Dad is having GrandPa's home");
	}  
}
class Child extends Parent{
	void home(String name, String fname){
		System.out.println(name+" is "+fname+"'s Son");
	}
	void home(String name) {
		System.out.println(name+" is also having home");		
	}
}
public class Practice3 {

	public static void main(String[] args) {
		System.out.println("Method Overriding");
		GrandPa obj = new Parent();
		obj.home();
		System.out.println("\nMethod Overloading");
		Child obj1 = new Child();
		obj1.home("Abhi");
		obj1.home("Abhi","Amarjeet");
	}
	
}
