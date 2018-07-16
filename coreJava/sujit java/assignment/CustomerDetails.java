class Customer
{
	int customer_ID, age, product_prize, quantity, total;
	String name, product_name;

	void insertCustDetail(int customer_ID, String name, int age)
	{
		this.customer_ID=customer_ID;
		this.name=name;
		this.age=age;

	}
	void customerDisplay()
	{
		System.out.println("Customer_ID = "+customer_ID+"Name = "+name+"Age = "+age);
	}
	void insertProductDetail(int product_prize, String product_name, int quantity)
	{
		this.product_prize=product_prize;
		this.product_name=product_name;
		this.quantity=quantity;

	}
	void productDisplay()
	{
		System.out.println("Product_prize = "+product_prize+"Product Name = "+product_name+"Quantity = "+quantity);
	}
	void total()
	{
		total=product_prize*quantity;
		System.out.println("Total = "+total);
	}

}

class CustomerDetails
{
	public static void main(String args[])
	{
		Customer c1 = new Customer();
		System.out.println("Personal Details");
		c1.insertCustDetail(4512, "Sujit", 19 );
		c1.customerDisplay();
		System.out.println("------------------");
		System.out.println("Product Details");
		c1.insertProductDetail(4546, "Computer", 25000 );
		c1.productDisplay();
		System.out.println("------------------");
		System.out.println("Total");
		c1.total();

	}

}