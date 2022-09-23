public class Teacher extends Person {
	
	private double salary;
	private String subject;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary < 0)System.out.println("Salary should not be negative");
		else this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if(subject == "")System.out.println("Subject can not be Blank");
		else this.subject = subject;
	}

}
