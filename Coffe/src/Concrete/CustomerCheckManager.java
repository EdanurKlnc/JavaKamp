package Concrete;

import Entities.Customer;

public class CustomerCheckManager extends ICustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) {
		
		 return true;
	}
}
