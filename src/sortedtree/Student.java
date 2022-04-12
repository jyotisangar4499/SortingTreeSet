package sortedtree;

public class Student {
	int rollno;
	String name;
	String city;
	public Student() {
		super();
	}
	public Student(int rollno, String name, String city) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + rollno + ", name=" + name + ", city=" + city + "]";
	}
	

}