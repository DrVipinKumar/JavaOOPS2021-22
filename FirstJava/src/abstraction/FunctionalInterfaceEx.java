package abstraction;
@FunctionalInterface
interface Message {
	void getMessage();
	//void getMSG();
}
//class MessageClass implements Message{
//
//	@Override
//	public void getMessage() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Message m =()->System.out.println("This is lambda expression");
         m.getMessage();
	}

}
