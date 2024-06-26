package com.sunbeam;
import java.io.Serializable;

public class SparePart implements Serializable
{
	/*SparePart class has two instance variables: desc (description of the spare part) and rate (cost of the spare part)  */
	
	private static final long serialVersionUID = 1L;
	public String desc;
	public double rate;
	
	/* This SparePart class has a constructor that initializes the desc and rate variables. 
	It also overrides the equals, hashCode and toString methods inherited from the Object class */
	
	public SparePart(String desc, double rate) {
		super();
		this.desc = desc;
		this.rate = rate;
	}
	
	/* The equals method is used to compare two SparePart objects for equality. 
	It first checks if the two objects are the same instance, then it compares the class types and the values of the desc and rate variables */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparePart other = (SparePart) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		return true;
	}
	public String getDesc() {
		return desc;
	}
	public double getRate() {
		return rate;
	}
	
	/* The hashCode method generates a unique hash code for each SparePart object based on the desc and rate variables. 
	   It uses the prime number 31 to calculate the hash code */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	// The toString method returns a string representation of the SparePart object, including the values of the desc and rate variables.
	
	@Override
	public String toString() {
		return "SparePart [desc=" + desc + ", rate=" + rate + "]";
	}
}
