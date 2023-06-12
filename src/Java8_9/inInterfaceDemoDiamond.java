package Java8_9;

public class inInterfaceDemoDiamond implements inInterfaceDemoDiamond1,inInterfaceDemoDiamond2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		inInterfaceDemoDiamond2.super.m1();
	}

//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		inInterfaceDemoDiamond1.super.m1();
//	}
	
	public static void main(String[] args) {
		inInterfaceDemoDiamond demoIMp =  new inInterfaceDemoDiamond();
		demoIMp.m1();;
	
	}

}
