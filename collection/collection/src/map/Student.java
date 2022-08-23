package map;

public class Student {
	int age;
	String name;
	String Hobby;
	public int getAge() {
		return age;
	}
	public Student(int age, String name, String department) {
		super();
		this.age = age;
		this.name = name;
		this.Hobby = department;
	}
	@Override
	public String toString() {
		return " [age=" + age + ", name=" + name + ", Hobby=" + Hobby + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Hobby;
	}
	public void setDepartment(String department) {
		this.Hobby = department;
	}

}
