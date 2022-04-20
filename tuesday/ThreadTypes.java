package daily_updates.tuesday;

//Java code for thread creation by implementing
//the Runnable Interface
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
				Thread.sleep(100);		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
class Multi implements Runnable{
public void run(){
	 String s="Thread-15";
	 String s1=Thread.currentThread().getName();
	 if(s.equals(s1)){
	 if(Thread.currentThread().isDaemon()) {
		 System.out.println(true);}
	 else {
		 System.out.println(s1);
		 System.out.println(false);
	 }
		 System.out.println(Thread.currentThread().getState());
     try{
         System.out.println("Thread------"+Thread.currentThread().getId()+"-------is running.");
     }
     catch(Exception e)
     {
         System.out.println("cautch an error");
     }}
//     System.out.println(Thread.currentThread().getState());
//     System.out.println(Thread.currentThread().getName());
//     System.out.println(Thread.currentThread().getPriority());
//     System.out.println(Thread.currentThread().isAlive());
 }
 
}

//Main Class
class ThreadTypes{
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
		MultithreadingDemo object=new MultithreadingDemo();
			object.start();
		Thread object1=new Thread(new Multi());
		object1.start();
		}
	}
}
