package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public Customer Save;

	@Override
	public   void Save(Customer customer) {
   System.out.println("Saved to db : " + customer.FirstName)	;	
	}

}
