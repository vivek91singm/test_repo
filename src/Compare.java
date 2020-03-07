import java.util.ArrayList;
import java.util.Comparator;

public class Compare 
{
public static void main(String[] ars)
{
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student("nilu", "bangalore", 22, 50));
	al.add(new Student("nilu", "mumbai", 23, 51));
	al.add(new Student("nilu2", "patna", 24, 53));
	al.add(new Student("nilu3", "delhi", 25, 55));

	Comparator<Student> st=Comparator.comparing(Student::getName);
	System.out.println("sorting on name basis");
	for(Student st1:al)
	{
		System.out.println(st1.name+ " "+st1.address+" "+st1.rollno+" "+st1.age);
	}
	Comparator<Student>st2=Comparator.comparing(Student::getAge);
	System.out.println("sorting based on age");
	for(Student st3:al)
	{
		System.out.println(st3.name+ " "+st3.age+" "+st3.rollno+" "+st3.address);	
	}
			
}
}
