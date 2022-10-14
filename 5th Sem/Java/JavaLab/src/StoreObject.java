
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
class User implements Serializable {

	private String firstName;
	private String lastName;
	private String email;
	private String password;

	public User(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}


public class StoreObject {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			FileOutputStream fos = new FileOutputStream(
					"R:\\VnjVibhash\\Assignments\\CU-Assignments\\5th Sem\\Java\\JavaLab\\src\\Input.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			System.out.println("Enter First Name :");
			String fname = in.next();
			System.out.println("Enter Last Name :");
			String lname = in.next();
			System.out.println("Enter Email-ID :");
			String email_id = in.next();
			System.out.println("Enter password :");
			String pass = in.next();
			User user = new User(fname, lname, email_id, pass);

			oos.writeObject(user);

			oos.flush();
			oos.close();

			user = null;

			FileInputStream fis = new FileInputStream(
					"R:\\\\VnjVibhash\\\\Assignments\\\\CU-Assignments\\\\5th Sem\\\\Java\\\\JavaLab\\\\src\\\\Input.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			user = (User) ois.readObject();

			System.out.println("First Name : " + user.getFirstName());
			System.out.println("Last Name : " + user.getLastName());
			System.out.println("Email : " + user.getEmail());
			System.out.println("Phone : " + user.getPassword());

			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
