package ExceptionHandling;

class Age{
	
	void checkAge(int age) throws Exception {
		if ((age<=10) || (age>60)) {
			throw new Exception("You are not valid");
		} else {
			System.out.println("Yout are valid");
		}
	}
}


public class ThrowsThrowEx {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
          Age a =new Age();
          try {
			a.checkAge(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
