package com.allstates.training.Dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.allstates.training.pojos.Course;

public class CourseDao {
	
	public void addCourse(Course c)throws IOException {
		FileOutputStream fos=new FileOutputStream("course.txt",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
		fos.close();
	}
	
	public Course getCourse()throws IOException,ClassNotFoundException {
		FileInputStream fis=new FileInputStream("course.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Course c1 = (Course)ois.readObject();
		ois.close();
		fis.close();
		return c1;	
	}
}
