package demo.pattern.builder;

public class User {

	private final String username;
	private final String password;
	private final String role;
	private final String email;
	private final String phone;
	private final int age;

	private User(Builder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.role = builder.role;
		this.email = builder.email;
		this.phone = builder.phone;
		this.age = builder.age;
	}

	public static class Builder {

		private final String username; // mandatory
		private String password; // optional
		private String role;
		private String email;
		private String phone;
		private int age;

		public Builder(String username) {
			this.username = username;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder role(String role) {
			this.role = role;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User (username : " + username + ", password : " + password + ", role : " + role + ", email : " + email
				+ ",  phone : " + phone + ", age : " + age + ")";
	}

	public static void main(String[] args) {
		User user = new User.Builder("Abhishek").password("test").age(28).build();
		System.out.println(user);
	}

}
