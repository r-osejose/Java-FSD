package Threading;

public class Thread_Priority extends Thread {
	public void run() {
		System.out.println("run() method");
		String threadName = Thread.currentThread().getName();
		Integer threadPrio = Thread.currentThread().getPriority();
		System.out.println(threadName+" has priority "+threadPrio);
		
	}

	public static void main(String[] args) throws InterruptedException{
		Thread_Priority t1 = new Thread_Priority();
		Thread_Priority t2 = new Thread_Priority();
		Thread_Priority t3 = new Thread_Priority();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
