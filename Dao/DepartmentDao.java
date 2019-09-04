package com.allstates.training.Dao;
import java.util.List;
import java.util.Set;

import com.allstates.training.oops.Department;

import java.util.ArrayList;
import java.util.TreeSet;

public class DepartmentDao {
	//List<Department> departments=null;
	Set<Department> departments=null;
	public DepartmentDao() {
		departments=new TreeSet<>();
	}
	
	public void addDepartment(Department de) {
		departments.add(de);
	}
	
	public void removeDepartment(int index) {
		departments.remove(index);
	}
	
	public Set<Department> getAll(){
		
		return departments;
	}

}
