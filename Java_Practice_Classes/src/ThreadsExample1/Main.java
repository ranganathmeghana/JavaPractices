package ThreadsExample1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello from the main thread");
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.setName("Meghana Thread");
		anotherThread.start();
		
		new Thread(){
			
			@Override
			public void run() {
				System.out.println("Hello from the anonymous thread");
				
				try {
					anotherThread.join(2000);
					System.out.println("Timeout");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("The join was interrupted");
				}
			}
		}.start();
		
		Thread thread= new Thread(new AnotherAnotherThread());
		thread.start();
		
		//anotherThread.interrupt();
		
		System.out.println("Hello again from the main thread");
	}

}
