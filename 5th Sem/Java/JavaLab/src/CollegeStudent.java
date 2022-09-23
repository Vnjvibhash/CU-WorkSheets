public class CollegeStudent extends Student{
	
	private int year;
	private String major;
	
	
	public int getYear() {
		return year;
	}


	public void setYear(int i) {
		if( i <= 0 || i > 5)System.out.println("Invalid Academic year");
		else this.year = i;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		if(major == "")System.out.println("Major can not be Blank");
		else this.major = major;
	}


	

}
