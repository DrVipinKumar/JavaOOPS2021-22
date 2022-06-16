package ThreadExample;

class RHi implements Runnable {
	
	public void run()  {
		for(int i=0;i<5;i++)
		{
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			System.out.println("hi="+Thread.currentThread().getPriority());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
}
class RHello implements Runnable {
	
	public void run()  {
		for(int i=0;i<5;i++)
		{
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			System.out.println("hello="+Thread.currentThread().getPriority());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
public class ThreadRunnableEx {
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
//	     System.out.println(Thread.currentThread().getName());
			RHi tt1=new RHi();
			RHello tt2=new RHello();
			Thread t1=new Thread(tt1,"Hi Thread");
			Thread t2=new Thread(tt2,"Hello Thread");
			t1.start();
			t2.start();
			t1.join();
			t2.join(); 
			System.out.println(Thread.MAX_PRIORITY);
			System.out.println("Bye");
					
		}

	}
	  


