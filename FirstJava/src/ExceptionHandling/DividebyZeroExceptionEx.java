package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class Division {
	int num1, num2;
		
	void getDivision()  {
		Scanner in =new Scanner(System.in);
		try {
			System.out.println("hello");
			System.out.println("Enter number 1");
			num1=in.nextInt();
			System.out.println("Enter number 2");
			num2=in.nextInt();
		int div =num1/num2;
		System.out.println("Division of 2 number is =%d".formatted(div));
		}catch(ArithmeticException | InputMismatchException ae) {
			System.out.println(ae.getMessage());
		}finally {
			System.out.println("This is finally block");
		}
//		}catch(InputMismatchException ime) {
//			System.out.println("Please Insert Integer Value");
//		}
		System.out.println("Ent of getDivision() method");
	}
}
public class DividebyZeroExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of main() method");
            Division d =new Division();
            d.getDivision();
            System.out.println("End of main() method");
	}

}
