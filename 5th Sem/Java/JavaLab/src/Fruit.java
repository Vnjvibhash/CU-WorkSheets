public class Fruit {

	private String name;
	private String taste;
	private char size;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public void eat(){
		System.out.println("Name of the Fruit is : "+name);
		System.out.println("And it taste : "+taste);
	}

}

class Apple extends Fruit{
	
	public void eat(){
		
		System.out.println("This apple taste : "+getTaste());
		System.out.println("Size of this apple is "+getSize());
		System.out.println("");
	}
}

class Orange extends Fruit{
	
	public void eat(){
		
		System.out.println("This Orange taste : "+getTaste());
		System.out.println("Size of this Orange is "+getSize());
		System.out.println("");
	}
	
}

class FruitTester{
	
         public static void main(String[] args) {
        	 
        	 Apple apple = new Apple();
        	 Orange orange = new Orange();
        	 
        	 apple.setName("apple");
        	 apple.setSize('m');
        	 apple.setTaste("Delicious");
        	 
        	 orange.setName("Orange");
        	 orange.setSize('m');
        	 orange.setTaste("Awesome");
        	 
        	 apple.eat();
        	 orange.eat();
        	 
        
	}
	
}
