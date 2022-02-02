package inheritance;

public class CustomerService {
	public void add(Customer customer) {}
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers)
		{
			add(customer);
		}
	}
}
