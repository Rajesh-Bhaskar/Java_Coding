package Java8_9;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;  

public class CollectorsExample {
	
	//Java Collectors Example: Fetching data as a List
public static  void CollectorsExampleFetchingdataAsAList() {  
    List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    List<Float> productPriceList =   
            productsList.stream()  
                        .map(x->x.price)         // fetching price  
                        .collect(Collectors.toList());  // collecting as list  
    System.out.println(productPriceList);  
	}
	

public static void CollectorsExampleFetchingdataAsASET() {
    List<Product>productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    Set<Float>productPriceList =   
            productsList.stream()  
                        .map(x->x.price)         // fetching price  
                        .collect(Collectors.toSet());   // collecting as list  
    System.out.println(productPriceList);  
}

public static void CollectorsExampleUsingSumMethod() {
	List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    Double sumPrices =   
            productsList.stream()  
                        .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
    System.out.println("Sum of prices: "+sumPrices);  
    Integer sumId =   
            productsList.stream().collect(Collectors.summingInt(x->x.id));  
    System.out.println("Sum of id's: "+sumId);  
}


public static void CollectorsExampleAverage() {
	List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    Double average = productsList.stream()  
                     .collect(Collectors.averagingDouble(p->p.price));  
    System.out.println("Average price is: "+average);  
    //UsingSumMethod
    Double sumPrices =   
            productsList.stream()  
                        .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
    System.out.println("Sum of prices: "+sumPrices);  
    Integer sumId =   
            productsList.stream().collect(Collectors.summingInt(x->x.id));  
    System.out.println("Sum of id's: "+sumId);  
    
    
    // counting elemets
    Long noOfElements = productsList.stream()  
            .collect(Collectors.counting());  
System.out.println("Total elements : "+noOfElements);  
}
    public static void main(String[] args) {  
CollectorsExampleFetchingdataAsAList();
CollectorsExampleFetchingdataAsASET();
CollectorsExampleUsingSumMethod();
CollectorsExampleAverage();
    }  
}


class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    
}