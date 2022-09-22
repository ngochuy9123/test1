package baseClass;

public abstract class Person {
	protected String name;
	protected String role;
	protected String phone;
	protected int age;
	protected String email;
	public Person(String name, String role, String phone, int age, String email) {
		super();
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.age = age;
		this.email = email;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long tinhLuong(int hours) {
		return 1;
	}
	
}
