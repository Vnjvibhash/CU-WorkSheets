public class InheritanceBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		CollegeStudent cs = new CollegeStudent();
		
		teacher.setAge(40);
		teacher.setName("Manoj Sir");
		teacher.setSalary(50000.0);
		teacher.setSubject("Java");
		
		cs.setAge(23);
		cs.setMajor("CS");
		cs.setPercentage(92.0);
		cs.setSchoolname("Wipro");
		cs.setYear(1);
		
		System.out.println("The Age of Teacher is "+teacher.getAge());
		System.out.println("The Name of Teacher is "+teacher.getName());
		System.out.println("The Salary of Teacher is "+teacher.getSalary());
		System.out.println("The Subject of Teacher is "+teacher.getSubject());
		
		System.out.println("");
		
		System.out.println("The Age of Student is "+cs.getAge());
		System.out.println("The Major of Student is "+cs.getMajor());
		System.out.println("The Percentage of Student is "+cs.getPercentage());
		System.out.println("The College of Student is "+cs.getSchoolname());
		System.out.println("The Major year of Student is "+cs.getYear());
	
	}

}
