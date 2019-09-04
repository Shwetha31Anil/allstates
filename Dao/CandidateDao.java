package com.allstates.training.Dao;

import java.util.ArrayList;
import java.util.List;

import com.allstates.training.pojos.Candidate;

public class CandidateDao {
	public List<Candidate> candidates=null;
	
	public CandidateDao() {
		candidates=new ArrayList<>();
	}
	
	public List<Candidate> getAll(){
		candidates.add(new Candidate("Rohit","java","pune", 4));
		candidates.add(new Candidate("Nidhi","c++","bangalore", 6));
		candidates.add(new Candidate("Sereesh","java","hyderabad", 0));
		candidates.add(new Candidate("Rahul","c++","pune", 14));
		candidates.add(new Candidate("Gourav","java","bangalore", 0));
		candidates.add(new Candidate("Budhil","c++","pune", 23));
		candidates.add(new Candidate("Shubam","java","pune", 4));
		candidates.add(new Candidate("Baishali","sql","pune", 4));
		candidates.add(new Candidate("Divya","sql","bangalore", 23));
		return candidates;
	}
	

}
