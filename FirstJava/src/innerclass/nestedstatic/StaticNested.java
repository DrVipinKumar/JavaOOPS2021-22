package innerclass.nestedstatic;
class Outer {
	int x=10;
	static int y=100;
	void display() {
		System.out.println("This is outer class");
	}
	static class Inner {
		void display() {
			System.out.println("This is nested static class");
			System.out.println(y);
		}
	}
}
public class StaticNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer o =new Outer();
       o.display();
       Outer.Inner i =new Outer.Inner();
       i.display();
	}

}
