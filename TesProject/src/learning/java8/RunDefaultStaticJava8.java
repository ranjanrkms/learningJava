package learning.java8;

public class RunDefaultStaticJava8 implements InterfaceDefaultMethodA, InterfaceDefaultMethodB {

	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		System.out.println("This method is implemened inside this class");
	}

	//Need to override duplicate method to avoid diamond error as per below
	@Override
	public void java8Defaultmethod() {
		// TODO Auto-generated method stub
		InterfaceDefaultMethodB.super.java8Defaultmethod();
	}
	
	public static float valueOfPi(){
		System.out.println("This is not from Interface");
		return 3.144444444f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		RunDefaultStaticJava8 test=new RunDefaultStaticJava8();
	System.out.println("***********************default Method in Interface*************************************");

		test.testMethod();
		test.java8Defaultmethod();
		
	System.out.println("***********************static Method in Interface*************************************");
	System.out.println(InterfaceDefaultMethodA.valueOfPi());
	
	//Override is not allowed for static but same name method can be created. 
	System.out.println(test.valueOfPi());
	System.out.println(RunDefaultStaticJava8.valueOfPi());
		
		
		
	}


	

}
