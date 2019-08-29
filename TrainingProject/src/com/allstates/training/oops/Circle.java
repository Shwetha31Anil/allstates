package com.allstates.training.oops;

public class Circle implements Shape{
	private int r;
	public Circle(int r){
		this.r=r;
	}
	@Override
	public double area() {
		
		return PI*r*r;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + r;
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r)
			return false;
		return true;
	}
	

}
