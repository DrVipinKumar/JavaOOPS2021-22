package abstraction;
interface A {
	double PI=3.14;
	public abstract void displayA();
	void msg();
	
}
interface B extends A {
	double PI=3.14;
	public abstract void displayB();
	
}

class DisplayA implements A, B { 

	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		System.out.println("I am in Display A Class");
	}

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("I am in Display B Class");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DisplayA a =new DisplayA(); 
         a.displayA();
        
         
	}

}
