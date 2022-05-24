package io;

import java.io.File;

public class DirFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileType;
        File dir =new File("src\\");
        File files[]=dir.listFiles();
        System.out.println("\tS.No\tFile Name\t\tFile Type\t\n");
        int i=0;
        for(File file : files) {
        	i++;
        	if(file.isFile()) {
        		fileType="File";
        	} else 
        	{
        		fileType="Directory";
        	}
        	
        	System.out.println("\t"+i+"\t"+file.getName()+"\t\t"+fileType+"\t");
        }
	}

}
