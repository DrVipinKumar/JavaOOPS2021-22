package innerclass.anonymous;
interface Sum{
	void getSum(int n1, int n2);
		
}

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Sum s =new Sum() {
            	public void getSum(int n1, int n2) {
            		System.out.println("Sum =%d".formatted(n1+n2));
            	}
            	
            };
            s.getSum(23, 45);
            
	}

}
