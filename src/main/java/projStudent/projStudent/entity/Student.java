package projStudent.projStudent.entity;


public class Student {
	private long id;
	private String name;
	private int age;
	private int marks;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student {"+getId()+","+getName()+","+getAge()+","+getMarks()+"}";
	}
	
	
}
