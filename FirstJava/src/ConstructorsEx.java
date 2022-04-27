class Sum{
	
	private int num1, num2;
	Sum(){
		this(10,10);
		System.out.println("Use constructor like this Sum(23,45)");
	}
	Sum(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	Sum(Sum s){  //Copy Constructor
		this.num1=s.num1;
		this.num2=s.num2;
	}
	int getSum(int num1, int num2) {
		return num1+num2;
		
	}
   int getSum() {
		return num1+num2;
		
	}
}

public class ConstructorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sum s =new Sum(23,56);//Special method with name of as name of class is called Constructor. 
          //Sum() is default constructor. 
          //Constructor does not return any value;
          //Constructor is use to initialize of instance variable of class. 
          System.out.println("Sum=%d".formatted(s.getSum()));
          Sum s1 =new Sum(s);
          System.out.println("Sum=%d".formatted(s1.getSum()));
	}

}
