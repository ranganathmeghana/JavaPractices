package ThreadsExample1;

public class AnotherThread extends Thread{


	@Override
	public void run() {
	 System.out.println("Hello from" + " " + currentThread().getName());

	 try{
		 Thread.sleep(20000);
	 }
	 catch(InterruptedException e){
	 System.out.println("Interruped by other thread");
	 return;
	 }
	 
	 
	 System.out.println("Completed sleeping");
	}
}
