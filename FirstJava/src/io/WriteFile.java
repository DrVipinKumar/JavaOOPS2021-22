package io;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.attribute.AclEntry;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String data="This is my data for my file";
      
      try {
    	int i;
    	char c;
    	FileWriter fw =new FileWriter("src\\MyFile.txt");
		
    	for(i=0;i<data.length();i++)
    	{
    		c = data.charAt(i);
    		fw.write(c);
    	}
		
		fw.close();
		System.out.println("File Created");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
