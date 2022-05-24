package network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebsiteCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line=null;
           try {
			URL web =new URL("https://www.kiet.edu/");
			InputStream is =web.openStream();
			InputStreamReader isr =new InputStreamReader(is);
			BufferedReader br =new BufferedReader(isr);
			FileWriter fw =new FileWriter("src\\kiet.html");
			while((line=br.readLine())!=null) {
				fw.write(line);
			}
			System.out.println("URL converted into HTML File");
			fw.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
