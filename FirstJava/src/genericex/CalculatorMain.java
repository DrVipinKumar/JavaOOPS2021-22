package genericex;
class Calculator<T,N>{
	T num1;
	N num2;
	Calculator(T num1, N num2){
		this.num1=num1;
		this.num2=num2;
	}
	void  getSum() {
		if (num1 instanceof Number && num2 instanceof Number) {
			System.out.println(""
					+ "Sum ="+(Double.parseDouble(num1.toString())+
							Double.parseDouble(num2.toString())));
		} else {
			System.out.println(""
					+ "Concatination ="+num1.toString()+num2.toString());
		}
	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Calculator<Integer,Integer> c1=new Calculator<Integer,Integer>(12,34);
             c1.getSum();
             Calculator<Integer,Double> c2=new Calculator<Integer,Double>(12,34.34);
             c2.getSum();
             Calculator<String,String> c3=new Calculator<String,String>("Welcome to"," Java Generic World");
             c3 .getSum();
	}

}
