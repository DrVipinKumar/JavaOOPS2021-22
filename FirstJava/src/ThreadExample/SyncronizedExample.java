package ThreadExample;
class Increment {
	int count;
	void  incrementValue() {
		synchronized(this){
			count++;
		}
				
		
		}
		

	
}

public class SyncronizedExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Increment in =new Increment();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=1000;i++)
				{
					
						in.incrementValue();
									
				}				
			}
			
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=1000;i++)
				{
					in.incrementValue();
				}				
			}
			
		});
        t1.start(); 
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count="+in.count);
	}

}
