package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sum{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int n1,n2;
	void getSum() {
		
		try {
			System.out.println("Enter number 1");
			n1=Integer.parseInt(br.readLine());
			System.out.println("Enter number 2");
			n2=Integer.parseInt(br.readLine());
			int s=n1+n2;
			System.out.println("Sum of 2 number=%d".formatted(s));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sum s =new Sum();
          s.getSum();
	}

}
