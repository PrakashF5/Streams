package Streams;

public class Student {
	int id;
	String name;
	String gender;
	char section;
	int age;
	
	public void setId(int id) {
		this.id=id;		
	}
	public int getId() {
		return id;		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setSection(char section) {
		this.section=section;
	}
	public char getSection() {
		return section;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public Student(int id, String name, String gender, char section, int age) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.section=section;
		this.age=age;
		
	}
	
	

}
