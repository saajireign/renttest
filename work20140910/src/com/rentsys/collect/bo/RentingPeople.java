package com.rentsys.collect.bo;

import java.io.Serializable;

public class RentingPeople extends Renter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4012426033956177590L;
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "RentingPeople [person=" + person + "]";
	}
	public RentingPeople(){
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentingPeople other = (RentingPeople) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
	
}
