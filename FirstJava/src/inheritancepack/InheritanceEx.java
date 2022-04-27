package inheritancepack;

class Area{
	int r;
	int l, b;
	void getArea() {
		System.out.println("Area of Circle=%fl".formatted(3.14*r*r));
	}
}
class Circle extends Area {
	void getCircleArea() {
		getArea();
	}
}
class Rectangle extends Area {
	
	Rectangle(int l, int b){
		super.l=l;
		super.b=b;
	}
	void getRectangleArea() {
		System.out.println("Area of Rectangle=%d".formatted(l*b));
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle a =new Circle();
        a.r=7;
        a.getCircleArea();
        Rectangle r =new Rectangle(34,56);
        r.getRectangleArea();
	}

}
