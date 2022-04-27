package abstraction;
interface Calculator {
	void getSum();
	double PI=3.14;
	default void getMultiply() {
		System.out.println("This is default method in interface");
	}
	static void getSubtraction() {
		System.out.println("This is static method in interface");
	}
}
class Sum implements Calculator {
  
	int n1, n2;
	Sum(int n1, int n2){
		this.n1=n1;
		this.n2=n2;
	}
	@Override
	public void getSum() {
		// TODO Auto-generated method stub
		System.out.println("Sum =%d".formatted(n1+n2));
	}
	
}

public class DefaultMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Sum s =new Sum(23,45);
           s.getSum();
           s.getMultiply();
           
           Calculator c =new Sum(23,45);
           c.getSum();
           c.getMultiply();
           Calculator.getSubtraction();
	}

}
