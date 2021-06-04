package Entities;

import Abstract.Entity;
import jdk.internal.net.http.frame.DataFrame;

public class Customer implements Entity{
	public int Id;
	public String FirstName;
	public String LastName;
	public DataFrame DateOfBirth;
	public String NationalityId;
	
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}


}
