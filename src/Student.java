
public class Student 
{
public Student(String name, String address, int age, int rollno) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.rollno = rollno;
	}
String name;
String address;
int age;
int rollno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
}
