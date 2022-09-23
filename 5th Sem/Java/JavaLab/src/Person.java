public class Person {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == "")System.out.println("Name can not be Blank");
		else this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0)System.out.println("Age should not be zero or negative");
		else this.age = age;
	}
	

}
