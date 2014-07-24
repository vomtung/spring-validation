package entities;

public class Account {

	private String username;
	private String password;
	private String email;
	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Account(String username, String password, String email, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public Account() {
	}

}
