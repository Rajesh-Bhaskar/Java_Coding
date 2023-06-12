package Java8_9;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.ArrayList;

public class pREDICATEFunctionalDemo {
	public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18); 
  
        // Calling Predicate method
        System.out.println(lesserthan.test(10)); 
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        
        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
  
        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
     // Java program to illustrate 
     // passing Predicate into function
        pred(10, (i) -> i > 7);

     // Java program to illustrate OR Predicate
        predicate_or();
     
     // Java program to illustrate AND Predicate
        predicate_and();
        
        
     // Java program to illustrate 
     // negate Predicate
        predicate_negate();
        
        
    }
	
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };
  
    public static void predicate_or()
    {
 
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
	
	static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }
    public static Predicate<String> hasLengthOf11 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };
  
    public static void predicate_and()
    {
        Predicate<String> nonNullPredicate = Objects::nonNull;
  
        String nullString = null;
  
        boolean outcome = nonNullPredicate.and(hasLengthOf11).test(nullString);
        System.out.println(outcome);
  
        String lengthGTThan10 = "Welcome to the machine";
        boolean outcome2 = nonNullPredicate.and(hasLengthOf11).
        test(lengthGTThan10);
        System.out.println(outcome2);
    }
    
    public static void predicate_negate()
    {
  
        String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                                + "film starring Kevin Durant";
  
        boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
        System.out.println(outcome);
    }
    class User
    {
        String name, role;
        User(String a, String b) {
            name = a;
            role = b;
        }
        String getRole() { return role; }
        String getName() { return name; }    
        public String toString() {
           return "User Name : " + name + ", Role :" + role;
        }
    }
    
}
