package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {

	public default boolean CheckIfRealPerson(Customer customer) //M��terinin ger�ek olup olmad���n� kontrol etme
	{
		return false;
	  
	}

	boolean checkIfRealPerson(Customer customer);
}
