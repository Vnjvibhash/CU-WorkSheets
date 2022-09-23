public class Author {
	
	private String authorname = "";
	private String email = "";
	private char gender = ' ';

	/**
	 * @param name
	 * @param email
	 * @param gender
	 */
	public Author(String name, String email, char gender) {
		super();
		this.authorname = name;
		this.email = email;
		this.gender = gender;
	}

	/**
	 * @return the authorname
	 */
	public String getAuthorname() {
		return authorname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


}

