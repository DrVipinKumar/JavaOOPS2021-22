package network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
class MyClient{
	BufferedReader brin=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br;
	OutputStream os;
	PrintWriter out;
	Socket s;
	String line=null;
	String data=null;
	MyClient(){
		
       try {
		s =new Socket(InetAddress.getLocalHost(),9999);
		System.out.println("Connecting to port 9999...");
		if (s!=null) {
			System.out.println("Connected with Server");
			br =new BufferedReader(new InputStreamReader(s.getInputStream()));
			os =s.getOutputStream();
			out =new PrintWriter(os,true);
			readMessage();
			writeMessage();
			
			}
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}
	void readMessage() {
		
		Runnable r =()->{
		boolean check=true;
		while(check) {
		try {
			line =br.readLine();
			System.out.println("Server:"+line);
			if(line.equalsIgnoreCase("bye")) {
				check=false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}};
		new Thread(r).start();
	}
	void writeMessage() {
		
		Runnable r =()->{
		boolean check=true;
		while(check) {
		try {
				System.out.print("<<");
				data=brin.readLine();
				out.println(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		};
		new Thread(r).start();
	}
}

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClient();
	}

}
 