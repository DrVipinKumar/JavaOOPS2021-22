package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FileReadLine {
	 FileReadLine(){
		 File f =new File("src\\Welcome.java");
		 
		 String line;
		 try {
			 FileInputStream fr=new FileInputStream(f);
			 InputStreamReader isr =new InputStreamReader(fr);
			BufferedReader br =new BufferedReader(isr);
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
public class ReadFileWithLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new FileReadLine();
	}

}
