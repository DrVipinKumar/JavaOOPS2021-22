package network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		URL url =new URL("https://www.kiet.edu:80/");
		System.out.println("Domain Name="+url.getHost());
		System.out.println("Port Name="+url.getPort());
		System.out.println("Path="+url.getPath());
		System.out.println("Protocol Name="+url.getProtocol());
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
