package io;

import java.io.*;
import java.util.Scanner;

class SampleFile
{
	public static void main(String [] st) throws IOException
	{
		int i;
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Scanner sc=new Scanner(System.in);
		String ch;
		int data;
		try
		{
			
			fout= new FileOutputStream("abc.txt");
			ch=sc.nextLine();
			for(int j=0;j<ch.length();j++)
			{	
			fout.write(ch.charAt(j));
			}
		}catch(IOException e)
		{
			System.out.println("\nI/O Error: "+e);
		}
		finally{
			try{
				if(fout!=null)
					fout.close();
				} catch(IOException o)
				{
					System.out.println("\nI/O Error: "+o);
				}
		}
		try
		{
			
			fin= new FileInputStream("abc.txt");
			while((data=fin.read())!=-1)
			{	
			
			System.out.print((char)data);
			
			}
		}catch(IOException e)
		{
			System.out.println("\nI/O Error: "+e);
		}
		finally{
			try{
				if(fin!=null) fin.close();
				} catch(IOException o)
				{
					System.out.println("\nI/O Error: "+o);
				}
		}

}
}
