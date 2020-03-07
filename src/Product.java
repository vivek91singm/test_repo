import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 class Product 
{
	int id;
	String prodname;
	float price;
public Product(int id, String prodname, float price) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.price = price;
	}
}
class StreamExapmle
{
	public static void main(String[] args)
	{
		List<Product> prodlist=new ArrayList<Product>();
		
	prodlist.add(new Product(2, "abc", 60000f));
	prodlist.add(new Product(3, "abcd", 70000f));
	prodlist.add(new Product(4, "abcde", 80000f));
	prodlist.add(new Product(5, "abcfg", 90000f));
	List<Float> li= prodlist.stream().filter(p ->p.price> 30000).map(pm ->pm.price).collect(Collectors.toList());
	System.out.println(prodlist);
		
	}
}	
	

