package Java8_9;

import java.util.function.BiFunction;

public class MethodReference {
//	Java provides a new feature called method reference in Java 8. 
//	Method reference is used to refer method of functional interface. 
//	It is compact and easy form of lambda expression. 
//	Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference. 
//	In this tutorial, we are explaining method reference concept in detail.
//	There are following types of method references in java:
//
//		Reference to a static method.
//		Reference to an instance method.
//		Reference to a constructor.

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();

		// we are using predefined functional interface Runnable to refer static method.
		Thread t2 = new Thread(MethodReference::ThreadStatus);
		t2.start();

		// we are using BiFunction interface and using it's apply() method.
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);

		// we have defined and overloaded three add methods.
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic1::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic1::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic1::add;
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}

interface Sayable {
	void say();
}

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

class Arithmetic1 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}
