package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {


	@Override
	public boolean checkIfRealPerson(Customer customer) {
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			try {
				return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName() , customer.getFirstName(),((Object) customer.getDateOfBirth()).getYear());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			}return false;
	}
}
