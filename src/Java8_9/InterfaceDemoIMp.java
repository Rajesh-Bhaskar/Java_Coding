package Java8_9;

public class InterfaceDemoIMp implements InterfaceDemo{
		@Override
	public void printNmae() {
		// TODO Auto-generated method stub
		//InterfaceDemo.super.printNmae();
		
		System.out.println("agalla namde agbeku ");
	}
	
	public static void main(String[] args) {
		InterfaceDemoIMp demoIMp =  new InterfaceDemoIMp();
		demoIMp.printNmae();
	
	}



}
