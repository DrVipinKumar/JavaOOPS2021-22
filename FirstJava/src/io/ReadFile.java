package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileRead{
	
	FileRead(){
		File f =new File("src\\Student.java");
		FileReader fr;
		//FileInputStream fr;
		int ch;
		try {
			
			fr =new FileReader(f);
			//fr=new FileInputStream(f);
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new FileRead();
	}

}
