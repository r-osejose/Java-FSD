package Threading;

public class Running_Thread extends Thread{

	public static void main(String[] args) {
		System.out.println("MAIN METHODS");
		Running_Thread obj = new Running_Thread();
		obj.setName("\nTHREAD NAME");
		obj.start();
		
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int numThreads = currentGroup.activeCount();
		Thread[]IstThreads = new Thread[numThreads];
		currentGroup.enumerate(IstThreads);
		for(int i =1;i<numThreads;i++)	
		{
			System.out.println("Number of thread: "+i+" "+IstThreads[i].getName());
		}
		Thread currentThread = Thread.currentThread();
		System.out.println("Current running thread : "+currentThread);
	}

}
