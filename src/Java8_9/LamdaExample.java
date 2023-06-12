package Java8_9;

import java.util.function.BiConsumer;

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer, Integer>  biConsumer = ( a, b) -> System.out.println(a+b);
		
		//biConsumer(10,7);

	}
	
//	public void add(Integer a,Integer b) {
//		System.out.println(a+b);
//	}
	
}
