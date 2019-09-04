package com.allstates.training.Dao;

import java.util.ArrayList;
import java.util.List;

import com.allstates.training.oops.Person;

public class PersonDao {
	List<Person> persons=null;
	
	public PersonDao(){
		persons=new ArrayList<>();
	}
	
	public void addPerson(Person person) {
		//System.out.println(person.getAdarNum());
		persons.add(person);
	}
	public List<Person> getAll(){
		return persons;
	}
	
	public void deletePerson(Person p) {
		persons.remove(p);
	}
	

}
