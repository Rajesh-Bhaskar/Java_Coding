package Java8_9;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
  void singleAbstractMethod();
  
  //void singleAbstractMethod();
  
  default void printNmae() {
	  System.out.println("welocme");
  }
  
  default void printNmae2() {
	  System.out.println("welocme");
  }
  
  default void defaultMethodDemo1(){
  //Method body
  }
  default void defaultMethodDemo2(){
  //Method body
  }	  
}

