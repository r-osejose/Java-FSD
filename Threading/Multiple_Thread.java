package Threading;

class ThreadTest extends Thread{
	private Thread thread;
	private String threadName;
	
	ThreadTest(String msg){
		threadName = msg;
		System.out.println("CREATING THREAD: "+threadName);
	}
	public void run()
	{
		System.out.println("RUNNING THREAD: "+threadName);
		try {
			for(int i=0;i<5;i++) {
				System.out.println("THREAD : "+threadName+","+i);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception in thread : "+threadName);
		}
			System.out.println("THREAD : "+threadName+" Continue...");
		}
		public void start()
		{
			System.out.println("START METHOD : "+threadName);
			if(thread == null) {
				thread = new Thread(this,threadName);
				thread.start();
			}
		}
}
public class Multiple_Thread {

	public static void main(String[] args) {
		ThreadTest thread1 = new ThreadTest("First Thread");
		thread1.start();
		ThreadTest thread2 = new ThreadTest("Second Thread");
		thread2.start();
	}

}
