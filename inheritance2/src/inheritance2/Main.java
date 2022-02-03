package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		customerService.add(new FileLogger());
		}

}
