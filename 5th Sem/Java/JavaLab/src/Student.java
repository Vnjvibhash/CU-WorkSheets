public class Student extends Person {
	
	private double percentage;
	private String schoolname;
	
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double d) {
		if(d < 0.0)System.out.println("Percentage should not be negative.");
		else this.percentage = d;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		if(schoolname == "")System.out.println("College Name can not be Blank");
		else this.schoolname = schoolname;
	}
	
	

}
