package LamdaExpression;
@FunctionalInterface
interface Addition{
	
	int sum(int n1, int n2);
}
public class LamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Addition a =(num1, num2)->{
           int s = num1+num2;
           //System.out.println("Sum =%d ".formatted(s));
           return s;
           };
           System.out.println("Sum ="+a.sum(23,45));
	}

}
