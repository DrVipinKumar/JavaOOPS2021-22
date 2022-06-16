package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
class MyServer{
	BufferedReader brin=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br;
	OutputStream os;
	PrintWriter out;
	ServerSocket ss;
	Socket s;
	String line=null;
	String data=null;
	MyServer(){
		
       try {
		ss =new ServerSocket(9999);
		System.out.println("Lisening on port 9999...");
		s =ss.accept();
		if (s!=null) {
			System.out.println("Connected with Client");
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
			System.out.println("Client:"+line);
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

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyServer();
	}

}
 