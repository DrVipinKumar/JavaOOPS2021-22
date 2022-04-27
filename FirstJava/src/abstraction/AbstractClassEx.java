package abstraction;
abstract class Area {
	void displayMsg() {
		System.out.println("This is display of Area Class");
	}
	abstract void getArea();
}
class Circle extends Area {
 int r;
    Circle(int r){
    	this.r=r;    }
	@Override
	void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is =%fl".formatted(3.14*r*r));
	}
	
}
 class Rectangle extends Area {
	 int l,b;
	    Rectangle(int l, int b){
	    	this.l=l;
	    	this.b=b;
	    	}
		@Override
		void getArea() {
			// TODO Auto-generated method stub
			System.out.println("Area of circle is =%d".formatted(l*b));
		}
		
	}
public class AbstractClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Circle a =new Circle(34);
             a.getArea();
             Rectangle r =new Rectangle(34,45);
             r.getArea();
	}

}
