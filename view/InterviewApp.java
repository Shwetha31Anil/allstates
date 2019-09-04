package com.allstates.training.view;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.allstates.training.Dao.CandidateDao;
import com.allstates.training.pojos.Candidate;

public class InterviewApp {

	public static void main(String[] args) {
		System.out.println("1.ListCandidates based on experience");
		CandidateDao candidateDao=new CandidateDao();
		List<Candidate> candidates=candidateDao.getAll();
		candidates.forEach((c)->System.out.println(c));
		System.out.println("-------------bangalore------------");
		for(Candidate can:candidates) {
			if(can.getCity().equals("bangalore")) {
				System.out.println(can);
			}
		}
		// stream api
		System.out.println("-------Pune people-----------");
		List<Candidate> puneCandidates=candidateDao.getAll()
								.stream()
								.filter((can)->can.getCity().equals("pune"))
								.collect(Collectors.toList());
		puneCandidates.forEach((c)->System.out.println(c));

		//senior most
		//select ename from candidate where years =
		//(select max(years) from candidate);
		
		Integer maxYear=candidateDao.getAll()
						.stream()
						.map((c)->c.getYearsOfExperience())
						.max(Integer::compare)
						.get();
		
		List<Candidate> seniours=candidateDao.getAll()
								.stream()
								.filter((c)->c.getYearsOfExperience()==maxYear)
								.collect(Collectors.toList());
		
		for(Candidate c:seniours) {
			System.out.println(c);
		}
						
		//technical and count   c++ 1 2 2 java  sql 3453
		
		Map<String, List<Candidate>> cans=candidateDao.getAll()
		.stream()
		.collect(Collectors.groupingBy(c->c.getTechnicalExpertise()));
		
		for(String tech:cans.keySet()) {
			System.out.println(tech+""+cans.get(tech).size());
		}
		
	}

}
