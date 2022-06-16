package ThreadExample;

public class ThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Runnable r =new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread example 1");
			}       	 
        };
        Thread t1 =new Thread(r);
        t1.start();
        Thread t2 =new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread example 2");
			}       	 
        });
        t2.start();
        new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread example 3");
			}       	 
        }.start();
        Thread t4 =new Thread(()->{
        	   // TODO Auto-generated method stub
				System.out.println("Thread example 4");
		        });
        t4.start();
	}
}
