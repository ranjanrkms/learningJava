
interface TestLambda {
public void demo();
 
}
public class LearningLambda {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLambda tl=new TestLambda() {
			
			@Override
			public void demo() {
				System.out.println("Statement 1");
				System.out.println("Statement 2");
				
			}
		};
		tl.demo();
		
		//can be used in functional type interface only(only 1 abstract method)
		TestLambda tl2=()->{System.out.println("Statement Lambda 1");
		System.out.println("Statement Lambda 2");
		};
		tl2.demo();
		
//Start Tread using lambda
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread line 1");
			}
		});
		thread.start();
		//Runnable is a functional interface having only run method
		Thread thread1=new Thread(()->System.out.println("Thread lambda line 1"));
		thread1.start();
	}

}
