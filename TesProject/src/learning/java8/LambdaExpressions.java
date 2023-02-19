package learning.java8;

interface FnInterface1{
	public void printText();
}
@FunctionalInterface //2 methods are not allowed
interface FnInterface2{
	public void oneInput(int a);
	//public void oneInput1(int a);
}
interface FnInterface3{
	public int mathOperation(int a,int b);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		//Anonymous inner class- unlike Lambda, this can implement multiple methods in interface
		
		FnInterface1 anonymObj= new FnInterface1() {
			
			@Override
			public void printText() {
				
				System.out.println("This is an Anonymous inner class");
			}
		};
			
		anonymObj.printText();
		
		System.out.println("*****************************************************");
		
		
		FnInterface1 objRef=()->System.out.println("This is an lambda expression having no input");
		objRef.printText();
		
		FnInterface1 objRef1=()->{
			System.out.println("User curly braces for multiple lines of codes inside lambda expression");
			System.out.println("Program as data-same method printText can behave differently ");
			};
		objRef1.printText();
		
		System.out.println("*****************************************************");
		
		FnInterface2 objRef3=(tmp)->System.out.println("Input value passed is "+tmp);
		objRef3.oneInput(3);
		
		FnInterface2 objRef4=tmp->System.out.println("Square of number is "+(tmp*tmp));
		objRef4.oneInput(3);
	
        System.out.println("*****************************************************");
		
		FnInterface3 objRef5=(a,b)->a+b; //Return keyword is optional for 1 line code
		int tmp= objRef5.mathOperation(3,5);
		System.out.println(objRef5.mathOperation(3,5));
	
	}

}
