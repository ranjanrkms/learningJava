
public class MultiThreading {

	public static void main(String[] args) {
		
		int i=1;
		while( i<10) {
			
			System.out.println("1st Main Thread works in every 1 sec");
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			i++;
		}
		
		Thread thread =new Thread(()->{
			 int j=1;
			while( j<10) {
				
				System.out.println("Thread 1 works in every 5 sec");
				 try {
			            Thread.sleep(5000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				j++;
			}
			
		});
		thread.start();

		Thread thread2 =new Thread(()->{
			 int k=1;
			while( k<10) {
				
				System.out.println("Thread 2 works in every 3 sec");
				 try {
			            Thread.sleep(3000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				k++;
			}
			
		});
		thread2.start();
		
		 i=1;
		while( i<10) {
			
			System.out.println("Main Thread works in every 2 sec");
			 try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			i++;
		}

		
	}

}
