package interfaces;

public class CustomerService {
	private Logger[] loggers;
	
	public CustomerService(Logger[] loggers) {
		this.loggers=loggers;
		}
	
	public void add(Customer customer) {
		System.out.println("M��teri Eklendi. " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi."+ customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		}
	}

