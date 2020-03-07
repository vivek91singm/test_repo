import java.util.ArrayList;
import java.util.List;

public class Filter 
{
	int id;
	String prodname;
	float price;

public Filter(int id, String prodname, float price) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.price = price;
	}


}
class Product1
{
	public static void main(String[] args)
	{
	List<Filter> fl=new ArrayList<Filter>();
	fl.add(new Filter(1, "mango", 30000));
	fl.add(new Filter(2, "orange", 40000));
	fl.add(new Filter(3, "water", 50000));
	fl.add(new Filter(4, "sugar", 60000));
fl.stream().filter(p ->p.price> 30000).forEach(System.out::println);
		
	}
}
