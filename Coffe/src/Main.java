import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {
public static void main (String[] args ) 
  
{
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter); 
	
    Customer customer = new Customer ();
	customerManager.Save(new Customer());

	
	System.out.println();
}
 
}

