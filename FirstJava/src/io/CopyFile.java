package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

class Copy{
	
	File fread =new File("src\\myimage.jpg");
	File fwrite =new File("src\\kiet.html");
	
	Copy(){
		try {
			//FileReader fr =new FileReader(fread);
			//FileWriter fw =new FileWriter(fwrite);
			FileInputStream fr =new FileInputStream(fread);
			FileOutputStream fw =new FileOutputStream(fwrite);
			int ch;
			while((ch=fr.read())!=-1) {
				fw.write(ch);
			}
			System.out.println("File Created");
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Copy();
	}

}
