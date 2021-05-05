package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiveAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		  try {
	            return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
	                    customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),
	                    customer.dateOfBirth.getYear());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return  false;
	
			
	}

}
