package com.sunbeam;

import java.io.Serializable;

/* The Vehicle class implements the Serializable interface, 
which means objects of this class can be converted into a stream of bytes and stored in a file or sent over a network */

public class Vehicle implements Serializable
{
	private static final long serialVersionUID = 1L;
	/*  The class has three instance variables: company, model and number, 
	all of type String. These variables represent the company name, model name, and vehicle number of a vehicle, respectively */
	
	public String company;
	public String model;
	public String number;
	
	/* The equals method is used to compare two Vehicle objects for equality based on their company, model and number attributes */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	/* getter and setter methods for the company, model and number attributes, 
	to allow access and modification of these attributes outside the class. */
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getNumber() {
		return number;
	}
	
	/* The hashCode method generates a hash code for a Vehicle object based on its company, model and number attributes. 
	This method is used in hash-based collections like HashMap */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	/* The toString method returns a String representation of a Vehicle object, including its company, model and number attributes  */
	
	@Override
	public String toString() {
		return "Vehicle [company=" + company + ", model=" + model + ", number="
				+ number + "]";
	}
}