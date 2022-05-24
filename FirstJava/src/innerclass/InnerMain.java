package innerclass;
class Outer {
	int x=10;
	static int y=100;
	void display() {
		System.out.println("This is outer class");
	}
	class Inner {
		void display() {
			System.out.println("This is normal or regular inner class");
			System.out.println(y);
		}
		
	}
}
public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Outer o =new Outer();
         o.display();
         Outer.Inner i =new Outer().new Inner();
         i.display();
	}

}
