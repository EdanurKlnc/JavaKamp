package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager (ICustomerCheckService customerCheckService)
	{
		_customerCheckService = customerCheckService ;
	}
	

	public void Save(Customer customer) {
		
		if (_customerCheckService.CheckIfRealPerson(customer))
		{
			
			System.out.println(customer);
		
		}else
		{
			System.out.println("Geçerli bir kisi degil");
		}
	
    } 
}
