package com.allstates.training.view;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// charecter stream   byte stream
		//byte stream--- InputStream  OutputStream--- FileInputStream, FileOutputStream
			// BufferedInputStream, BufferedOutputStream
		//ByteArrayOutputStream--to write to multiple files
		//SequenceInputStream--te read from multiple files
		//LineNumberInputStream and LineNumberOutputStream
		//DataOutPutStream and DataInputStream--primiteve data
		//ObjectInputStream and ObjectOutputStream--read and write the objects
		//charecter stream---Reader Writer--FileReader  FileWriter
		/*try {
			Scanner sc=new Scanner(System.in);
			String s1=sc.next();
		FileOutputStream fos=new FileOutputStream("allstates.txt");
		fos.write(s1.getBytes());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}*/
	FileInputStream fis=null;
	BufferedInputStream bis=null;
	FileOutputStream fos=null;
		try{
		 fis=new FileInputStream("allstates.txt");
		 bis=new BufferedInputStream(fis);
		 fos=new FileOutputStream("allStatesnew.txt",true);
		int i;
		while((i=bis.read())!=-1) {
			fos.write(i);
		System.out.print((char)i);
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			fos.close();
			bis.close();
			fis.close();
		}
		
		
	}

}
