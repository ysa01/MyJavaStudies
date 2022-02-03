package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new EmailLogger(), new DatabaseLogger(), new SmsLogger()};
		CustomerService customerService = new CustomerService(loggers);
		Customer customer = new Customer(1,"Yavuz Selim","AYDIN");
		customerService.add(customer);

	}

} 
