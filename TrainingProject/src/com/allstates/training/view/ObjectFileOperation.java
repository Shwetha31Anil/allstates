package com.allstates.training.view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.allstates.training.oops.Department;

public class ObjectFileOperation {

	public static void main(String[] args)throws IOException
	,ClassNotFoundException {
		Department  d1=new Department(124, "Development","bangalore");
		FileOutputStream fos=new FileOutputStream("department.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("done");
		
		//read object from the file
		FileInputStream fis=new FileInputStream("department.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Department d2=(Department)ois.readObject();
		System.out.println(d2);
		
	}

}
