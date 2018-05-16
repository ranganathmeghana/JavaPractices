package ThreadsExample2;

public class Main {
	
	public static void main(String[] args) {
		
			Coundown coundown = new Coundown();
			CurrentThread currentThread = new CurrentThread(coundown);
			currentThread.setName("ThreadOne");
			CurrentThread currentThread2 = new CurrentThread(coundown);
			currentThread2.setName("ThreadTwo");
			currentThread.start();
			currentThread2.start();
			
	}
}
	
	class Coundown{
		
		private int i;
		public synchronized void countdownTill(){
			
			
			
//			switch (Thread.currentThread().getName()) {
//			case "ThreadOne": System.out.println("ONE");
//				
//				break;
//				
//			case "ThreadTwo": System.out.println("TWO");
//				
//				break;
//			case "ThreadThree": System.out.println("THREE");
//	
//				break;
//
//			default: System.out.println("DEFAULT");
//				break;
//			}
			
			for( i=0; i<10 ; i++){
				System.out.println(Thread.currentThread().getName() + " " +i);
			}
			
		}
}
	
class CurrentThread extends Thread{
		
		private Coundown countdown;
		
		public CurrentThread(Coundown coundown) {
			
			this.countdown=coundown;
		}
		
		@Override
		public void run() {
		
			countdown.countdownTill();
		}
	}
