class GreaterNumber {
	int num1=10;//instance variable, properties
	int num2=20;
	void checkGreater() {  //behavior   //method
		if (num1>num2)
		{
			System.out.println("Num1 is greater");
		} else 
		{
			System.out.println("Num 2 is greater");
		}
	}
}

public class Greater {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterNumber gn;   //Object declaration 
	    gn=new GreaterNumber();   //Object Instantiation 
		gn.checkGreater();
		GreaterNumber gn1 =new GreaterNumber();
		gn1.num1=30;
		gn1.num2=20;
		gn1.checkGreater();
		
		new GreaterNumber().checkGreater();//anonymous object
		
		
        
	}

}
