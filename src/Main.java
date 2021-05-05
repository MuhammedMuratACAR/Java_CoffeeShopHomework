import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiveAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiveAdapter());
		customerManager.save(new Customer(1,"Muhammed Murat","Acar",LocalDate.of(1996,8,2),"12312312312"));
		
	}

}
