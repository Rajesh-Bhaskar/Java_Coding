package Java8_9;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	   public static void main (String args[]) {
	   	BiConsumer<String, String> biConsumer = (a,b) -> { 
	   	   System.out.println("x: "+ a +", b: "+b);
	   	};
	        biConsumer.accept("Java8", "Implementation");
	   		
	   	BiConsumer<Integer, Integer> add = (a,b) -> {
	           System.out.println("Addition is: "+(a+b));
	   	};
	   		
	   	BiConsumer<Integer, Integer> subtract = (a,b) -> {
	   	   System.out.println("Subtraction is: "+(a-b));
	   	};
	   	addition.andThen(subtraction).accept(2,1);		
	   }
	}
