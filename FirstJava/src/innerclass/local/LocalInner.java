package innerclass.local;
class Outer {
	static int x=10;
	void message() {
		class Local{
			void specialMessage() {
				System.out.println("This is local class for special message");
				System.out.println(x);
			}
		}
		Local l =new Local();
		l.specialMessage();
		
	}
	
}
public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer o =new Outer();
          o.message();
	}

}
