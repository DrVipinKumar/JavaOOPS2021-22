//import mul.*;
class Sum{
     void getSum(int n1, int n2)
	 {
	 System.out.println("Sum of two number="+(n1+n2));
	 }
}
public class Calculator{
public static void main(String args[])
{
   Sum s =new Sum();
   s.getSum(34,56);
   Subtract sub =new Subtract();
   sub.getSub(314,56);
   mul.Multiply m =new mul.Multiply();
   m.getMultiply(314,56);
   div.Division d =new div.Division();
   d.getDivision(34,5);

}

}