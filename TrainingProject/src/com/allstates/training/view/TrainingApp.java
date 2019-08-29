package com.allstates.training.view;

import java.io.IOException;
import java.util.Scanner;

import com.allstates.training.Dao.CourseDao;
import com.allstates.training.pojos.Course;

public class TrainingApp {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Welcome to Training App \n 1.add course"
				+ "\n 2. Get Course \n "
				+ "3. Add Regular Student\n 4.Get RegularStudent ");
		
		CourseDao cdao=new CourseDao();
		int choice=sc.nextInt();
		if(choice==1) {
			Course c1=new Course();
			c1.setCourseId(sc.nextInt());
			c1.setCname(sc.next());
			
			cdao.addCourse(c1);
			System.out.println("Course added");
		}else if(choice ==2) {
			Course c2=cdao.getCourse();
			System.out.println(c2);
		}
		}while(true);
	}

}
