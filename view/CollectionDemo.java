package com.allstates.training.view;

import java.util.Set;
import java.util.TreeSet;

import com.allstates.training.oops.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
public class CollectionDemo {

	public static void main(String[] args) {
		
		Set<Integer> sets=new TreeSet<>();
		sets.add(123);
		sets.add(678);
		sets.add(234);
		sets.add(111);
		
		System.out.println(sets);
		// restrict for duplicates--- override equals and hashcode
		// for sorting --implements Comparable;
		//Set<Person> persons=new LinkedHashSet<>();
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("9234","Divya"));
		persons.add(new Person("3234","Rohit"));
		persons.add(new Person("7234","Rajath"));
		persons.add(new Person("8234","Ajith"));
		persons.add(new Person("8734","Manu"));
		for(Person p:persons) {
			System.out.println(p.getAdarNum());
		}
		
		Collections.sort(persons);
		System.out.println("after sort");
		for(Person p:persons) {
			System.out.println(p.getAdarNum());
		}
		
		System.out.println("Based on names");
		Collections.sort(persons,
				(p1,p2)-> p1.getPname().compareTo(p2.getPname()));
		for(Person p:persons) {
			System.out.println(p.getAdarNum()+" "+p.getPname());
		}

	}

}
