import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService custService = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService custService = appContext.getBean("myCustomerService", CustomerService.class);
		System.out.println(custService.findAll().get(0).getFirstName());
	}

}
