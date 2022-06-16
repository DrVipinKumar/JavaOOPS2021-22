package genericex;
class A{
	void getMessage() {
		System.out.println("This is A Class");
	}
}
class B extends A{
	void getMessage() {
		System.out.println("This is B Class");
	}
}
class BoundTest<T extends A>{
	T obj;
	BoundTest(T obj){
		this.obj=obj;
	}
	void message() {
		obj.getMessage();
	}
}

public class BoundTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a =new A();
			BoundTest<A> bt=new BoundTest<A>(a);
			bt.message();
			B b  =new B();
			BoundTest<B> bt1=new BoundTest<B>(b);
			bt1 .message();
	}

}
