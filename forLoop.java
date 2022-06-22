
public class forLoop {
	public static void main(String[] args) {
		// The below code generates customerId
		int totalNoOfCustomers = 12;
		String customerId = "";
		/*for (int counter = 1; counter <= totalNoOfCustomers; counter++) {
			if (counter <= 9)
				customerId = "C0" + counter;
			else
				customerId = "C" + counter;
			System.out.println("Customer Id for customer " + counter + " is "
					+ customerId);
		}
		*/
		// Uncomment the below given code and execute it instead of above for loop
		// for understanding the usage of var in a for loop
		
		for (var counter = 1; counter <= totalNoOfCustomers; counter++) {
			if (counter <= 9)
				customerId = "C0" + counter;
			else
				customerId = "C" + counter;
			System.out.println("Customer Id for customer " + counter + " is "
					+ customerId);
		}
		
		// The local variable used in the for loop is declared using var
		// type of that variable will be inferred based on the value initialized
	}

}
