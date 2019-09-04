package com.allstates.training.pojos;

public class Candidate implements Comparable<Candidate> {

	public Candidate(String name, String technicalExpertise, String city, int yearsOfExperience) {
		super();
		this.name = name;
		this.technicalExpertise = technicalExpertise;
		this.city = city;
		this.yearsOfExperience = yearsOfExperience;
	}
	private String name;
	private String technicalExpertise;
	private String city;
	private int yearsOfExperience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicalExpertise() {
		return technicalExpertise;
	}
	public void setTechnicalExpertise(String technicalExpertise) {
		this.technicalExpertise = technicalExpertise;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((technicalExpertise == null) ? 0 : technicalExpertise.hashCode());
		result = prime * result + yearsOfExperience;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (technicalExpertise == null) {
			if (other.technicalExpertise != null)
				return false;
		} else if (!technicalExpertise.equals(other.technicalExpertise))
			return false;
		if (yearsOfExperience != other.yearsOfExperience)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", technicalExpertise=" + technicalExpertise + ", city=" + city
				+ ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	@Override
	public int compareTo(Candidate o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
