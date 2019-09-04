package com.allstates.training.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import com.allstates.training.oops.Department;
import com.allstates.training.oops.Person;

import java.util.LinkedList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		
		List<String> li=new LinkedList<>();
		li.add("samhitha");
		li.add(new String("Nidhi"));
		li.add(0,new String("Sireesh"));
		li.add(2, new String("Prateek"));
		li.add(new String("Rahul"));
		//li.add(new Integer(22121));
		//li.add(35643);
		
		System.out.println(li);
		List<String> li2=new ArrayList<>();
		li2.addAll(li);
		li2.add("Budhil");
		li2.add(2,"Gaurav");
		li2.add("Rajath");
		
		System.out.println(li2);
		//li2.remove(7);
		//java 8
		li2.removeIf(n-> (n.charAt(0) == 'R'));
		
		
		System.out.println(li2);
		/*System.out.println("after removal");
		li2.retainAll(li);
	//	li2.removeAll(li);
		System.out.println(li2);*/
	//java 8
		li2.forEach((n)->System.out.println(n.substring(0, 3)));
		
		List<Department> deps=new ArrayList<>();
		deps.add(new Department(123, "Developemnt"));
		deps.add(new Department(124, "Production"));
		deps.add(new Department(111, "Sales"));
		
		Collections.sort(deps,
				(d1,d2)->d1.getDname().compareTo(d2.getDname()));
		
		deps.forEach((d)->System.out.println(d.getDname()));
		
		
		
		
	}

}
