package ThreadExample;
class Hi extends Thread {
	
	public void run()  {
		for(int i=0;i<5;i++)
		{
			System.out.println("hi="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class Hello extends Thread {
	Hello(){
		super("Hello Thread");
	}
	public void run()  {
		for(int i=0;i<5;i++)
		{
			System.out.println("hello="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//     System.out.println(Thread.currentThread().getName());
		Hi t1=new Hi();
		Hello t2 =new Hello();
		t1.setName("HI Thread");
		t1.start();
		t2.start();
		System.out.println("Bye");
				
	}

}
  