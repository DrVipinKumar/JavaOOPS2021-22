package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	   String info;
       //InputStreamReader in =new InputStreamReader(System.in);
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your name");
       		info=br.readLine();
			System.out.print(info);
    		
	}

}
