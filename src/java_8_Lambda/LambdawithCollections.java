package java_8_Lambda;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


class Product{
	int id;  
    String name;  
    float price;  
    Product(int id,String name,float price)
    {
    	super();
    	 this.id = id;  
         this.name = name;  
         this.price = price; 
    }
}

public class LambdawithCollections {
	


	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f)); 
        
        // using lambda to filter data 
        List<Product> filtered_data=list.stream().filter(p->p.price>20000).collect(Collectors.toList());
       
        
       // List<Product> listfinal=filtered_data.collect(Collectors.toList());
       
        for(Product iter:filtered_data)
        {
        	System.out.println(iter.id);
        }
        
        //filtered.forEach(x->System.out.println(x.name));
        
        List<Product> updated=list.stream()
        		.map(n->
        		{if(n.id==2)
        		n.name="Oneplus";
        		return n;
        		})
        		.collect(Collectors.toList());
        updated.forEach(n->System.out.println(n.name));

	}

}
