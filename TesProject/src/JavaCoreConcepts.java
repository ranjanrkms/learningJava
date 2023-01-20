
public class JavaCoreConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		float number2 = 10.128952248f;
		double number3 = 10.128952248d;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		
		
//Array==================================================
		
		String[] strName= {"Name1","Name2","Ranjan","Akshat"};
		for(int i=0; i<strName.length;i++) {
		System.out.println(strName[i]);
		}
		//Alternate--foreach(Java 8)
		for(String eachName:strName) {
			System.out.println(eachName);
		}
		
		//Call by value= when we pass an string to menthod
		//Call by reference= when we pass array as input to method(memory address is passed
		System.out.println("Array memory address:"+strName);	//A	
		//Array is not dynamic--> Memory loss or memory deficit
		
		
	}
	
	

}
