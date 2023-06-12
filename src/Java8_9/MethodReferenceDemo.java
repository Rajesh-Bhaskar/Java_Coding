package Java8_9;

public class MethodReferenceDemo {
public static void main(String[] args) {
	
	//:: refer 
//	FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testImplemetation;
//	functionalInterfaceDemo.singleAbstractMethod();
	// lamda expression 
	
	FunctionalInterfaceDemo f = () -> System.out.println("welcome to implemeation");
	f.singleAbstractMethod();
	
}
}

//class Test{
//	public static void testImplemetation() {
//		System.out.println("welcome to implemeation");
//		
//	}
//}