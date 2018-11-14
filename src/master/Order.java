package master;

import java.io.IOException;
import java.io.PrintWriter;

public class Order {
	static MakeOrder textField23 = new MakeOrder();
	static MakeOrder textField_123 = new MakeOrder();
	static MakeOrder textField_223 = new MakeOrder();
	static MakeOrder textField_323 = new MakeOrder();
	static MakeOrder textField_423 = new MakeOrder();
	
	public static void CreateNewOrder() throws IOException
	{
		PrintWriter writer = new PrintWriter("OrderFile");
		writer.println("Item: " + textField23);
		writer.println("Amount: " + textField_123);
		writer.println("User ID: " + textField_223);
		writer.println("Shipping Address: " + textField_323);
		writer.println("Cost: " + textField_423);
		writer.close();
	}

}
