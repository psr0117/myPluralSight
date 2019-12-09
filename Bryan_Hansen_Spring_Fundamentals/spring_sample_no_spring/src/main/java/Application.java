import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService custService = new CustomerServiceImpl();
		System.out.println(custService.findAll().get(0).getFirstName());
	}

}
