package com.allstates.training.view;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.allstates.training.Dao.CourseDao;
import com.allstates.training.pojos.Course;
import com.allstates.training.pojos.DistanceStudent;
import com.allstates.training.pojos.RegularStudent;
import com.allstates.training.pojos.Trainer;

public class TrainingView {
	public static void main(String args[]) throws ParseException, IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Welcome to TrainingApp"
				+ "1. Create Trainer\n"
				+ "2. Create Course\n"
				+ "3. Create Student"
				+ "4. Exit");
		int choice=sc.nextInt();
		CourseDao cdao=new CourseDao();
		Course c1=new Course();
		Trainer t1 = new Trainer();
		if(choice==1) {
			System.out.println("Enter trainer id and Name");
			t1.setTrainerId(sc.nextInt());
			t1.setTrainerName(sc.next());
			System.out.println("Trainer created \n"+t1);
		}else if(choice==2) {
			System.out.println("enter the courseid , name");
			c1.setCourseId(sc.nextInt());
			c1.setCname(sc.next());
			cdao.addCourse(c1);
			System.out.println("do you want to allocate trainer for this course?");
			char c=sc.next().charAt(0);
			if(c=='y') {
			  Trainer t2=new Trainer(sc.nextInt(),sc.next());
			c1.setTrainer(t2);
			System.out.println("course created with trainer"+c1.getTrainer());}
			else System.out.println("course is created without trainer");	
		}else if(choice==3) {
			System.out.println("1. Regular Student \n 2. Distance");
			int op=sc.nextInt();
			if(op==1) {
				System.out.println("enter id");
				String id="ST"+sc.next();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter phnum");
				long ph=sc.nextLong();
				System.out.println("enter dob dd-MM-yyyy");
				String dob=sc.next();
				SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
				Date d1=sd.parse(dob);
				RegularStudent rStudent=new RegularStudent(id, name, ph, d1);
				System.out.println("Student is created \n"
						+ "Do you want to added to course y/n");
				char c2=sc.next().charAt(0);
				if(c2=='y') {
					  Trainer t2=new Trainer(sc.nextInt(),sc.next());
					c1.setTrainer(t2);
					System.out.println("course created with trainer"+c1.getTrainer());}
					else System.out.println("course is created without trainer");	
			
			}else if(op==2) {
				System.out.println("enter id");
				String id="DST"+sc.next();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter phnum");
				long ph=sc.nextLong();
				System.out.println("enter dob dd-MM-yyyy");
				String dob=sc.next();
				SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
				Date d1=sd.parse(dob);
				DistanceStudent dStudent=new DistanceStudent(id, name, ph, d1);
				System.out.println("Student created \n Do you want to add the courses?");
				Course java=new Course(12,"Java");
				Course c=new Course(13,"C");
				Course[] courses=new Course[2];
				courses[0]=java;
				courses[1]=c;
				dStudent.setCourse(courses);
				System.out.println(dStudent);
			}else {
				System.out.println("invalid");
			}
		}else if(choice==4) {
			System.out.println("Thank You");
			System.exit(0);
		}else {
			System.out.println("Invalid option");
		}
	}while(true);
	}

}
