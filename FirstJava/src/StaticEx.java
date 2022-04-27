class SumN{
	static int num1, num2;
	{
		System.out.println("I am in this block");
	}
	static {
		System.out.println("I am in static block");
	}
	SumN(){
		System.out.println("I am in constructor");
	}
	static void getSum() {
		System.out.println("Sum=%d".formatted(num1+num2));
	}
	
}
public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumN.num1=12;
		SumN.num2=34;
		SumN.getSum();
		SumN s=new SumN();
		s.num1=23;
		s.num2=67;
		s.getSum();
		SumN.getSum();
		SumN s1=new SumN();
		s1.num1=56;
		s1.num2=67;
		s1.getSum();
		

	}

}
