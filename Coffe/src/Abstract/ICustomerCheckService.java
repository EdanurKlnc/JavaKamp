package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {

	public default boolean CheckIfRealPerson(Customer customer) //Müþterinin gerçek olup olmadýðýný kontrol etme
	{
		return false;
	  
	}

	boolean checkIfRealPerson(Customer customer);
}
