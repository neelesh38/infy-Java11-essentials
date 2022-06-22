class Pizzaa {

    //Attributes
    int price; 
	String size;
	int quantity;
	
	//Constructor
	Pizzaa (String size, int quantity){ 
		this.size = size;
		this.quantity = quantity;
		
		if(this.size.equals("Regular"))
			this.price = 100;
		else if(this.size.equals("Medium"))
			this.price = 250;
		else
			this.price = 390;
	}
	
	//Method
	public float calculateTotalPrice(Pizzaa[] pizzaOrdered) {
		int totalPrice = 0;
		for (Pizzaa pizza : pizzaOrdered) {
			totalPrice += pizza.price * pizza.quantity;
		}
		return 0.95f*totalPrice;
	}
	
}

class Pizza {
	
	public static void main(String[] args) {
		Pizzaa p1 = new Pizzaa("Medium",4);
		Pizzaa p2 = new Pizzaa("Large", 2);
		Pizzaa[] pizzaOrdered = {p1, p2};
		float totalCost = p1.calculateTotalPrice(pizzaOrdered);
		System.out.println("Your order is ready! Your bill amount is: "+totalCost);
	}
}